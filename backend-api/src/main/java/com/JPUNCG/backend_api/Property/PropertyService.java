package com.JPUNCG.backend_api.Property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public List<Property> getAllPropertys() {
        return propertyRepository.findAll();
    }
    
    public List<Property> getPropertiesByProviderId(Long providerId) {
        return propertyRepository.findByProviderId(providerId);
    }

    public Property createProperty(Property property) {
        return propertyRepository.save(property);
    }

    public Property getPropertyById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }

    public List<Property> getFilteredProperties(Integer minPrice, Integer maxPrice, Integer minSqft, Integer maxSqft) {
        int minP = (minPrice != null) ? minPrice : 0;
        int maxP = (maxPrice != null) ? maxPrice : Integer.MAX_VALUE;
        int minS = (minSqft != null) ? minSqft : 0;
        int maxS = (maxSqft != null) ? maxSqft : Integer.MAX_VALUE;
        return propertyRepository.findByPriceBetweenAndSqftBetween(minP, maxP, minS, maxS);
    }
    
    public Property updateProperty(Long id, Property propertyDetails) {
        Property property = propertyRepository.findById(id).orElse(null);
        if (property != null) {
            property.setImages(propertyDetails.getImages());
            property.setDescription(propertyDetails.getDescription());
            property.setTags(propertyDetails.getTags());
            property.setPrice(propertyDetails.getPrice()); // Update price
            property.setSqft(propertyDetails.getSqft());   // Update sqft
            return propertyRepository.save(property);
        }
        return null;
    }

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
