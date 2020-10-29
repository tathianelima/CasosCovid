package br.com.taubateinformatica.casosCovid.dto;

import br.com.taubateinformatica.casosCovid.domain.CasosPorMes;

import java.io.Serializable;

public class CasosPorMesDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    private String mes;
    private Integer casos;

    public CasosPorMesDTO() {

    }

    public CasosPorMesDTO(CasosPorMes obj) {
        id = obj.getId();
        mes = obj.getMes();
        casos = obj.getCasos();
    }

    public Integer getId() {
        return id;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public Integer getCasos() {
        return casos;
    }

    public void setCasos(Integer casos) {
        this.casos = casos;
    }
}