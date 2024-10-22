import java.util.Scanner;

public class Lista {
    Scanner valorDeEntrada = new Scanner(System.in);
    public void criaLista() {
        System.out.println("Digite o nome da lista que deseja criar:");
        String nome =  valorDeEntrada.nextLine();
        System.out.println("O nome da lista que você deu é: " + nome);
    }

    public  void editaLista() {
        System.out.println("Chamando função edita lista");
    }

    public  void verLista() {
        System.out.println("Chamando função ver lista");
    }

    public void excluirLista() {
        System.out.println("Chamando função excluir lista");
    }

    public void saiDaLista() {
        System.out.println("Chamando função saindo lista...");
    }
}