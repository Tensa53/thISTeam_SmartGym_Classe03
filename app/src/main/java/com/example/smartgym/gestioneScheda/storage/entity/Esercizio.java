package com.example.smartgym.gestioneScheda.storage.entity;

import java.io.Serializable;

public class Esercizio implements Serializable {

    private String id;
    private String nome;
    private String descrizione;
    private String parteDelCorpo;
    private String tipologia;
    private String difficolta;
    private DettaglioEsercizio dettaglio;

    public Esercizio() {
    }

    public Esercizio(DettaglioEsercizio dettaglio) {
        this.dettaglio = dettaglio;
    }

    public Esercizio(String nome, DettaglioEsercizio dettaglio) {
        this.nome = nome;
        this.dettaglio = dettaglio;
    }

    public Esercizio(String id, String nome, String descrizione, String parteDelCorpo, String tipologia, String difficolta) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.parteDelCorpo = parteDelCorpo;
        this.tipologia = tipologia;
        this.difficolta = difficolta;
    }

    public Esercizio(String id, String nome, String descrizione, String parteDelCorpo, String tipologia, String difficolta, DettaglioEsercizio dettaglio) {
        this.id = id;
        this.nome = nome;
        this.descrizione = descrizione;
        this.parteDelCorpo = parteDelCorpo;
        this.tipologia = tipologia;
        this.difficolta = difficolta;
        this.dettaglio = dettaglio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getParteDelCorpo() {
        return parteDelCorpo;
    }

    public void setParteDelCorpo(String parteDelCorpo) {
        this.parteDelCorpo = parteDelCorpo;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getDifficolta() {
        return difficolta;
    }

    public void setDifficolta(String difficolta) {
        this.difficolta = difficolta;
    }

    public DettaglioEsercizio getDettaglio() {
        return dettaglio;
    }

    public void setDettaglio(DettaglioEsercizio dettaglio) {
        this.dettaglio = dettaglio;
    }
}