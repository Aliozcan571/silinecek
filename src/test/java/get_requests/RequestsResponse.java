package get_requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;


public class RequestsResponse {
    /*
        1) Manuel testler için Postman kulllanacağız
        2) API Otomasyon testleri için Rest Assured Kütüphanesini kulllanacağız
        3) Otomasyon kodları yazarken şu adımları takip edeceğiz:
            a) Gereksinimleri anlama
            b) Test senaryoları yazma
            b) Test senaryoları yazılırken Gherkin dili kullanacağız:
                Given : Önkoşullar: -----> Endpoint(url) , body, ....
                When: İşlemler: -----> get(), post() ,Put(), Delete() ...
                Then: Doğrulamalar: Assertion, Close...
                And: Çoklu durumları birbirine bağlamakta kullanılır

        4) Otomasyon testi yazarken aşağıdaki adımları izleyebiliriz:
            i) Set the Url
            ii) Set the expected data
            iii) Send the request and get the response
            iv) Do assertion

     */

    public static void main(String[] args) {

        // i) Url kurulacak
        String url = "https://petstore.swagger.io/v2/pet/5";

        // Base Url : https://petstore.swagger.io/v2
        // 1. path parametresi : /pet
        // 2. path parametresi : /5

        //ii) Beklenen data belirlenecek -----> şimdilik atlayacağız
        //iii) Request gönderilip Response alınacak
        Response response =  given().when().get(url);
        //response.prettyPrint();

        // Status code'a nasıl ulaşılır / yazdırılır:
        System.out.println("statusCode = " + response.statusCode());
        System.out.println("----------------------------------");

        // Status Line'a nasıl ulaşılır / yazdırılır:
        System.out.println("statusLine = "+ response.statusLine());
        System.out.println("----------------------------------");

        // ContentType' nasıl ulaşılır
        System.out.println("contentType = "+ response.contentType());
        System.out.println("----------------------------------");

        // Header değerlerine nasıl ulaşılır:
        System.out.println("Server = "+ response.header("Server"));
        System.out.println("Date = " + response.header("Date"));
        System.out.println("----------------------------------");

        // Bütün headerlar nasıl alınır:
        System.out.println(response.headers());
        System.out.println("----------------------------------");

        // Response süresi ni çağırma:
        System.out.println(response.time());
        System.out.println("----------------------------------");


    }

}
