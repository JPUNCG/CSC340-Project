package com.JPUNCG.backend_api.Renter;

import com.JPUNCG.backend_api.Renter.Renter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RenterRepository extends JpaRepository<Renter, Long> {
    Optional<Renter> findByUsernameAndPassword(String username, String password);
}