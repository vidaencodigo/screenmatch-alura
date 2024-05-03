import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inmersión Java");

        int fecha_lanzamiento = 1999;
        double evaluacion = 4.5; /* calificacion de 0 - 5 */
        boolean plan_basico = true;
        String nombre = "Matrix";
        String synopsis = """
                When a beautiful stranger leads computer hacker Neo to a forbidding underworld, 
                he discovers the shocking truth--the life he knows is the elaborate deception 
                of an evil cyber-intelligence.
                """;
        double media_final = 0;
        Integer acumulador = 0;

        System.out.println("Titulo: " + nombre);
        System.out.println("Fecha de estreno: " + fecha_lanzamiento);
        System.out.println("Calificación: " + evaluacion);
        System.out.println("Se incluye en el plan basico: " + plan_basico);
        System.out.println("Sinopsis: " + synopsis);

        double media_evaluacion = (4.5 + 3 + 5) / 3;
        System.out.println(String.format("Valoración media: %1.1f", media_evaluacion)); // solo imprime 2 digitos

        if (fecha_lanzamiento < 2000) {
            System.out.println("Pelicula retro");
        } else {
            System.out.println("Pelicula popular al momento");
        }


        while (true)
        {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Califica la película (0 para terminar):");
            double calificacion_usuario = teclado.nextDouble();
            media_final += calificacion_usuario;

            if (calificacion_usuario == 0) {
                break;
            }
            acumulador += 1;
        }
        String resultado = String.format("Calificación final: %1.1f,  Total de votos: %d", media_final/acumulador, acumulador);
        System.out.println( resultado );
    }
}