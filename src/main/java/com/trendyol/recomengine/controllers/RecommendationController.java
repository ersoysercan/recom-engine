package com.trendyol.recomengine.controllers;

import com.trendyol.recomengine.resource.Recommendation;
import org.springframework.web.bind.annotation.*;

@RestController
public class RecommendationController {

    @GetMapping("/users/{userId}/recommendations")
    public Recommendation recommend(@PathVariable String userId) {
        return new Recommendation(userId, new String[]{"4", "6", "2"});
    }

}
