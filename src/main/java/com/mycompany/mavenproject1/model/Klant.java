/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.model;

/**
 *
 * @author robertrook
 */
public class Klant {
    private int idKlant;
    private String voornaam;
    private String achternaam;
    private String tussenvoegsel;
    private String telefoonnummer;
    private String emailadres;
    
    
    public Klant(){
    }

    public int getIdKlant() {
        return idKlant;
    }

    public void setIdKlant(int idKlant) {
        this.idKlant = idKlant;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getEmailadres() {
        return emailadres;
    }

    public void setEmailadres (String emailadres) {
        this.emailadres = emailadres;
    }
    
    
    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer (String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

}
