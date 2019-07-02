package com.trendyol.recomengine.repositories;

import java.util.List;
import com.trendyol.recomengine.resource.Recommendation;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RecommendationRepository extends MongoRepository<Recommendation, String> {

    public Recommendation findBy_id(String _id);

}