package com.JPUNCG.backend_api.Provider;

import com.JPUNCG.backend_api.Property.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Autowired
    private ProviderService providerService;
    
    @Autowired
    private PropertyService propertyService;

    @GetMapping("/home/{id}")
    public String getProviderHome(@PathVariable Long id, Model model) {
        model.addAttribute("provider", providerService.getProviderById(id));
        return "provider_home";
    }

    @GetMapping("/profile/{id}")
    public String getProviderProfile(@PathVariable Long id, Model model) {
        model.addAttribute("provider", providerService.getProviderById(id));
        model.addAttribute("properties", propertyService.getPropertiesByProviderId(id));
        return "provider_profile";
    }
}