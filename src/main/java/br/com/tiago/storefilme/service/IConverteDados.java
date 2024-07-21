package br.com.tiago.storefilme.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
