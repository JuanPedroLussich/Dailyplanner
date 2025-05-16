import java.util.Scanner;

public class DailyPlanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero de dia (1 = lunes, 7 = domingo):");
        int dia = sc.nextInt();

        System.out.println("Ingresá la hora actual (0 a 23):");
        int hora = sc.nextInt();

        String nombreDia = "";

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                System.out.println("Numero de dia invalido");
        }

        if (dia >= 1 && dia <= 7) {
            System.out.println("Hoy es " + nombreDia);

            if (hora >= 0 && hora <= 23) {
                System.out.println("Son las " + hora + " horas");

                if (dia >= 1 && dia <= 5) {
                    if (hora >= 8 && hora <= 11) {
                        System.out.println("Actividad sugerida: Arranca el dia con estudio o trabajo");
                    } else if (hora >= 12 && hora <= 14) {
                        System.out.println("Actividad sugerida: Hora del almuerzo");
                    } else if (hora >= 15 && hora <= 18) {
                        System.out.println("Actividad sugerida: Seguimos con tareas o estudio");
                    } else if (hora >= 19 && hora <= 22) {

                        if (dia == 1 || dia == 3 || dia == 5) {
                            System.out.println("Actividad sugerida: Tienes Clases de programacion");
                        } else {
                            System.out.println("Actividad sugerida: Tiempo libre, mira una serie o sali a caminar");
                        }
                    } else {
                        System.out.println("Actividad sugerida: Es hora de dormir");
                    }
                } else { 
                    if (hora >= 10 && hora <= 13) {
                        System.out.println("Actividad sugerida: Ideal para un paseo o hacer algo al aire libre");
                    } else if (hora >= 14 && hora <= 17) {
                        System.out.println("Actividad sugerida: Tiempo libre: juegos, hobbies");
                    } else if (hora >= 18 && hora <= 22) {
                        System.out.println("Actividad sugerida: Encontrate con amigos o familia");
                    } else {
                        System.out.println("Actividad sugerida: Dormi tranquilo, es fin de semana");
                    }
                }

            } else {
                System.out.println("No se puede sugerir actividad: hora invalida");
            }

        } else {
            System.out.println("No se puede sugerir actividad: el día ingresado no es valido.");
        }

   
        sc.close();
    }
}
