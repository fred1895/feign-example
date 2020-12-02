package io.fred1895.github.feigncovid.services;

import io.fred1895.github.feigncovid.entities.Cep;
import io.fred1895.github.feigncovid.entities.CovidStats;
import io.fred1895.github.feigncovid.rest.CovidRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CovidService {

    @Autowired
    private CovidRest covidRest;

    @Autowired
    private CepService cepService;
    
    public CovidStats showUfStats(String estado) {
        return covidRest.getStats(estado);
    }

    public CovidStats getByCep(String cep) {
        Cep viaCep = cepService.getCep(cep);

        String uf = viaCep.getUf();
        String ufLowerCase = uf.toLowerCase();

        return showUfStats(ufLowerCase);
    }

}
