package io.fred1895.github.feigncovid.entities;

import lombok.Data;

import java.util.Date;

@Data
public class CovidStats {
        public int uid;
        public String uf;
        public String state;
        public int cases;
        public int deaths;
        public int suspects;
        public int refuses;
        public Date datetime;
}
