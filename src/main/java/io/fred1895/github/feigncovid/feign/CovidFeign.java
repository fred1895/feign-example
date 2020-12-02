package io.fred1895.github.feigncovid.feign;

import io.fred1895.github.feigncovid.entities.CovidStats;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://covid19-brazil-api.now.sh/api/report/v1/", name = "CovidFeign")
public interface CovidFeign {

    @GetMapping("brazil/uf/{estado}")
    public CovidStats getStateStats(@PathVariable String estado);

}
