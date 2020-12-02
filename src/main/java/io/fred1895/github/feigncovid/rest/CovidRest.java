package io.fred1895.github.feigncovid.rest;

import io.fred1895.github.feigncovid.entities.CovidStats;
import io.fred1895.github.feigncovid.feign.CovidFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CovidRest {

    @Autowired
    private CovidFeign covidFeign;

    public CovidStats getStats(String estado) {
        return covidFeign.getStateStats(estado);
    }
}
