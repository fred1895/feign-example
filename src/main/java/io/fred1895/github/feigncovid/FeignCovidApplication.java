package io.fred1895.github.feigncovid;

import io.fred1895.github.feigncovid.services.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignCovidApplication{

	@Autowired
	private CovidService covidService;

	public static void main(String[] args) {
		SpringApplication.run(FeignCovidApplication.class, args);
	}

}
