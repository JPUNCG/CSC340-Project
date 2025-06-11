package com.JPUNCG.backend_api.Renter;

import com.JPUNCG.backend_api.Booking.BookingService; // Import BookingService
import com.JPUNCG.backend_api.Property.PropertyService;
import com.JPUNCG.backend_api.Review.ReviewService; // Import ReviewService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/renter")
public class RenterController {

    @Autowired
    private RenterService renterService;

    @Autowired
    private PropertyService propertyService;

    @Autowired
    private BookingService bookingService;

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/home/{id}")
    public String getRenterHome(
            @PathVariable Long id, Model model,
            @RequestParam(required = false) Integer minPrice,
            @RequestParam(required = false) Integer maxPrice,
            @RequestParam(required = false) Integer minSqft,
            @RequestParam(required = false) Integer maxSqft
    ) {
        model.addAttribute("renter", renterService.getRenterById(id));
        model.addAttribute("properties", propertyService.getFilteredProperties(minPrice, maxPrice, minSqft, maxSqft));
        return "renter_home";
    }

    @GetMapping("/profile/{id}")
    public String getRenterProfile(@PathVariable Long id, Model model) {
        model.addAttribute("renter", renterService.getRenterById(id));
        model.addAttribute("bookings", bookingService.getBookingsByRenterId(id));
        model.addAttribute("reviews", reviewService.getReviewsByRenterId(id));
        return "renter_profile";
    }
}