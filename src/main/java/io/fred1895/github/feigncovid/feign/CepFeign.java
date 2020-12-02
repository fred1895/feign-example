package io.fred1895.github.feigncovid.feign;

import io.fred1895.github.feigncovid.entities.Cep;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "CepFeign")
public interface CepFeign {

    @GetMapping("{cep}/json/")
    public Cep getCep(@PathVariable String cep);
}
