package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class RecommendationController {

    @GetMapping("/user/{userId}/recommendations")
    public Recommendation recommend(@PathVariable String userId) {
        return new Recommendation(userId, null);
    }

}
