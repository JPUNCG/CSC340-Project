package com.JPUNCG.backend_api.Property;

import com.JPUNCG.backend_api.Review.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;
    
    @Autowired
    private ReviewService reviewService;

    // Updated to accept renterId to maintain user session
    @GetMapping("/{propertyId}/from/{renterId}")
    public String getPropertyDetails(@PathVariable Long propertyId, @PathVariable Long renterId, Model model) {
        model.addAttribute("property", propertyService.getPropertyById(propertyId));
        model.addAttribute("reviews", reviewService.getReviewsByPropertyId(propertyId));
        model.addAttribute("renterId", renterId); // Pass renterId to the view
        return "property_details";
    }

    @PostMapping("/create")
    public String createProperty(Property property) {
        propertyService.createProperty(property);
        return "redirect:/provider/home/" + property.getProviderId();
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Property property = propertyService.getPropertyById(id);
        model.addAttribute("property", property);
        model.addAttribute("reviews", reviewService.getReviewsByPropertyId(id));
        model.addAttribute("providerId", property.getProviderId()); // Pass providerId for the back button
        return "edit_property";
    }

    @PostMapping("/update/{id}")
    public String updateProperty(@PathVariable Long id, Property property) {
        Property existingProperty = propertyService.getPropertyById(id);
        property.setProviderId(existingProperty.getProviderId());
        propertyService.updateProperty(id, property);
        return "redirect:/provider/profile/" + existingProperty.getProviderId();
    }

    @GetMapping("/delete/{id}")
    public String deleteProperty(@PathVariable Long id) {
        Property property = propertyService.getPropertyById(id);
        Long providerId = property.getProviderId();
        propertyService.deleteProperty(id);
        return "redirect:/provider/profile/" + providerId;
    }
}