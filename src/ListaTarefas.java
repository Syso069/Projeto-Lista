import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();
    Tarefa tarefa = new Tarefa();

    public void adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public void editarTarefa(boolean editarStatus) {
        tarefa.setStatus(editarStatus);
        System.out.println(tarefa.isStatus());
    }

    public void verTarefa() {
        if (listaTarefas.isEmpty()){
            System.out.println("A lista está vazia! ");
        }else {
            System.out.println("Lista: ");
            for (int i = 0; i < listaTarefas.size(); i++) {
                System.out.println(i + "- " + listaTarefas.get(i) + " status: " + tarefa.isStatus());
            }
        }
    }

    public void removeTarefa(int remover) {
        if (remover >= 0 && remover < listaTarefas.size() ){
            listaTarefas.remove(remover);
            System.out.println("Tarefa removida com sucesso!");
        }else {
            System.out.println("Indice inválido.Tente novamente: ");
        }
    }

    public void sairTarefa() {
        System.out.println("Saindo...");
    }
}
