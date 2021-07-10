package it.filider.shipit.storage;

import com.mongodb.client.MongoClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FeatureFlagStorage {

    private final MongoClient mongoClient;

    @Inject
    public FeatureFlagStorage(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }


}
