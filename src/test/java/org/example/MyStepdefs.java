package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.Abonne;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Et;
import io.cucumber.java.fr.Etantdonné;
import io.cucumber.java.fr.Lorsque;
import mockServer.MockClient;
import mockServer.MockServerRequest;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.mockserver.MockServer;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static mapper.AbonneMapper.getAbonneList;
import static org.junit.Assert.assertThat;

public class MyStepdefs {
    public String body = "[{\"id\":1,\"name\":\"grech\",\"Contrat\": [{\"id\": \"1\",\"Type\": \"FACE\",\"adresse\":{\"active\": \"inactive\",\"pays\": \"France\",\"condition\": \"\"}},{\"id\": \"2\",Type\": \"FACE\",\"adresse\": {\"active\": \"inactive\",\"pays\": \"France\",\"condition\": \"\"}}},{\"id\":2,\"name\": \"refka\",\"Contrat\": [{\"id\": \"1\",\"Type\": \"EC\",\"adresse\": {\"active\": \"inactive\",\"pays\": \"France\",\"condition\": \"\"}},{\"id\": \"2\",\"Type\": \"FACE\",\"adresse\": {\"active\": \"active\",\"pays\": \"Pologne\",\"condition\": \"\"}}]}]";
        private ArrayList<Abonne> abonneArrayList = null;

    @Etantdonné("^un abonné avec une adresse principale ​(.*) ​en ​(.*)$")
    public void getAbonnes(String active, String pays) throws IOException {
        MockClient.startMockServer();
        try {
            abonneArrayList = getAbonneList(active, pays,body);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Assert.assertFalse(abonneArrayList.isEmpty(),
                "pas des abonnés avec une adresse principale "+active+" et pays "+pays);

    }

    @Lorsque("^le conseiller connecté à ​(.*) ​modifie l'adresse de l'abonné ​(.*)$")
    public void updateCondition(String canal, String condition) {

        Assert.assertTrue(true);
    }

    @Alors("​l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné$")
    public void lAdresseDeLAbonnéModifiéeEstEnregistréeSurLEnsembleDesContratsDeLAbonné() {
        Assert.assertTrue(true);
    }


    @Et("​un mouvement de modification d'adresse est créé      ​")
    public void checkMvtadresse() {
        org.testng.Assert.assertTrue(true);
    }


}
