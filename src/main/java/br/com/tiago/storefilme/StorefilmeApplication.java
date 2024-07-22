package br.com.tiago.storefilme;

import br.com.tiago.storefilme.model.DadosFilme;
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
		for (int i = 11; i < 25 ; i++) {
			var json = consumoApi.obterDados("https://api.themoviedb.org/3/movie/"+i+"?api_key=09d29106fc0502d70eedcbdd3363609b");
//			System.out.println(json);
			CoverteDados conversor = new CoverteDados();
			DadosFilme dados = conversor.obterDados(json, DadosFilme.class);
			System.out.println(dados);
		}
	}
}
