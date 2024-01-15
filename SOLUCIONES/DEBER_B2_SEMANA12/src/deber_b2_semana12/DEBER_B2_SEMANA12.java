package deber_b2_semana12;

import java.util.Scanner;

public class DEBER_B2_SEMANA12 {

    public class EJERCICIO_01 {

        public static double promedioMatriz(int[][] matriz, int limf, int limic) {
            double promedio = 0;

            for (int i = 0; i < limf; i++) {
                for (int j = 0; j < limic; j++) {
                    promedio += matriz[i][j];
                }
            }

            return promedio / (limf * limic);
        }

        public static void numerosImpares(int[][] matriz, int limf, int limic) {
            for (int i = 0; i < limf; i++) {
                for (int j = 0; j < limic; j++) {
                    if (matriz[i][j] % 2 != 0) {
                        System.out.printf("%d\t| ", matriz[i][j]);
                    } else {
                        System.out.printf(" \t| ");
                    }
                }
                System.out.println();
            }
        }

        public static void numerosPares(int[][] matriz, int limf, int limic) {
            for (int i = 0; i < limf; i++) {
                for (int j = 0; j < limic; j++) {
                    if (matriz[i][j] % 2 == 0) {
                        System.out.printf("%d\t| ", matriz[i][j]);
                    } else {
                        System.out.printf(" \t| ");
                    }
                }
                System.out.println();
            }
        }

        public static void generarMatriz(int matriz[][], int limf, int limic) {
            for (int i = 0; i < limf; i++) {
                for (int j = 0; j < limic; j++) {
                    matriz[i][j] = (int) (Math.random() * 100);
                }
            }
        }

        public static void imprimirMatriz(int[][] matriz, int limf, int limic) {
            for (int i = 0; i < limf; i++) {
                for (int j = 0; j < limic; j++) {
                    System.out.printf("%d\t| ", matriz[i][j]);
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("INGRESE EL NUMERO DE FILAS DE LA MATRIZ:");
            int limf = teclado.nextInt();

            System.out.println("INGRESE EL NUMERO DE COLUMNAS DE LA MATRIZ:");
            int limic = teclado.nextInt();

            int matrizPrincipal[][] = new int[limf][limic];

            generarMatriz(matrizPrincipal, limf, limic);
            System.out.println("LA MATRIZ ES:");
            imprimirMatriz(matrizPrincipal, limf, limic);

            System.out.println("NUMEROS PARES DE LA MATRIZ:");
            numerosPares(matrizPrincipal, limf, limic);

            System.out.println("NUMEROS IMPARES DE LA MATRIZ:");
            numerosImpares(matrizPrincipal, limf, limic);

            double promedio = promedioMatriz(matrizPrincipal, limf, limic);
            System.out.println("EL PROMEDIO DE LA MATRIZ ES: ");
            System.out.println(promedio);
        }
    }

    public class ejercicio_02 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("QUE DESEA REALIZAR?");
            System.out.println("area de un cuadrado: 1");
            System.out.println("area de un triangulo: 2");
            System.out.println("area de un rectangulo: 3");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el lado del cuadrado: ");
                    double ladoCuadrado = teclado.nextDouble();
                    double areaCuadrado = areaCuadrado(ladoCuadrado);
                    System.out.println("El area del cuadrado es: " + areaCuadrado);
                    break;
                case 2:
                    System.out.println("ingrese la base del triangulo");
                    double baseRectangulo = teclado.nextDouble();
                    System.out.println("ingrese la altura");
                    double alturaRectangulo = teclado.nextDouble();
                    double areaRectangulo = areaRectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("El area del cuadrado es: " + areaRectangulo);
                    break;
                case 3:
                    System.out.println("ingrese la base del rectangulo:");
                    double baseTriangulo = teclado.nextDouble();
                    System.out.println("ingrese la altura");
                    double alturaTriangulo = teclado.nextDouble();
                    double areaTriangulo = areaTriangulo(alturaTriangulo, baseTriangulo);
                    System.out.println("El area del cuadrado es: " + areaTriangulo);
                    break;

                default:
                    System.out.println("Opción no valida");
            }
        }

        public static double areaCuadrado(double lado) {
            return lado * lado;
        }

        public static double areaRectangulo(double baseRectangulo, double alturaRectangulo) {
            return baseRectangulo * alturaRectangulo;
        }

