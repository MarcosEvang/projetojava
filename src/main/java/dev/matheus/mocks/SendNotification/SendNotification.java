package dev.matheus.mocks.SendNotification;

import dev.matheus.dtos.requests.RequestSendNotification;
import dev.matheus.dtos.responses.ResponseSendNotification;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/api/v1/notify")
@RegisterRestClient(configKey = "mock-api")
public interface SendNotification {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    ResponseSendNotification sendNotification(RequestSendNotification requestSendNotification);
}
