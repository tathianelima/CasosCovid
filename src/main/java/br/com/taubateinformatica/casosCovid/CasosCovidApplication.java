package br.com.taubateinformatica.casosCovid;

import br.com.taubateinformatica.casosCovid.domain.CasosPorMes;
import br.com.taubateinformatica.casosCovid.repositories.CasosPorMesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CasosCovidApplication implements CommandLineRunner {

	@Autowired
	private CasosPorMesRepository casosPorMesRepository;

	public static void main(String[] args) {
		SpringApplication.run(CasosCovidApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {
		CasosPorMes marco = new CasosPorMes(null, "Março", 3);
		CasosPorMes abril = new CasosPorMes(null, "abril", 8);
		CasosPorMes maio = new CasosPorMes(null, "Maio", 15);
		CasosPorMes junho = new CasosPorMes(null, "Junho", 12);
		CasosPorMes julho = new CasosPorMes(null, "Julho", 19);

		casosPorMesRepository.saveAll(Arrays.asList(marco, abril, maio, junho, julho));
	}


}