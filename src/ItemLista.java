import java.util.Scanner;

public class ItemLista {
    public void subMenu() {
        ListaTarefas listaTarefas = new ListaTarefas();
        int opcaoItemLista = 0;
        Scanner numeroItemDigitado = new Scanner(System.in);
        Scanner tarefaEscrita = new Scanner(System.in);
        Menu mostraItemMenu = new Menu();

        while (opcaoItemLista != 5){
            System.out.println("\nTO DO LIST\n" + mostraItemMenu.menu);
            opcaoItemLista = numeroItemDigitado.nextInt();

            switch (opcaoItemLista){
                case 1:
                    System.out.println("Tarefa: ");
                    String tarefaDigitada = tarefaEscrita.nextLine();
                    Tarefa tarefa =  new Tarefa(tarefaDigitada);
                    listaTarefas.adicionarTarefa(tarefa);
                    break;
                case 2:
                    System.out.println("Digite o true para concluido e false para não concluido: ");
                    boolean editarStatus = tarefaEscrita.nextBoolean();
                    listaTarefas.editarTarefa(editarStatus);
                    break;
                case 3:
                    listaTarefas.verTarefa();
                    break;
                case 4:
                    System.out.println("Digite o indice do item que deseja remover: ");
                    int removeTarefa =  numeroItemDigitado.nextInt();
                    listaTarefas.removeTarefa(removeTarefa);
                    break;
                case 5:
                    listaTarefas.sairTarefa();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
