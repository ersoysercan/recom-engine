package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationController {

    @RequestMapping("/user/{userId}/recommend")
    public Recommendation recommend(@PathVariable String userId) {
        return new Recommendation(userId, null);
    }

}
