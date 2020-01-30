package httpRequest;

import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;

import java.io.IOException;

public class AbonneRequest {
    public static String body = "{\n" +
            "\"name\":\"grech\",   \n" +
            " \"Contrat\": [\n" +
            "      {\n" +
            "        \"id\": \"1\",\n" +
            "        \"Type\": \"FACE\",\n" +
            "       \"adresse\" : {\n" +
            "           \"active\":\"inactive\",\n" +
            "           \"pays\":\"France\",\n" +
            "           \"condition\":\"\"\n" +
            "       }\n" +
            "      },\n" +
            "  {\n" +
            "        \"id\": \"2\",\n" +
            "        \"Type\": \"FACE\",\n" +
            "       \"adresse\" : {\n" +
            "           \"active\":\"inactive\",\n" +
            "           \"pays\":\"France\",\n" +
            "           \"condition\":\"\"\n" +
            "       }\n" +
            "      }]}";

    public static HttpResponse postAbonné() {
        HttpPost request = new HttpPost("localhost:1080/abonne");
        System.out.println(body);
        request.setEntity(new StringEntity(body, ContentType.APPLICATION_JSON));
        //HttpClient client = authenticatedClient();
        HttpResponse response = null;
        try {
            response = HttpClientBuilder.create().build().execute(request);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;

    }
}