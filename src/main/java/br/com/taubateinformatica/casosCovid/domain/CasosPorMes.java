package br.com.taubateinformatica.casosCovid.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CasosPorMes implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mes;
    private Integer casos;

    public CasosPorMes() {

    }

    public CasosPorMes(Integer id, String mes, Integer casos) {
        this.id = id;
        this.mes = mes;
        this.casos = casos;
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
