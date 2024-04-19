package mx.utng.sesion26.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

//long tipo de dato primitivo
//Long: Clase envoltoria  que envuelve al tipo de dato long y le da más propiedades o calquier tipo de dato queempuece con mayusculas
@Entity
public class Examen {

    @Id @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @NotEmpty
    @Column(length = 30)
    private String nameAlum ; 
   
    @Column(length = 30)
    private String tipeExam; 

    @Column(length = 30)
    private String resultados; 


      @Temporal(TemporalType.DATE)//Guardala fecha temporalmente
    private Date recordAt;

    @PrePersist
    public void prePersist(){
        recordAt = new Date();
    }

    public Long getId() {
        return id;
    }
    public String getNameAlum() {
        return nameAlum;
    }
    public Date getRecordAt() {
        return recordAt;
    }
    public String getResultados() {
        return resultados;
    }
    public String getTipeExam() {
        return tipeExam;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setNameAlum(String nameAlum) {
        this.nameAlum = nameAlum;
    }
    public void setRecordAt(Date recordAt) {
        this.recordAt = recordAt;
    }
    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
}
