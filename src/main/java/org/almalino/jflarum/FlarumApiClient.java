package org.almalino.jflarum;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * @author Alexei Malinovski
 */

public interface CraneworksApiClient {
    @GET
    @Path("languages")
    @Produces(APPLICATION_JSON)
    List<CraneworksLanguageDto> getLanguages();
}
