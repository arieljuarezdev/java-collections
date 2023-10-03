package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContantoMap;
 
    public AgendaContatos() {
        this.agendaContantoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContantoMap.put(nome, telefone);
    }
    
    public void removerContato(Object nome){
       if(!agendaContantoMap.isEmpty()){
           agendaContantoMap.remove(nome);
       }
    }

    public void exibirContatos(){
        System.out.println(agendaContantoMap);
    }

    public Integer pesquisaPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContantoMap.isEmpty()){
           numeroPorNome = agendaContantoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        
        agendaContatos.adicionarContato("Naruto", 21);
        agendaContatos.adicionarContato("Goku", 222);
        agendaContatos.adicionarContato("Shinishi", 16);
        agendaContatos.adicionarContato("Ryuk", 02);
        
        // agendaContatos.removerContato("Shinishi");
        agendaContatos.exibirContatos();

        //  System.out.println(agendaContatos.pesquisaPorNome("Naruto"));
    }

}
