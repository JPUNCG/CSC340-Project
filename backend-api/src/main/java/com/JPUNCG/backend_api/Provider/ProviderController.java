package com.JPUNCG.backend_api.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/providers")
public class ProviderController {

    @Autowired
    private ProviderService providerService;

    @GetMapping
    public List<Provider> getAllProviders() {
        return providerService.getAllProviders();
    }

    @PostMapping
    public Provider createProvider(@RequestBody Provider provider) {
        return providerService.createProvider(provider);
    }

    @PostMapping("/login")
    public Object login(@RequestBody Provider provider) {
        Provider found = providerService.getProviderByUsernameAndPassword(provider.getUsername(), provider.getPassword());
        if (found != null) {
            return found;
        } else {
            return "Login failed";
        }
    }


    @DeleteMapping("/{id}")
    public void deleteProvider(@PathVariable Long id) {
        providerService.deleteProvider(id);
    }
}
