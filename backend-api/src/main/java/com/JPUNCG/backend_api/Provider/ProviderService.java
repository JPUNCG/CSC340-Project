package com.JPUNCG.backend_api.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public List<Provider> getAllProviders() {
        return providerRepository.findAll();
    }
    
    public boolean verifyLogin(String username, String password) {
        return providerRepository.findByUsernameAndPassword(username, password).isPresent();
    }

    public Provider getProviderById(Long id) {
        return providerRepository.findById(id).orElse(null);
    }
    public Provider getProviderByUsernameAndPassword(String username, String password) {
        return providerRepository.findByUsernameAndPassword(username, password).orElse(null);
    }

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public Provider updateProvider(Long id, Provider providerDetails) {
        Provider provider = providerRepository.findById(id).orElse(null);
        if (provider != null) {
            provider.setUsername(providerDetails.getUsername());
            provider.setPassword(providerDetails.getPassword());
            provider.setBio(providerDetails.getBio());
            provider.setProfilePicture(providerDetails.getProfilePicture());
            return providerRepository.save(provider);
        }
        return null;
    }

    public void deleteProvider(Long id) {
        providerRepository.deleteById(id);
    }
}