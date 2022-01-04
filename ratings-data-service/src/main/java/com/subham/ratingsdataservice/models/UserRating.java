package com.subham.ratingsdataservice.models;

import java.util.List;

/**
 * @author subham.mallick
 * @date: 04/01/22
 */
public class UserRating {

    private List<Rating> userRatings;

    public List<Rating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }
}
