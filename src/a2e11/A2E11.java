import java.util.Random;

public class A2E11 {

    public static void main(String[] args) {

        // variables a utilizar
        int Impares = 0;
        int SumaPares = 0;
        int Pares = 0;
        int PromPares;
        int Docena = 0;
        int NumMayor = 0;
        int Contador = 0;
        int Generado;
        int Comprobacion;
        
        //hacer un ciclo que gire la ruleta 10 veces
        do {
            
            //generar numero aleatoreo
            Random Aleatoreo = new Random();
            Generado = Aleatoreo.nextInt(36) + 1;
            Comprobacion = Generado % 2;
            
            //ver si el numero es par
            if (Comprobacion == 0) {

                SumaPares += Generado;
                Pares++;

            }
            
            // veri si el numero es impar
            if (Comprobacion != 0) {

                Impares++;

            }
            // ver si el numero esta entre la segunda docena
            if ((Generado >= 13) && (Generado <= 24)) {

                Docena++;

            }
            
            //encontrar el mayor numero generado 
            if (Generado > NumMayor) {

                NumMayor = Generado;

            }

            Contador++;

        } while (Contador < 10);

        PromPares = SumaPares / Pares;

        System.out.println("Cantidad de numeros impares: " + Impares);
        System.out.println("El promedio de numeros pares: " + PromPares);
        System.out.println("Cantidad de numeros que se encuntra en la docena (13 al 24): " + Docena);
        System.out.println("El numero mas grande es: " + NumMayor);
    }

}
