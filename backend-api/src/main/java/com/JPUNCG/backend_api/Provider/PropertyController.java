package com.JPUNCG.backend_api.Property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/properties")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @GetMapping
    public List<Property> getAllPropertys() {
        return propertyService.getAllPropertys();
    }
    
    @GetMapping("/provider/{providerId}")
    public List<Property> getPropertiesByProviderId(@PathVariable Long providerId) {
        return propertyService.getPropertiesByProviderId(providerId);
    }

    @PostMapping
    public Property createProperty(@RequestBody Property property) {
        return propertyService.createProperty(property);
    }

    @DeleteMapping("/{id}")
    public void deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
    }
}
