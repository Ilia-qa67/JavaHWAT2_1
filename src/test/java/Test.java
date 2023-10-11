import static io.restassured.RestAssured.given;

public class Test {
    @org.junit.jupiter.api.Test
    public void shouldTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
   /*       .body( --> ваша проверка здесь <-- )*/
        ;
    }

}