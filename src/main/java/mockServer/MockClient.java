package mockServer;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockserver.integration.ClientAndServer;
import org.mockserver.logging.MockServerLogger;
import org.mockserver.socket.PortFactory;
import org.mockserver.socket.tls.KeyStoreFactory;

import javax.net.ssl.HttpsURLConnection;

public class MockClient  {
    public static ClientAndServer mockServer;

    @BeforeClass
    public static ClientAndServer startMockServer() {
        // ensure all connection using HTTPS will use the SSL context defined by
        // MockServer to allow dynamically generated certificates to be accepted
       /* HttpsURLConnection.setDefaultSSLSocketFactory(new KeyStoreFactory(new MockServerLogger()).sslContext().getSocketFactory());
        mockServer = ClientAndServer.startClientAndServer(PortFactory.findFreePort());*/
       return mockServer = ClientAndServer.startClientAndServer(1080);
    }

    @AfterClass
    public static void stopMockServer() {
        mockServer.stop();
    }

}
