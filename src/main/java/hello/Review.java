package hello;

import java.util.Date;

public class Review {

    private final String userId;
    private final String productId;
    private final int score;
    private final Date time;

    public Review(String userId, String productId, int score, Date time) {
        this.userId = userId;
        this.productId = productId;
        this.score = score;
        this.time = time;
    }

    public String getUserId() {
        return userId;
    }

    public String getProductId() {
        return productId;
    }

    public int getScore() {
        return score;
    }

    public Date getTime() {
        return time;
    }

}
