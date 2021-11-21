package com.example.applicationvisite.logique;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.LinkedList;

@IgnoreExtraProperties
public class Batiment{

    //LinkedList<Lieux> listeLieuxInteret;

    String bat_nom;
    String bat_id;
    String bat_description;
    String bat_id_img;

    public Batiment(String bat_nom, String bat_id, String bat_description, String bat_id_img) {
        //this.listeLieuxInteret = new LinkedList<>();
        this.bat_nom = bat_nom;
        this.bat_id = bat_id;
        this.bat_description = bat_description;
        this.bat_id_img = bat_id_img;
    }

    public Batiment(){

    }

    public String getBat_nom() {
        return bat_nom;
    }

    public String getBat_id() {
        return bat_id;
    }

    public String getBat_description() {
        return bat_description;
    }

    public String getBat_id_img() {
        return bat_id_img;
    }

    @Override
    public String toString() {
        return "Batiment{" +
                "bat_nom='" + bat_nom + '\'' +
                ", bat_id='" + bat_id + '\'' +
                ", bat_description='" + bat_description + '\'' +
                ", bat_id_img='" + bat_id_img + '\'' +
                '}';
    }
}
