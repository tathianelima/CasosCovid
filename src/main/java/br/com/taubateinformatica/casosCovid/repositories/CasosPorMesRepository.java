package br.com.taubateinformatica.casosCovid.repositories;

import br.com.taubateinformatica.casosCovid.domain.CasosPorMes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasosPorMesRepository extends JpaRepository<CasosPorMes, Integer>{

}