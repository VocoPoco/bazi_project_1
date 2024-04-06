package com.viki.baziproject1.repositories;

import com.viki.baziproject1.models.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long>, JpaSpecificationExecutor<Airport> {
    public Optional<Airport> findByName(String name);
    public Optional<Airport> findByIataCode(String code);
    public Optional<Airport> findIcaoCode(String code);
}
