import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cuestionario nivel1 = new Cuestionario();
        nivel1.agregarPregunta(new Pregunta("1+1", List.of(
                new Respuesta("1", false),
                new Respuesta("3", false),
                new Respuesta("2", true),
                new Respuesta("4", false)
        )));
        nivel1.agregarPregunta(new Pregunta("2+1", List.of(
                new Respuesta("2", false),
                new Respuesta("3", true),
                new Respuesta("4", false),
                new Respuesta("5", false)
        )));
        nivel1.agregarPregunta(new Pregunta("0+0", List.of(
                new Respuesta("1", false),
                new Respuesta("0", true),
                new Respuesta("2", false),
                new Respuesta("3", false)
        )));
        nivel1.agregarPregunta(new Pregunta("2+2", List.of(
                new Respuesta("4", true),
                new Respuesta("3", false),
                new Respuesta("5", false),
                new Respuesta("6", false)
        )));
        nivel1.agregarPregunta(new Pregunta("4+4", List.of(
                new Respuesta("8", true),
                new Respuesta("10", false),
                new Respuesta("6", false),
                new Respuesta("9", false)
        )));

        Cuestionario nivel2 = new Cuestionario();
        nivel2.agregarPregunta(new Pregunta("2*2", List.of(
                new Respuesta("3", false),
                new Respuesta("5", false),
                new Respuesta("4", true),
                new Respuesta("6", false)
        )));
        nivel2.agregarPregunta(new Pregunta("1*1", List.of(
                new Respuesta("2", false),
                new Respuesta("1", true),
                new Respuesta("4", false),
                new Respuesta("3", false)
        )));
        nivel2.agregarPregunta(new Pregunta("3*3", List.of(
                new Respuesta("4", false),
                new Respuesta("9", true),
                new Respuesta("6", false),
                new Respuesta("12", false)
        )));
        nivel2.agregarPregunta(new Pregunta("2*1", List.of(
                new Respuesta("2", true),
                new Respuesta("1", false),
                new Respuesta("4", false),
                new Respuesta("5", false)
        )));
        nivel2.agregarPregunta(new Pregunta("3*2", List.of(
                new Respuesta("6", true),
                new Respuesta("3", false),
                new Respuesta("2", false),
                new Respuesta("5", false)
        )));

        Cuestionario nivel3 = new Cuestionario();
        nivel3.agregarPregunta(new Pregunta("12/2", List.of(
                new Respuesta("8", false),
                new Respuesta("9", false),
                new Respuesta("6", true),
                new Respuesta("2", false)
        )));
        nivel3.agregarPregunta(new Pregunta("18/3", List.of(
                new Respuesta("3", false),
                new Respuesta("6", true),
                new Respuesta("4", false),
                new Respuesta("2", false)
        )));
        nivel3.agregarPregunta(new Pregunta("20/2", List.of(
                new Respuesta("5", false),
                new Respuesta("10", true),
                new Respuesta("15", false),
                new Respuesta("12", false)
        )));
        nivel3.agregarPregunta(new Pregunta("14/7", List.of(
                new Respuesta("2", true),
                new Respuesta("4", false),
                new Respuesta("7", false),
                new Respuesta("6", false)
        )));
        nivel3.agregarPregunta(new Pregunta("16/8", List.of(
                new Respuesta("2", true),
                new Respuesta("8", false),
                new Respuesta("6", false),
                new Respuesta("4", false)
        )));

        Cuestionario nivel4 = new Cuestionario();
        nivel4.agregarPregunta(new Pregunta("(115-5)/2", List.of(
                new Respuesta("60", false),
                new Respuesta("50", false),
                new Respuesta("55", true),
                new Respuesta("110", false)
        )));
        nivel4.agregarPregunta(new Pregunta("(130-5)/5", List.of(
                new Respuesta("30", false),
                new Respuesta("25", true),
                new Respuesta("125", false),
                new Respuesta("120", false)
        )));
        nivel4.agregarPregunta(new Pregunta("(150-25)/5", List.of(
                new Respuesta("30", false),
                new Respuesta("25", true),
                new Respuesta("125", false),
                new Respuesta("100", false)
        )));
        nivel4.agregarPregunta(new Pregunta("(125-25)/4", List.of(
                new Respuesta("25", true),
                new Respuesta("100", false),
                new Respuesta("40", false),
                new Respuesta("30", false)
        )));
        nivel4.agregarPregunta(new Pregunta("(144-40)/2", List.of(
                new Respuesta("52", true),
                new Respuesta("142", false),
                new Respuesta("40", false),
                new Respuesta("102", false)
        )));

        Cuestionario nivel5 = new Cuestionario();
        nivel5.agregarPregunta(new Pregunta("65*9", List.of(
                new Respuesta("582", false),
                new Respuesta("575", false),
                new Respuesta("585", true),
                new Respuesta("592", false)
        )));
        nivel5.agregarPregunta(new Pregunta("53*6", List.of(
                new Respuesta("328", false),
                new Respuesta("318", true),
                new Respuesta("316", false),
                new Respuesta("336", false)
        )));
        nivel5.agregarPregunta(new Pregunta("76*8", List.of(
                new Respuesta("618", false),
                new Respuesta("608", true),
                new Respuesta("616", false),
                new Respuesta("606", false)
        )));
        nivel5.agregarPregunta(new Pregunta("62*9", List.of(
                new Respuesta("558", true),
                new Respuesta("548", false),
                new Respuesta("568", false),
                new Respuesta("546", false)
        )));
        nivel5.agregarPregunta(new Pregunta("79*4", List.of(
                new Respuesta("316", true),
                new Respuesta("326", false),
                new Respuesta("313", false),
                new Respuesta("346", false)
        )));


        System.out.println("\tNIVEL 1 \n SELECCIONE UNA OPCION (a, b, c, d)");
        nivel1.preguntar(10);
        System.out.println("\tNIVEL 2 \n SELECCIONE UNA OPCION (a, b, c, d)");
        nivel2.preguntar(20);
        System.out.println("\tNIVEL 3 \n SELECCIONE UNA OPCION (a, b, c, d)");
        nivel3.preguntar(30);
        System.out.println("\tNIVEL 4 \n SELECCIONE UNA OPCION (a, b, c, d)");
        nivel4.preguntar(40);
        System.out.println("\t¡NIVEL 5! ULTIMO NIVEL\n SELECCIONE UNA OPCION (a, b, c, d)");
        nivel5.preguntar(50);

    }
}