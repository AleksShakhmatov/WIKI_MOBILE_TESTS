package helpers;

import static io.restassured.RestAssured.given;


public class BrowserstackHelpers {

    public static String videoUrl(String sessionId) {

        String url = String.format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic("alexandercoluchy_SJ4pLC", "TqQusARF9UJtArLCdeoL")
                .get(url)
                .then()
                .log().status()
                .log().body()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}