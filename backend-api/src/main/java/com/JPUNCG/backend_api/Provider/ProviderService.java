package com.JPUNCG.backend_api.Provider;

import com.JPUNCG.backend_api.Provider.Provider;
import com.JPUNCG.backend_api.Renter.Renter;
import com.JPUNCG.backend_api.Provider.ProviderRepository;
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

    public Provider getProviderByUsernameAndPassword(String username, String password) {
        return providerRepository.findByUsernameAndPassword(username, password).orElse(null);
    }

    public Provider createProvider(Provider provider) {
        return providerRepository.save(provider);
    }

    public void deleteProvider(Long id) {
        providerRepository.deleteById(id);
    }
}
