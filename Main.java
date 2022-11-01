public class Main {
    public static void main(String[] args) {
        int numeroIf = 1;

        if (numeroIf >= 1) {
            System.out.println("El número es positivo");
        } else if (numeroIf <= -1) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }

        int numeroWhile = 1;

        while (numeroWhile <= 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 4);

        int numeroFor = 0;

        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String mesEstacion = "Noviembre";

        switch (mesEstacion) {
            case "Diciembre", "Enero", "Febrero":
                System.out.println("Es Invierno");
                break;
            case "Marzo", "Abril", "Mayo":
                System.out.println("Es Primavera");
                break;
            case "Junio", "Julio", "Agosto":
                System.out.println("Es Verano");
                break;
            case "Septiembre", "Octubre", "Noviembre":
                System.out.println("Es Otoño");
                break;
            case "31 Octubre":
                System.out.println("¡Es Halloween! Boo!👻");
                break;
            default:
                System.out.println("Estación no definida");
        }

    }
}