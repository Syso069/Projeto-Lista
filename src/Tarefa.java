public class Tarefa {
    private String descricao;
    private boolean status = false;

    public String getDescricao() {
        return descricao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public Tarefa() {

    }

    @Override
    public String toString() {
        return descricao;
    }
}