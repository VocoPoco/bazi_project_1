package com.viki.baziproject1.endpoints;


import com.viki.baziproject1.dtos.AirportDTO;
import com.viki.baziproject1.services.AirportService;
import com.viki.baziproject1.utils.AirportFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping("/api/v0/airports")
public class AirportController {
    private final AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/")
    public ResponseEntity<List<AirportDTO>> fetchAllAirports() {
        List<AirportDTO> airportDTOs = airportService.findAllAirports();
        if(airportDTOs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(airportDTOs);
    }


    @PostMapping("/filer")
    public ResponseEntity<?> fetchFilteredAirports(@RequestParam boolean countryAsRoot, @RequestBody AirportFilter airportFilter) {
        if (countryAsRoot) {

        } else {

        }
    }
}
