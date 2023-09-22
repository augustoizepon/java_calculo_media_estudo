import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
    operacoes(args);
    }

    public static void operacoes(String[] args){
        int[] arrayNotas = new int[args.length];
        int somaTotal = 0;
       for (int i = 0; i < args.length; i++){
           int nota = Integer.parseInt(args[i]);
           arrayNotas[i] = nota;
           somaTotal += nota;
        }
        int media = somaTotal / args.length;

        System.out.println(media);


    }

}