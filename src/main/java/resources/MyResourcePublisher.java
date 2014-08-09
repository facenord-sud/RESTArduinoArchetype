/**
 * Created by Apache CXF WadlToJava code generator
**/
package resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.slf4j.LoggerFactory;

@Path("/my-resource/pub")
public class MyResourcePublisher {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(MyResourcePublisher.class);
    
//    @GET
//    @Produces({"application/xml", "application/json", "text/xml" })
//    public Response getMyResourceClientsListResourceXML() {
//        //TODO: implement
//        return null;
//    }
//
//    @PUT
//    @Consumes({"application/xml", "application/json"})
//    @Produces({"application/xml", "application/json", "text/xml" })
//    @Path("/{uri: [a-zA-Z0-9_.:\\-/]+}")
//    public Response putMyResourceClientResourceXML(Client client, @PathParam("uri") String uri) {
//        // Register or modifiy a client to send event to
//        //TODO: implement
//        return null;
//    }
//
//    @GET
//    @Produces({"application/xml", "application/json", "text/xml" })
//    @Path("/{uri: [a-zA-Z0-9_.:\\-/]+}")
//    public Response getMyResourceClientResourceXML(@PathParam("uri") String uri) {
//        // get infos about a specific client
//        //TODO: implement
//        return null;
//    }
//
//    @DELETE
//    @Produces({"application/xml", "application/json", "text/xml" })
//    @Path("/{uri: [a-zA-Z0-9_.:\\-/]+}")
//    public Response deleteMyResourceClientResourceXML(@PathParam("uri") String uri) {
//        // unregister a client. The specified client will any more recieve notifications
//        //TODO: implement
//        return null;
//    }

}