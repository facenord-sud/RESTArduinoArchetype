/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diuf.unifr.ch.xwot.caramel.resources;

import com.sun.jersey.api.client.WebResource;
import diuf.unifr.ch.first.xwot.rxtx.notifications.AbstractClient;
import diuf.unifr.ch.first.xwot.rxtx.test.utils.TestHelpers;
import javax.ws.rs.core.MediaType;
import org.junit.Test;

/**
 *
 * @author leo
 */
public class MyPublisheresourceITCase extends TestHelpers {
    
    @Test
    public void stupidTest() {
        assertResponseContains("", "");
    }

//    @Test
//    public void testGetClients() {
//        String uri = registerClient();
//        WebResource ws = getClient("/my-resource/pub");
//        String result = ws.accept(MediaType.APPLICATION_XML).get(String.class);
//        assertResponseContains(result, "<uri>" + uri);
//    }
//
//    @Test
//    public void testPutClient() {
//        registerClient();
//    }
//
//    @Test
//    public void testGetClient() {
//        String uri = registerClient();
//        WebResource ws = getClient("/my-resource/pub/" + uri);
//        String result = ws.accept(MediaType.APPLICATION_XML).get(String.class);
//        assertResponseContains(result, "<uri>" + uri);
//    }
//
//    @Test
//    public void testDeleteClient() {
//        registerClient();
//        String uri = registerClient();
//        WebResource ws = getClient("/my-resource/pub/" + uri);
//        String result = ws.accept(MediaType.APPLICATION_XML).delete(String.class);
//        assertResponseContains(result, "<uri>" + uri);
//        String empty = ws.accept(MediaType.APPLICATION_XML).get(String.class);
//        assertResponseContains(empty, "");
//    }
//
//    private String registerClient() {
//        String uri = "http://localhost:4556/";
//        WebResource ws = getClient("/my-resource/pub/" + uri);
//        Client clientUri = new Client();
//
//        String result = ws.accept(MediaType.APPLICATION_XML).entity(clientUri).put(String.class);
//        assertResponseContains(result, "<uri>" + uri);
//        return uri;
//    }
//
//    class Client extends AbstractClient {
//
//        @Override
//        public String getUri() {
//            return "";
//        }
//    }
}
