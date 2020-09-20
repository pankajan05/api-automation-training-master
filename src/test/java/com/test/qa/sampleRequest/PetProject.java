package com.test.qa.sampleRequest;

import com.test.qa.utils.Constants;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import com.test.qa.utils.APIUtils;
import org.testng.asserts.SoftAssert;


import static io.restassured.RestAssured.*;

public class PetProject {

    @Test(priority = 1, groups = { "regression"})
    public void testResponseCode(){
        SoftAssert softAssert = new SoftAssert();
        Response response = get(Constants.BASE_URL_WEATHER+Constants.ENDPOINT_WEATHER+Constants.QUERY_PARAMETER);
        softAssert.assertEquals(response.getStatusCode(), 200, Constants.INVALID_CODE_TEXT);
        APIUtils.printResults(response);
        softAssert.assertAll();
    }

    @Test(priority = 2, groups = { "regression", "smoke"})
    public void testPostRequest(){
        SoftAssert softAssert = new SoftAssert();
        String body = APIUtils.readBody(Constants.BODY_PATH + "petpost.json");
        Response response = given().header(Constants.HEADER_CONTENT_TYPE,
                Constants.HEADER_CONTENT_VAL_JSON).body(body).when().post(Constants.BASE_URL_PETSTORE +Constants.ENDPOINT_PET);
        softAssert.assertEquals(response.getStatusCode(), 200, Constants.INVALID_CODE_TEXT);
        APIUtils.printResults(response);
        softAssert.assertAll();
    }

    @Test(priority = 3)
    public void testGetRequest(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Get Request
        //Todo - Assert Response Status Code
        //Todo - Assert Response Body
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void testPutRequest(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Put RequestGet
        //Todo - Assert Response Status Code
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 5)
    public void testGetRequestForUpdatedData(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Get Request
        //Todo - Assert Response Status Code
        //Todo - Assert Response Body
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 6)
    public void testDeleteRequest(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Delete RequestGet
        //Todo - Assert Response Status Code
        //Todo - Print Response
        softAssert.assertAll();
    }

    @Test(priority = 7)
    public void testGetRequestForDeletedData(){
        SoftAssert softAssert = new SoftAssert();
        //Todo - Send Get RequestGet
        //Todo - Assert Response Status Code
        //Todo - Print Response
        softAssert.assertAll();
    }
}
