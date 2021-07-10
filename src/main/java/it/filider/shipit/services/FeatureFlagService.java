package it.filider.shipit.services;

import it.filider.shipit.models.FeatureFlag;
import it.filider.shipit.storage.FeatureFlagStorage;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Singleton
public class FeatureFlagService {

    private final Map<String, Boolean> featureFlags;
    private final FeatureFlagStorage storage;

    @Inject
    public FeatureFlagService(FeatureFlagStorage storage) {
        this.storage = storage;
        this.featureFlags = new HashMap<>();
    }

    public void insertFeatureFlag(String name, Boolean isEnabled) {
        featureFlags.put(name, isEnabled);
    }

    public Optional<FeatureFlag> getFeatureFlag(String name) {
        return Optional.of(featureFlags.get(name)).map(value -> new FeatureFlag(name, value));
    }

    public List<FeatureFlag> fetchAllFlags() {
        return featureFlags.entrySet().stream().map(entry -> new FeatureFlag(entry.getKey(), entry.getValue())).toList();
    }
}
