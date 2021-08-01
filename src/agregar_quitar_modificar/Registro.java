/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregar_quitar_modificar;

/**
 *
 * @author DELL
 */
public class Registro {

    private String matricula;
    private String tel;
    private String nom;
    private String app;
    private String apm;
    private String est;
    private String email;

    public Registro() {
       
       est =  matricula = tel =   nom = app = apm = email = "";
       

    }

    public void pedirDatos(String matricula, String nom, String app, String apm, String est, String tel, String email) {
        this.matricula = matricula;
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.tel = tel;
        this.email = email;
        this.est = est;

    }

    public void verDtos() {
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s\n", matricula, nom, app, apm, est, tel, email);

    }

    public String getMatricula() {
        return matricula;
    }

    public String getTel() {
        return tel;
    }

    public String getNom() {
        return nom;
    }

    public String getApp() {
        return app;
    }

    public String getApm() {
        return apm;
    }

    public String getEst() {
        return est;
    }

    public String getEmail() {
        return email;
    }
}
