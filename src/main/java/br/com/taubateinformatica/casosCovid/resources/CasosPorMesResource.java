package br.com.taubateinformatica.casosCovid.resources;

import br.com.taubateinformatica.casosCovid.domain.CasosPorMes;
import br.com.taubateinformatica.casosCovid.dto.CasosPorMesDTO;
import br.com.taubateinformatica.casosCovid.services.CasosPorMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/casosPorMes")
public class CasosPorMesResource {

    @Autowired
    private CasosPorMesService service;

    //endpoint para dados de um mes por id
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {
        CasosPorMes obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }


    //endpoint para lista de dados casos covid
    @RequestMapping( method=RequestMethod.GET)
    public ResponseEntity<List<CasosPorMesDTO>> findAll() {
        List<CasosPorMes> list = service.findAll();
        List<CasosPorMesDTO> listDto = list
                .stream()
                .map(obj -> new CasosPorMesDTO(obj))
                .collect(Collectors.toList());

        return ResponseEntity.ok().body(listDto);
    }

}