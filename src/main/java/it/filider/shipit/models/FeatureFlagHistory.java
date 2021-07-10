package it.filider.shipit.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FeatureFlagHistory {

    private String name;

    private final List<FeatureFlagHistoryEntry> featureFlagHistoryEntries; // todo this should just be a list of flag value and when it was changed, previous value, new value, zoned date timestamp

    public FeatureFlagHistory(@JsonProperty("flags") List<FeatureFlagHistoryEntry> featureFlagHistoryEntries) {
        this.featureFlagHistoryEntries = featureFlagHistoryEntries;
    }
}
