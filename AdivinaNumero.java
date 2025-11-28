import java.util.Scanner;
import java.util.Random;
public class AdivinaNumero {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 Random rand = new Random();
 int numeroSecreto = rand.nextInt(100) + 1;
 int intento;
 System.out.println("¡Bienvenido al juego de adivinanza!");
 do {
 System.out.print("Introduce tu intento: ");
 intento = sc.nextInt();
 if(intento < numeroSecreto) System.out.println(" bajo");
 else if(intento > numeroSecreto) System.out.println(" alto");
 else System.out.println("¡Correcto!");
 // Suponiendo que numeroSecreto es el número generado:
if (numeroSecreto % 2 == 0) {
    System.out.println("Pista: el número secreto es PAR.");
} else {
    System.out.println("Pista: el número secreto es IMPAR.");
}

 } while(intento != numeroSecreto);
 }
}