package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

 public void adicionarConvidado(String nome, int codigoConvite){
    convidadoSet.add(new Convidado(nome, codigoConvite));
 }

 public void removerConvidadoPOrCondigoCovite(int codigoConvite){
    Convidado convidadePraRemover = null;
    for(Convidado c: convidadoSet) {
        if(c.getCodigoConvite() == codigoConvite) {
            convidadePraRemover = c;
            break;
        }
    }   
    convidadoSet.remove(convidadePraRemover);
 }

 public int contarConvidados(){
    return convidadoSet.size();
 }

 public void exibirConvidados() {
    System.out.println(convidadoSet);
 }
}
