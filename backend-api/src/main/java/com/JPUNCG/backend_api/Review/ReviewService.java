package com.JPUNCG.backend_api.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public List<Review> getReviewsByRenterId(Long renterId) {
        return reviewRepository.findByRenterId(renterId);
    }

    public List<Review> getReviewsByPropertyId(Long propertyId) {
        return reviewRepository.findByPropertyId(propertyId);
    }

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public void deleteReview(Long id) {
        reviewRepository.deleteById(id);
    }
}
