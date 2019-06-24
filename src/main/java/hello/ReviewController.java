package hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class ReviewController {

    @PostMapping("/users/{userId}/reviews")
    Review newReview(@RequestBody Review newReview) {

        // send to kafka

        return newReview;
    }

}
