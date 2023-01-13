package org.amazing;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/amazing")
public class AmazingResource
{
    @Inject
    AmazingService amazingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public AmazingResponse isPersonAmazing(@QueryParam( "name" ) String name) {
        boolean isPersonAmazing = amazingService.isPersonAmazing(name);
        return new AmazingResponse(isPersonAmazing);
    }
}