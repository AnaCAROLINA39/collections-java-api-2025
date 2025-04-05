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

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventotreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventotreeMap);
    }
     

    public void obterProximoEvento(){
        //Set<LocalDate> dataSet =eventoMap.keySet();

        //eventoMap.get
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventotreeMap = new TreeMap<>(eventoMap);
        for(Map.Entry<LocalDate,Evento> entry : eventotreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                System.out.println("o proixmo evento:" +entry.getValue() + "acontecera na data" + entry.getKey());
                break;
            }
        }
    }
}
