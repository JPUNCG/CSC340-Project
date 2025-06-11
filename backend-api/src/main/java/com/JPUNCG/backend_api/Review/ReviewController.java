package com.JPUNCG.backend_api.Review;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/create")
    public String createReview(Review review, @RequestParam("renterId") Long renterId) {
        reviewService.createReview(review);
        return "redirect:/renter/profile/" + renterId;
    }

    @GetMapping("/delete/{reviewId}/renter/{renterId}")
    public String deleteReview(@PathVariable Long reviewId, @PathVariable Long renterId) {
        reviewService.deleteReview(reviewId);
        return "redirect:/renter/profile/" + renterId;
    }
}