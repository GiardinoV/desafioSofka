import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuestionario {
    private final List<Pregunta> preguntas;

    public Cuestionario() {
        this.preguntas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta p) {
        this.preguntas.add(p);
    }

    public void preguntar(int puntos) {
        int indiceAleatorio = (int) (Math.random() * 4);
        Pregunta preguntaAleatoria = this.preguntas.get(indiceAleatorio);
        boolean acierta = preguntaAleatoria.preguntar(preguntaAleatoria);
        if (acierta) {
            System.out.println("\t\t¡Correcto!");
            if (puntos == 50) {
                System.out.println("¡¡Felicitaciones!! Ganaste el juego \n ¡Ganaste " + puntos + " puntos!");
            } else {
                System.out.println("\nDesea continuar al siguiente nivel o retirarse con " + puntos + " puntos? \n(Presione cualquier tecla para continuar ó 'No' para abandonar)");
                Scanner scanner = new Scanner(System.in);
                String continua = scanner.nextLine();
                if (continua.equals("no") || continua.equals("NO") || continua.equals("No")) {
                    System.out.println("\nFinalizó el juego! Se retira con " + puntos + " puntos");
                    System.exit(1);
                }
            }
        } else {
            System.out.println("Incorrecto! Quedaste eliminado/a del juego");
            System.exit(1);
        }
    }
}
