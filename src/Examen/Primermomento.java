package Examen;
import java.util.Scanner;
public class Primermomento {

    String[] User = new String[5];
    String[] Email = new String[5];
    String[] Passaword = new String[5];
    int[][] Pasos = new int[5][5];

    Scanner sc = new Scanner(System.in);

    int i = 0;

    {
        System.out.println("Ingrese el nombre del usuario " + (i + 1));
        User[i] = sc.nextLine();
        System.out.println("Ingrese el correo del usuario " + (i + 1));
        Email[i] = sc.nextLine();
        System.out.println("Ingrese la contraseña del usuario " + (i + 1));
        Passaword[i] = sc.nextLine();

        int j = 0;
        while () {
            System.out.println("Ingrese los gastos diarios del usuario " + " del día ");
            Pasos[i][j] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n" + "REGISTRO DE PASOS DIARIOS");
        for (i = 0; i < 5; i++) {
            System.out.println("Usuario " + User[i] + " Email: " + Email[i] + " Passaword: " + Passaword[i]);
            int sumaPasos = 0;
            for (int j = 0; j < 5; j++) {
                System.out.print("Día " + "pasos ");
                sumaPasos + Pasos;
            }
            double promedioGastos = (double) sumaPasos / 5;
            System.out.println("\n" + "PROMEDIO DE GASTOS DIARIOS: " + promedioGastos);
        }

        int OPCION;
        do {
            System.out.println("MENÚ: ");
            System.out.println("1. INICIAR SECCIÓN: ");
            System.out.println("2. REGISTRAR GASTOS DIARIOS: ");
            System.out.println("3. MOSTRAR REGISTRO DE USUARIO Y SUS PASOS DIARIOS ");
            System.out.println("4. SALIR: ");

            System.out.print("INGRSE SU OPCIÓN: ");
            OPCION = sc.nextInt();
            sc.nextLine();
            switch (OPCION) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida" + "\n" + "Intente nuevamente.");
            }
        }
    }