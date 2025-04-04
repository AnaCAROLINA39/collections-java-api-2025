
import list.CarrinhoDeCompras;
import list.Ordenacao.OrdenccaoPessoa;


public class App {
    public static void main(String[] args) {


OrdenccaoPessoa ordenccaoPessoa = new OrdenccaoPessoa();

ordenccaoPessoa.adcionarPessoa("Nome 1", 20, 1.56);
ordenccaoPessoa.adcionarPessoa("Nome 2", 30, 1.80);
ordenccaoPessoa.adcionarPessoa("Nome 3", 25, 1.70);
ordenccaoPessoa.adcionarPessoa("Nome 4", 17, 1.56);

System.out.println(ordenccaoPessoa.pessoaList);

//System.out.println(ordenccaoPessoa.ordenadoPorIdade());

//System.out.println(ordenccaoPessoa.ordenarPorAltura());


    // CatalogoLivros catalogoLivros = new CatalogoLivros();

  
    // catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2020);
    // catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    // catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    // catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);
    // catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2022);

 
    //     System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

    //     System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020,2022));   

    //     System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));

        //   ListaTarefa listaTarefa = new ListaTarefa();
    //   System.out.println("numero total e : " + listaTarefa.obterNumeroTotalTarefas());

    //   listaTarefa.adicionarTarefa("TAREFA 1");
    //   listaTarefa.adicionarTarefa("TAREFA 1");
    //   listaTarefa.adicionarTarefa("TAREFA 3");
    //   System.out.println("numero total e : " + listaTarefa.obterNumeroTotalTarefas());

    //   listaTarefa.removerTarefa("TAREFA 3");
    //   System.out.println("numero total e : " + listaTarefa.obterNumeroTotalTarefas());

    //   listaTarefa.obterDescricaoTarefa();

    //     CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // // Adicionando itens ao carrinho
    // carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    // carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    // carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    // carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // // Exibindo os itens no carrinho
    // carrinhoDeCompras.exibirItens();

    // // Removendo um item do carrinho
    // carrinhoDeCompras.removerItem("Lápis");

    // // Exibindo os itens atualizados no carrinho
    // carrinhoDeCompras.exibirItens();

    // // Calculando e exibindo o valor total da compra
    // System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
     }
}
