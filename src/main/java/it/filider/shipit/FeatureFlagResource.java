package it.filider.shipit;

import it.filider.shipit.models.FeatureFlag;
import it.filider.shipit.services.FeatureFlagService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/feature-flags")
public class FeatureFlagResource {

    private final FeatureFlagService featureFlagService;

    @Inject
    public FeatureFlagResource(FeatureFlagService featureFlagService) {
        this.featureFlagService = featureFlagService;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addFlag(FeatureFlagCreationRequest request) {
        featureFlagService.insertFeatureFlag(request.name(), request.enabled());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<FeatureFlag> fetchAllFlags() {
        return featureFlagService.fetchAllFlags();
    }
}