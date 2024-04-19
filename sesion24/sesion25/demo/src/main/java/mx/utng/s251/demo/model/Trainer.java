package mx.utng.s251.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private long id;

    @Column(length = 100,nullable = false)
    private String name;

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    

    
}
