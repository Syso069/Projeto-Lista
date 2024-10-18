import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner numeroDigitado = new Scanner(System.in);
        Menu mostraMenu = new Menu();
        Lista lista = new Lista();

        while (opcao != 5){
            System.out.println("\nTO DO LIST\n" + mostraMenu.menu);
            opcao = numeroDigitado.nextInt();

            switch (opcao){
                case 1:
                    lista.criaLista();
                    break;
                case 2:
                    lista.editaLista();
                    break;
                case 3:
                    lista.verLista();
                    break;
                case 4:
                    lista.excluirLista();
                    break;
                case 5:
                    lista.saiDaLista();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}