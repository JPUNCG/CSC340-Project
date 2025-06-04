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

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
