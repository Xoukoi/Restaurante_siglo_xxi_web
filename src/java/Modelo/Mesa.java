/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Diego
 */
public class Mesa {
    int id;
    int nr_mesa;
    char estado;

    public Mesa() {
    }

    public Mesa(int id, int nr_mesa, char estado) {
        this.id = id;
        this.nr_mesa = nr_mesa;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNr_mesa() {
        return nr_mesa;
    }

    public void setNr_mesa(int nr_mesa) {
        this.nr_mesa = nr_mesa;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
 
    
}
