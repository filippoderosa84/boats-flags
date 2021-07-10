package it.filider.shipit;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record FeatureFlagCreationRequest(@NotEmpty @NotNull String name, @NotNull Boolean enabled) {

    public FeatureFlagCreationRequest(
            @JsonProperty("name") String name,
            @JsonProperty("enabled") Boolean enabled) {
        this.name = name;
        this.enabled = enabled;
    }
}
