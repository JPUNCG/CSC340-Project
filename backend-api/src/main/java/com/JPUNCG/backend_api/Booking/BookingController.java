package com.JPUNCG.backend_api.Booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    // Updated to accept both propertyId and renterId
    @GetMapping("/checkout/property/{propertyId}/renter/{renterId}")
    public String checkout(@PathVariable Long propertyId, @PathVariable Long renterId, Model model) {
        // Create the booking with the correct renterId
        Booking booking = new Booking(renterId, propertyId, "2025-06-12", "2 nights", "Confirmed", null);
        bookingService.createBooking(booking);
        
        // Add renterId to the model for the "Back to Home" button
        model.addAttribute("renterId", renterId);
        return "checkout";
    }
}