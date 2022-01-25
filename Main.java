import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean exit = false; // Trocar para true para desativar loop.

        while(!exit){
            System.out.print("\n\nDigite o valor para saque: ");
            int valor = scanner.nextInt();
            
            CaixaEletronico caixa = new CaixaEletronico();
            Saque saque = caixa.Calcula(valor);

            System.out.print("Entregar ");
            if(saque.getNota100() != 0){
                System.out.print(saque.getNota100() + " nota de R$100,00 ");
            }
            if(saque.getNota50() != 0){
                System.out.print(saque.getNota50() + " nota de R$50,00 ");
            }
            if(saque.getNota20() != 0){
                System.out.print(saque.getNota20() + " nota de R$20,00 ");
            }
            if(saque.getNota10() != 0){
                System.out.print(saque.getNota10() + " nota de R$10,00 ");
            }
        }
    } 
}
