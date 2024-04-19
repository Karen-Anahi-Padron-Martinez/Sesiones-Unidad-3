package mx.utng.s30;

import java.util.List;
import java.util.function.IntUnaryOperator;

public class Ejercicio1 {

    Integer manipular(List<Integer>conjunto, IntUnaryOperator transformacion){
        return conjunto.stream().mapToInt(s->s).map(transformacion).sum();
    }
    
}
