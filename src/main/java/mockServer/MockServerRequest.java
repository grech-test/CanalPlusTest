package mockServer;


import httpRequest.AbonneRequest;
import org.mockito.Mock;
import org.mockserver.model.*;

import java.nio.charset.StandardCharsets;

import static org.mockserver.model.HttpRequest.request;
import static org.mockserver.model.HttpResponse.response;

public class MockServerRequest {



    public static void postAbonnee(String body) {

        MockClient.mockServer
                .when(
                        request()
                                .withMethod("POST")
                                .withPath("/abonnee")
                                .withBody(body)
                )
                .respond(
                        response()
                                .withStatusCode(HttpStatusCode.OK_200.code())
                                .withHeader(Header.header("Content-Type", "application/json"))
                                .withBody(body, StandardCharsets.UTF_8)

                );


    }
public static HttpResponse getAbonne(String active, String pays, String body){
      MockClient.mockServer.when(
            request()
                    .withMethod("GET")
                    .withPath("/abonne")
                    .withQueryStringParameter(Parameter.param("active",active)
                    )
    )
            .respond(
                    response()
                            .withStatusCode(HttpStatusCode.OK_200.code())
                            .withBody(body,StandardCharsets.UTF_8)

            );
      return response().withBody(body);

}


}
