package map.Ordenacao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void exibirProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);

        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("proximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.exibirAgenda();
        
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 2), "evento1", "Atraçao 1");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 5), "evento2", "Atraçao 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 7), "evento3", "Atraçao 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 10, 9), "evento4", "Atraçao 4");
        
        agendaEventos.exibirAgenda();
        agendaEventos.exibirProximoEvento();

    }
}
