//simular proceso de aprobacion de estudiantes por asignatura
//Cada estudiante posee 5 notas, 25%,25%,25%,15%,10%
//Notas aleatorias del 1.0 al 7.0

import java.util.Scanner;

public class Taller01 {

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        int eleccion=0;
        do {
            do {
                opciones();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        agregarEst(crearMatrizEst()); //Crear Matriz
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        mostrarEst(crearMatrizEst());
                        mostrarMatriz(crearMatrizNotas());
                        break;
                    case 6:
                        break;

                }
            }while(eleccion<1 || eleccion>6);
        }while (eleccion != 6);
    }

    public static void opciones() {
        System.out.println("Bienvenido al menu, ingrese su opcion");
        System.out.println("[1] Agregar estudiante");
        System.out.println("[2] Mostrar cantidad de estudiantes que aprueban la asignatura");
        System.out.println("[3] Mostrar cantidad de estudiantes que reprueban la asignatura");
        System.out.println("[4] Mostrar la cantidad de estudiantes que van a examen");
        System.out.println("[5] Mostrar el estado de todos los estudiantes de la asignatura (notas y promedio)");
        System.out.println("[6] Salir");
    }

    public static String[] crearMatrizEst(){  //Crear Matriz Estudiantes
        String [] Estudiantes = new String[50];
        return Estudiantes;
    }

    public static double[][] crearMatrizNotas(){  //Crear matriz notas
        double[][] Notas = new double[50][6];
        return Notas;
    }

    public static void mostrarEst(String[] estudiantes){
        for (int i = 0;i<estudiantes.length;i++){
            System.out.println(estudiantes[i]);
        }
    }

    public static void mostrarMatriz(double[][] notas){
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < (notas[i].length-1); j++) {
                System.out.println(notas[i][i]);
            }
        }
    }

    public static void llenarNotasAl(double[][] notas){
        double numero;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < (notas[i].length-1); j++) {
                numero = (Math.random() * 7);
                notas[i][j] = numero;
                if (j != notas[i].length - 1) System.out.print("\t");
            }
        }
    }

    public static void agregarEst(String[] estudiantes){
        int cont=0;
        for(int i=0; i<cont ;i++){
            estudiantes[i]=nombreEst();
        }
        cont++;
        System.out.println("El numero total de estudiantes es" + cont);
    }

    public static String nombreEst(){
        System.out.println("Ingrese el nombre del estudiante");
        return leer.nextLine();
    }
}