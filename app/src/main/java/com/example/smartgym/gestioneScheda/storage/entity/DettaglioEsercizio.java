package com.example.smartgym.gestioneScheda.storage.entity;

public class DettaglioEsercizio {

    private Integer ripetizioni;
    private Integer durata;

    public DettaglioEsercizio() {
    }

    public DettaglioEsercizio(Integer ripetizioni, Integer durata) {
        this.ripetizioni = ripetizioni;
        this.durata = durata;
    }

    public Integer getRipetizioni() {
        return ripetizioni;
    }

    public void setRipetizioni(Integer ripetizioni) {
        this.ripetizioni = ripetizioni;
    }

    public Integer getDurata() {
        return durata;
    }

    public void setDurata(Integer durata) {
        this.durata = durata;
    }
}