import java.util.Scanner;

public class RomanoParaInt {
    public static int AlgarismoRomanoParaInteiro(String s) {
        s = s.toUpperCase();
        int total = 0;
        int maiorValor = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char atual = s.charAt(i);
            int valorAtual = 0;
            
            if (atual == 'I') valorAtual = 1;
            else if (atual == 'V') valorAtual = 5;
            else if (atual == 'X') valorAtual = 10;
            else if (atual == 'L') valorAtual = 50;
            else if (atual == 'C') valorAtual = 100;
            else if (atual == 'D') valorAtual = 500;
            else if (atual == 'M') valorAtual = 1000;
            
            if (valorAtual < maiorValor) {
                total -= valorAtual;
            } else {
                total += valorAtual;
                maiorValor = valorAtual;
            }
        }
        
        return total;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String algarismos = String.join("", args);
            int valor = AlgarismoRomanoParaInteiro(algarismos);
            System.out.println(valor);
            return;
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o algarismo: ");
        String algarismos = sc.nextLine();

        int valor = AlgarismoRomanoParaInteiro(algarismos);
        System.out.println(valor);
    }
}