        public static double areaTriangulo(double alturaTriangulo, double baseTriangulo) {
            return (baseTriangulo * alturaTriangulo) / 2;
        }

    }

    public class ejercicio_03 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("Ingrese el primer valor decimal: ");
            double valor1 = teclado.nextDouble();

            System.out.print("Ingrese el segundo valor decimal: ");
            double valor2 = teclado.nextDouble();

            System.out.print("Ingrese el tercer valor decimal: ");
            double valor3 = teclado.nextDouble();

            System.out.print("Ingrese el cuarto valor decimal: ");
            double valor4 = teclado.nextDouble();

            String resultado = calcularPromedioCualitativo(valor1, valor2, valor3, valor4);

            System.out.println("El promedio cualitativo es: " + resultado);
        }

        public static String calcularPromedioCualitativo(double valor1, double valor2, double valor3, double valor4) {
           
            double promedio = (valor1 + valor2 + valor3 + valor4) / 4;

      
            if (promedio >= 0 && promedio <= 5) {
                return "Regular";
            } else if (promedio > 5 && promedio <= 8) {
                return "Bueno";
            } else if (promedio > 8 && promedio <= 9) {
                return "Muy Bueno";
            } else if (promedio > 9 && promedio <= 10) {
                return "Sobresaliente";
            } else {
                return "En toda mi vida no he visto una nota desta magnitud, no la puedo clasificar";
            }
        }

    }

    public class ejercicio_04 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.println("Ingrese su nombre completo:");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese su cedula:");
            String cedula = teclado.next();

            System.out.println(nombre + ", que desea realizar el dia de hoy?");
            System.out.println("Pagar la luz: 1");
            System.out.println("Pagar el predio: 2");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el precio del kilovatio:");
                    double precioKilovatio = teclado.nextDouble();
                    System.out.println("Ingrese el consumo de kilovatios del mes:");
                    double consumoKilovatio = teclado.nextDouble();
                    System.out.println(nombre + " con cedula: " + cedula + " debe pagar: " + planillaLuz(consumoKilovatio, precioKilovatio));
                    break;
                case 2:
                    System.out.println("ingrese el valor del inmueble");
                    double valorInmueble = teclado.nextDouble();
                    System.out.println(nombre + " con cedula: " + cedula + " debe pagar: " + predio(valorInmueble));
                    break;

                default:
                    System.out.println("Opción no valida");
            }
        }

        public static double planillaLuz(double consumoKilovatio, double precioKilovatio) {
            return consumoKilovatio * precioKilovatio;
        }

        public static double predio(double valorInmueble) {
            return (valorInmueble * 0.02);

        }
    }

    public class ejercicio_05 {

        public static void generarMatriz(int matriz[][], int limif, int limic) {
            for (int i = 0; i < limif; i++) {
                for (int j = 0; j < limic; j++) {
                    matriz[i][j] = (int) (Math.random() * 10);
                }
            }
        }

        public static double sumar(int matriz[][], int limif, int limic) {
            double suma = 0;
            for (int i = 0; i < limif; i++) {
                for (int j = 0; j < limic; j++) {
                    suma += matriz[i][j];
                }
            }
            return suma;
        }

        public static double resta(int matriz[][], int limif, int limic) {
            double resta = 0;
            for (int i = 0; i < limif; i++) {
                for (int j = 0; j < limic; j++) {
                    resta = matriz[i][j] - resta;
                }
            }
            return resta;
        }

        public static double multiplicar(int matriz[][], int limif, int limic) {
            double multiplicacion = 1;
            for (int i = 0; i < limif; i++) {
                for (int j = 0; j < limic; j++) {
                    multiplicacion *= matriz[i][j];
                }
            }
            return multiplicacion;
        }

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese las filas:");
            int limif = teclado.nextInt();
            System.out.println("Ingrese las columnas:");
            int limic = teclado.nextInt();

       
            int matriz[][] = new int[limif][limic];

            generarMatriz(matriz, limif, limic);

           
            System.out.println("Matriz generada:");
            for (int i = 0; i < limif; i++) {
                for (int j = 0; j < limic; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }

            double suma = sumar(matriz, limif, limic);
            System.out.println("Respuesta suma: " + suma);
            double restar = resta(matriz, limif, limic);
            System.out.println("Respuesta resta: " + restar);
            double multi = multiplicar(matriz, limif, limic);
            System.out.println("Respuesta multiplicacion: " + multi);

        }
    }
}
