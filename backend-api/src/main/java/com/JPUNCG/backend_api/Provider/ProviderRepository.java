package com.JPUNCG.backend_api.Provider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
    Optional<Provider> findByUsernameAndPassword(String username, String password);
}