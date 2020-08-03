package com.example.otustestframworks;
import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured.*;
import io.restassured.mapper.TypeRef;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;

import org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class RestAssuredTests {

    @Test
    public void checkCity() {
        Response response =  given().param("q", "Berlin").param("appid", "184bca66da20c34ed08eac760ef30bc9")
                .when().get("http://api.openweathermap.org/data/2.5/weather")
                .then()
                .statusCode(200).log().body().extract().response();

        String stringResp = response.asString();


        Assert.assertTrue("Is Berlin?", stringResp.contains("Berlin"));

    }

    @Test
    public void checkTemper() {

        Response response =  given().param("q", "Berlin").param("appid", "184bca66da20c34ed08eac760ef30bc9")
                .when().get("http://api.openweathermap.org/data/2.5/weather")
                .then()
                .statusCode(200).log().body().extract().response();

        Map<String, Object> main = response.jsonPath().getMap("main");
        float ferengate = (float)main.get("temp");
        float celcius = (ferengate - 273.15f);

        Assert.assertFalse(celcius > 50);
    }
}
