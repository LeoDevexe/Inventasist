/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_de_agendamiento_de_citas_médicas.Pacientes;

/**
 *
 * @author Equipo
 */
public class PA {
     int ID;
    String Nombres,Cedula,Direccion,FechaNaciemiento,GeneroPa,CorreoPa,FechaCita,HoraCita,Doctor,Especialidad;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        this.Cedula = cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        this.Direccion = direccion;
    }

    public String getFechaNaciemiento() {
        return FechaNaciemiento;
    }

    public void setFechaNaciemiento(String FechaNaciemiento) {
        this.FechaNaciemiento = FechaNaciemiento;
    }

    public String getFechaCita() {
        return FechaCita;
    }

    public void setFechaCita(String FechaCita) {
        this.FechaCita = FechaCita;
    }

    public String getHoraCita() {
        return HoraCita;
    }

    public void setHoraCita(String HoraCita) {
        this.HoraCita = HoraCita;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getGeneroPa() {
        return GeneroPa;
    }

    public void setGeneroPa(String GeneroPa) {
        this.GeneroPa = GeneroPa;
    }

    public String getCorreoPa() {
        return CorreoPa;
    }

    public void setCorreoPa(String correoPa) {
        this.CorreoPa = correoPa;
    }
    
}
