package it.filider.shipit.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FeatureFlag(String name, boolean enabled) {

    public FeatureFlag(
            @JsonProperty("name") String name,
            @JsonProperty("enabled") boolean enabled
    ) {
        this.name = name;
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public boolean isEnabled() {
        return enabled;
    }
}
