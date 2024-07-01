package modulos;


import dataFactory.UsuarioDataFactory;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pojo.UsuarioPojo;

import java.io.File;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


@DisplayName("API Upload")
public class ProdutoTeste {
    private String token;

    @BeforeEach
    public void beforEach() {
        baseURI = "http://www.advantageonlineshopping.com";



         this.token = given()
                .baseUri(baseURI)
                .basePath("/accountservice")
                .contentType(ContentType.JSON)
                .body(UsuarioDataFactory.obterTokenDoUsuarioAposLogin())
                .when()
                .post("/accountrest/api/v1/login")
                .then()
                .extract()
                .path("statusMessage.token");
    }

    @Test
    @DisplayName("Testar atualização de imagem do produto")
    public void testAtualizarImagemDoProduto(){

        given()
                .baseUri(baseURI)
                .basePath("/catalog")
                .header("Authorization","Bearer " + token)
                .pathParam("userId", 895002665)
                .pathParam("color", "black")
                .queryParam("product_id", 10)
                .multiPart("file", new File("src/test/resources/img.jpg"))
        .when()
                .post("/api/v1/product/image/{userId}/{color}")
        .then()
                .assertThat()
                    .body("reason", equalTo("Product was updated successful"))
                        .statusCode(200);
    }
}
