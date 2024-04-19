package sesion19;

public class IntergerToBinary {
    public static void main(String[] args) {
        int numero = 40;
        String binario = Integer.toBinaryString(numero);
        System.out.printf("El numero %d es un binario %s.%n",numero, binario);
    }
}
