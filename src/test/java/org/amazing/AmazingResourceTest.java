package org.amazing;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.common.mapper.TypeRef;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class AmazingResourceTest
{

    @Test
    public void testAmazingEndpoint() {
        AmazingResponse amazingResponse = given()
          .when().get("/amazing?name=Tsvetan Tsvetkov")
          .then()
             .statusCode(200).extract().body().as( new TypeRef<>()
                {
                } );
        System.out.println(amazingResponse);
        assertEquals( true, amazingResponse.isPersonAmazing() );

    }

}