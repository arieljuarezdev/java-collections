package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTafera(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefe(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("numero total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.adicionarTafera("tarefa 1");
        listaTarefa.adicionarTafera("tarefa 1");
        listaTarefa.adicionarTafera("tarefa 3");
        System.out.println("numero total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefe("tarefa 1");
        listaTarefa.obterDescricoesTarefas();

        System.out.println("numero total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
    }

}
