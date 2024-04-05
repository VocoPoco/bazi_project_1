package com.viki.baziproject1.utils;

import java.util.HashSet;
import java.util.Set;

public record AirportFilter(
        Set<String> countryIso2Codes,
        Set<Long> cityIds,
        Set<String> airportIcaoCodes,
        Set<String> airportNames

) {
    public AirportFilter() {
        this(new HashSet<>(), new HashSet<>(), new HashSet<>(), new HashSet<>());
    }
}