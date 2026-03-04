/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectosjava;



/**
 *
 * @author USER
 */
public class Usuario {
    
    private String id;
    private String password;
    private double saldo;

    public Usuario(String id, String password, double saldo) {
        this.id = id;
        this.password = password;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    

}
