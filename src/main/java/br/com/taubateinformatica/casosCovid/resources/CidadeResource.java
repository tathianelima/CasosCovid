package br.com.taubateinformatica.casosCovid.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/casosPorMes")
public class CasosPorMesResource {

    @RequestMapping(method=RequestMethod.GET)
    public String lista() {

        return "Testando o Rest";

    }
}
