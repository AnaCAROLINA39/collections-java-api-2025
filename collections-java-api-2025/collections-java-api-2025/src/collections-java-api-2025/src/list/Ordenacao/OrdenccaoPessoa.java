package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenccaoPessoa {
    

    public List<Pessoa> pessoaList;

    public OrdenccaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adcionarPessoa(String nome, int idade, double altura){      
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

public List<Pessoa> ordenadoPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
}

public List<Pessoa> ordenarPorAltura(){
    List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
    return pessoasPorAltura;
}
}
