package edu.miu.cs.cs425.swe_online_market_project.service;

import edu.miu.cs.cs425.swe_online_market_project.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();

    Review getReviewById(long id);

    Review saveReview(Review review);

    Review updateReview(long id, Review review);

    void deleteReviewById(long id);
}
