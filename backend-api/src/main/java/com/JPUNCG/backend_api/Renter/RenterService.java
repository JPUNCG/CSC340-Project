package com.JPUNCG.backend_api.Renter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RenterService {

    @Autowired
    private RenterRepository renterRepository;

    public List<Renter> getAllRenters() {
        return renterRepository.findAll();
    }

    public Renter createRenter(Renter renter) {
        return renterRepository.save(renter);
    }

    public boolean verifyLogin(String username, String password) {
        return renterRepository.findByUsernameAndPassword(username, password).isPresent();
    }
    
    public Renter getRenterById(Long id) {
        return renterRepository.findById(id).orElse(null);
    }

    public Renter getRenterByUsernameAndPassword(String username, String password) {
        return renterRepository.findByUsernameAndPassword(username, password).orElse(null);
    }

    public Renter updateRenter(Long id, Renter renterDetails) {
        Renter renter = renterRepository.findById(id).orElse(null);
        if (renter != null) {
            renter.setUsername(renterDetails.getUsername());
            renter.setPassword(renterDetails.getPassword());
            renter.setBio(renterDetails.getBio());
            renter.setProfilePicture(renterDetails.getProfilePicture());
            return renterRepository.save(renter);
        }
        return null;
    }

    public void deleteRenter(Long id) {
        renterRepository.deleteById(id);
    }
}
