package mapper;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Abonne;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.mockserver.model.HttpResponse;


import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static mockServer.MockServerRequest.*;


public class AbonneMapper {

    public static ArrayList<Abonne> getAbonneList(String active, String pays, String body) throws Exception {

        HttpResponse response;
        response = getAbonne(active, pays, body);


            return readList(body);

    }
    public static ArrayList<Abonne> readList(String body) throws IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return mapper.reader()
                .forType(new TypeReference<List<Abonne>>() {
                })
                .readValue(body);
    }


}
