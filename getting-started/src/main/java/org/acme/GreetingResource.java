package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @Path("/hello")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }

    @Path("/goodbye")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String goodBye() { return "Goodbye quarkus"; }

    @Path("/hello/{username}")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String heelloUser(@PathParam("username") String user) {

        return "Hello " + user;
    }
}
