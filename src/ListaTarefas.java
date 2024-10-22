import java.util.ArrayList;

public class ListaTarefas {
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        listaTarefas.add(tarefa);
    }

    public void editarTarefa() {

    }

    public void verTarefa() {
        System.out.println(listaTarefas);
    }

    public void removeTareda() {

    }
}
