package io.fred1895.github.feigncovid.controller;

import io.fred1895.github.feigncovid.entities.CovidStats;
import io.fred1895.github.feigncovid.services.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/covid")
public class CovidController {

    @Autowired
    private CovidService covidService;

    @GetMapping("/{estado}")
    @ResponseStatus(HttpStatus.OK)
    public CovidStats getStats(@PathVariable String estado) {
        return covidService.showUfStats(estado);
    }

    @GetMapping("/cep/{cep}")
    @ResponseStatus(HttpStatus.OK)
    public CovidStats getStatsByCep(@PathVariable String cep) {
        return covidService.getByCep(cep);
    }
}
