package hello;

public class Recommendation {

    private final String userId;
    private final String [] productId;

    public Recommendation(String userId, String [] productId) {
        this.userId = userId;
        this.productId = productId;
    }

    public String getUserId() {
        return userId;
    }

}
