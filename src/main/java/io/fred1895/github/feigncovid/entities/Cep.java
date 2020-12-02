package io.fred1895.github.feigncovid.entities;

import lombok.Data;

@Data
public class Cep {

    public String cep;
    public String logradouro;
    public String complemento;
    public String bairro;
    public String localidade;
    public String uf;
    public String ibge;
    public String gia;
    public String ddd;
    public String siafi;
}
