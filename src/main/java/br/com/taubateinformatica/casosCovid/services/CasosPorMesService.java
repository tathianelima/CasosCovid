package br.com.taubateinformatica.casosCovid.services;

import br.com.taubateinformatica.casosCovid.domain.CasosPorMes;
import br.com.taubateinformatica.casosCovid.repositories.CasosPorMesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasosPorMesService {

    @Autowired
    private CasosPorMesRepository repo;

    public CasosPorMes find(Integer id) {
        Optional<CasosPorMes> obj = repo.findById(id);
        return obj.orElse(null);
    }

    public List<CasosPorMes> findAll(){
        return repo.findAll();
    }

}