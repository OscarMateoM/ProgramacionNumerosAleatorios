/*
 * Ejemplo1.java
 * AUTOR: OSCAR MATEO MARTIN
 * Numeros aleatorios
 */
public class Ejemplo1 {
public static void main(String[] args) {
System.out.println("15 números aleatorios entre 0 y 10");
System.out.println(" sin llegar a 10 (con decimales):");
for (int i = 1; i <= 15; i++) {
System.out.println( Math.random()*10 + " ");
}
}
}
