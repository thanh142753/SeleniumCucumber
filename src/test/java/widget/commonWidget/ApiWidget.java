package widget.commonWidget;

import groovy.xml.StreamingDOMBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.GlobalVariables;

import static io.restassured.RestAssured.given;

public class ApiWidget extends BaseWidget implements IApiWidget {

    public Response sendGetRequest(String url) {
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .then()
                .extract().response();
    }

    @Override
    public void getValueOfKeyFromRequest(String key, String endPoint) {
        Response response = sendGetRequest(endPoint);

        Assert.assertEquals(200, response.statusCode());
        GlobalVariables.key = response.jsonPath().getString("key");
    }

    @Override
    public void verifyTheGetRequestWithTheParameter(String endPoint, String parameter) {
        Response response = given()
                .contentType(ContentType.JSON)
                .param(parameter, GlobalVariables.key)
                .when()
                .get(endPoint)
                .then()
                .extract().response();
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(GlobalVariables.key, response.jsonPath().getString("key"));
    }


}
