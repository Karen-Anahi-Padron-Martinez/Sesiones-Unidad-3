package mx.utng.sesion26.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//long tipo de dato primitivo
//Long: Clase envoltoria  que envuelve al tipo de dato long y le da más propiedades o calquier tipo de dato queempuece con mayusculas
@Entity
public class Materia {

    @Id @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @NotEmpty //    NO ACEPTA VALORES NULL
    @Column(length = 30)
    private String nameGrade; 

    @Column(length = 30)
    private String horario; 

    @NotEmpty
    @Column(length = 30)
    private String profesor; 
    @Column(length = 30)
    private Float ubicacion;

 public String getHorario() {
     return horario;
 }
 public Long getId() {
     return id;
 }
 
 public String getNameGrade() {
     return nameGrade;
 }
 public String getProfesor() {
     return profesor;
 }
 public Float getUbicacion() {
     return ubicacion;
 }
 public void setHorario(String horario) {
     this.horario = horario;
 }
 public void setId(Long id) {
     this.id = id;
 }
 public void setNameGrade(String nameGrade) {
     this.nameGrade = nameGrade;
 }
 public void setProfesor(String profesor) {
     this.profesor = profesor;
 }
 public void setUbicacion(Float ubicacion) {
     this.ubicacion = ubicacion;
 }





    
}

