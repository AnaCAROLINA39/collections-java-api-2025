package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadrastroProduto {
    
    public Set<Produto> produtoSet;

    public CadrastroProduto() {
        this.produtoSet = new HashSet<>();
    }


    public void adcionarProduto(int codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo,nome, preco,quantidade));
    }

   public Set<Produto> exibirProduto(){
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
   }

 public Set<Produto> exibirProdutoPorPreco(){
    Set<Produto> produtosPorPreco = new TreeSet<>( new exibirProdutoPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
 }
}
