package br.com.taubateinformatica.casosCovid.resources;

import br.com.taubateinformatica.casosCovid.domain.CasosPorMes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/casosPorMes")
public class CasosPorMesResource {

    @Autowired
    private CasosPorMesService service;

    //endpoint para buscar numeros de casos de um mes especifico

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ResponseEntity<CasosPorMes> find(@PathVariable Integer id) {
        CasosPorMes obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
