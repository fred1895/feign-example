package io.fred1895.github.feigncovid.rest;

import io.fred1895.github.feigncovid.entities.Cep;
import io.fred1895.github.feigncovid.feign.CepFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepRest {

    @Autowired
    private CepFeign cepFeign;

    public Cep getCep(String cep) {
        return cepFeign.getCep(cep);
    }
}
