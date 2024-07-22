package br.com.tiago.storefilme.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosFilme(@JsonAlias("title") String titulo , @JsonAlias("release_date") String data_lancamento) {
}
