package com.JPUNCG.backend_api.Property;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
    List<Property> findByProviderId(Long providerId);

    List<Property> findByPriceBetweenAndSqftBetween(int minPrice, int maxPrice, int minSqft, int maxSqft);
}
