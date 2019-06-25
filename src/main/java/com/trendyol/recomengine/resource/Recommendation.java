package com.trendyol.recomengine.resource;

public class Recommendation {

    private final String userId;
    private final String [] productIds;

    public Recommendation(String userId, String [] productIds) {
        this.userId = userId;
        this.productIds = productIds;
    }

    public String getUserId() {
        return userId;
    }

    public String[] getProductIds() {
        return productIds;
    }
}

