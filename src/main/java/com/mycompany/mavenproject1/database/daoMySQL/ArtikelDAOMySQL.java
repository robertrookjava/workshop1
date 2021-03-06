/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.database.daoMySQL;
import com.mycompany.mavenproject1.database.Database;
import com.mycompany.mavenproject1.database.dao.*;

/**
 *
 * @author robertrook
 */
public class ArtikelDAOMySQL extends ArtikelDAO{
    
    protected Database database = Database.MySQL;
    protected String SQLcreate = "INSERT INTO ARTIKEL"
                    + "(IDARTIKEL, NAAM, PRIJS, VOORRAAD) VALUES"
                    + "(?,?,?,?)";
    protected String SQLdelete= "DELETE FROM Artikel WHERE idArtikel = ?";
    protected String SQLreadById= "SELECT * FROM Artikel WHERE Artikel.idArtikel = ?";
    protected String SQLexistsByIdArtikel= "SELECT * FROM Artikel WHERE Artikel.idArtikel = ?";
    protected String SQLexistsBestelArtikelByIdArtikel= "SELECT * FROM BestelArtikel WHERE bestelartikel.idArtikel = ?";
    protected String SQLexistsByNaam = "SELECT * FROM Artikel WHERE Artikel.Naam = ?";
    protected String SQLreadAll = "SELECT * FROM Artikel";
    protected String SQLreadByNaam = "SELECT * FROM Artikel WHERE Artikel.Naam = ?";
    protected String SQLupdate= "UPDATE Artikel SET Artikel.naam = ?, "
                    + " Artikel.prijs = ?, Artikel.voorraad = ? "
                    + "WHERE Artikel.idArtikel = ?";
    
    @Override
    public Database getDatabase(){
        return this.database;
    }
    
    @Override
    public String getSQLcreate(){
        return this.SQLcreate;
    }
    
    @Override
    public String getSQLdelete(){
        return this.SQLdelete;
    }
    @Override
    public String getSQLreadById(){
        return this.SQLreadById;
    }
    
    @Override
    public String getSQLexistsByIdArtikel(){
        return this.SQLexistsByIdArtikel;
    }
    
    @Override
    public String getSQLexistsBestelArtikelByIdArtikel(){
        return this.SQLexistsBestelArtikelByIdArtikel;
    }
    @Override
    public String getSQLexistsByNaam(){
        return this.SQLexistsByNaam;
    }
    @Override
    public String getSQLreadAll(){
        return this.SQLreadAll;
    }
    @Override
    public String getSQLreadByNaam(){
        return this.SQLreadByNaam;
    }
    @Override
    public String getSQLupdate(){
        return this.SQLupdate;
    }

    
}
