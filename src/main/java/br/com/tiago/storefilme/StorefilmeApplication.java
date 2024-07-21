package br.com.tiago.storefilme;

import br.com.tiago.storefilme.model.DadosSerie;
import br.com.tiago.storefilme.service.ConsumoApi;
import br.com.tiago.storefilme.service.CoverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StorefilmeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StorefilmeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://jsonplaceholder.typicode.com/posts/1");
		System.out.println(json);
		CoverteDados conversor = new CoverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
