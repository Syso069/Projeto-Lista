import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner numeroDigitado = new Scanner(System.in);
        Menu mostraMenu = new Menu();

        while (opcao != 5){
            System.out.println("\nTO DO LIST\n" + mostraMenu.menu);
            opcao = numeroDigitado.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Chama classe e/ou função criar lista");
                    break;
                case 2:
                    System.out.println("Chama classe e/ou função editar lista");
                    break;
                case 3:
                    System.out.println("Chama classe e/ou função visualizar lista");
                    break;
                case 4:
                    System.out.println("Chama classe e/ou função excluir lista");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!a");
            }
        }
    }
}