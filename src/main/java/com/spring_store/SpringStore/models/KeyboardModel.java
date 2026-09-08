package com.spring_store.springstore.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "keyboard")
public class keyboard {
    @Id
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private String switch_color;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getSwitch_color(){
        return switch_color;
    }

    public void setSwitch_color(String switch_color){
        this.switch_color = switch_color;
    }
}
