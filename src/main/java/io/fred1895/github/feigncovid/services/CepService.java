package io.fred1895.github.feigncovid.services;

import io.fred1895.github.feigncovid.entities.Cep;
import io.fred1895.github.feigncovid.rest.CepRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private CepRest cepRest;

    public Cep getCep(String cep) {
        return cepRest.getCep(cep);
    }
}
