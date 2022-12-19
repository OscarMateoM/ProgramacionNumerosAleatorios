/*
 * Ejemplo4.java
 * AUTOR: OSCAR MATEO MARTIN
 * Numeros aleatorios
 */
 public class Ejemplo4 {
public static void main(String[] args) {
System.out.println("15 números aleatorios entre 50 y 60 (sin decimales):");
for (int i = 1; i <= 15; i++) {
System.out.print(((int)(Math.random()*11) + 50 ) + " ");
}
System.out.println();
}
}
