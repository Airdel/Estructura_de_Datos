/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Medina
 */
public class Alumno {
    private String nc, nom;
    private int edad;

    public Alumno() {
    }

    public Alumno(String nc, String nom, int edad) {
        this.nc = nc;
        this.nom = nom;
        this.edad = edad;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nc=" + nc + ", nom=" + nom + ", edad=" + edad + '}';
    }
    
    
}
