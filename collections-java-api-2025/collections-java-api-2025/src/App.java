
// import list.CarrinhoDeCompras;
// import list.Ordenacao.OrdenccaoPessoa;

//import Set.OperacoesBasicas.ConjuntoConvidado;

// import Set.Ordenacao.CadrastroProduto;
// import Set.Pesquisa.AgendaContatos;

//import map.OperacoesBasica.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;

import map.Ordenacao.AgendaEventos;
import map.Pesquisa.EstoqueProdutos;

public class App {
     public static void main(String[] args) {

        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 15), "EVENTO 1", "ATRACAO 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 9), "EVENTO 2", "ATRACAO 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.APRIL, 6), "EVENTO 3", "ATRACAO 3");
        agendaEventos.adicionarEvento(LocalDate.of(2000, Month.APRIL, 9), "EVENTO 4", "ATRACAO 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.APRIL, 9), "EVENTO 5", "ATRACAO 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER, 20), "EVENTO 6", "ATRACAO 4");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();


//             EstoqueProdutos estoque = new EstoqueProdutos();

//     // Exibe o estoque vazio
//     estoque.exibirProdutos();

//     // Adiciona produtos ao estoque
//     estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
//     estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
//     estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
//     estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

//     // Exibe os produtos no estoque
//     estoque.exibirProdutos();

//     // Calcula e exibe o valor total do estoque
//     System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

//     // // Obtém e exibe o produto mais caro
//    // Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
//     System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());

    // // Obtém e exibe o produto mais barato
    // Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
    // System.out.println("Produto mais barato: " + produtoMaisBarato);

    // // Obtém e exibe o produto com a maior quantidade em valor no estoque
    // Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
    // System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);

        // AgendaContatos agendaContatos = new AgendaContatos();

        // agendaContatos.adicionarContato("Camila", 123456);
        // agendaContatos.adicionarContato("Camila", 5665);
        // agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        // agendaContatos.adicionarContato("Camila DIO", 654987);
        // agendaContatos.adicionarContato("Maria Silva", 111111);
        // agendaContatos.adicionarContato("Camila", 44444);
        // agendaContatos.adicionarContato("Camila", 564);

        //  agendaContatos.exibirContatos();

        //  agendaContatos.removerContatoMap("Maria Silva");

        // agendaContatos.exibirContatos();

        // System.out.println("O numero e: "+ agendaContatos.pesquisarPorNome("Camila Dio"));

        // CadrastroProduto cadrastroProduto = new CadrastroProduto();

        // cadrastroProduto.adcionarProduto(1, "Produto 5", 15d, 5);
        // cadrastroProduto.adcionarProduto(2, "Produto 0", 20d, 10);
        // cadrastroProduto.adcionarProduto(1, "Produto 3", 10d, 2);
        // cadrastroProduto.adcionarProduto(9, "Produto 9", 2d, 2);

        // System.out.println(cadrastroProduto.produtoSet);

        // System.out.println(cadrastroProduto.exibirProduto());

        // System.out.println(cadrastroProduto.exibirProdutoPorPreco());

        // AgendaContatos agendaContatos = new AgendaContatos();


        // agendaContatos.exibirContatos();

        // agendaContatos.adicionarContator("CamiLa", 123456);
        // agendaContatos.adicionarContator("CamiLa", 5665);
        // agendaContatos.adicionarContator("CamiLa Cavalcante", 1111111);
        // agendaContatos.adicionarContator("CamiLa Dio", 654987);
        // agendaContatos.adicionarContator("maria silva", 1111111);


        // agendaContatos.exibirContatos();

        // System.out.println(agendaContatos.pesquisarPorNome("maria"));
        // System.out.println("Contato atualizado " + agendaContatos.atualizarNumeroContato("maria silva", 555555));

        // agendaContatos.exibirContatos();

    //     ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();

    //     System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de convidados");


    //     conjuntoConvidado.adicionarConvidado("Convidado 1",1234);
    //     conjuntoConvidado.adicionarConvidado("Convidado 2",1235);
    //     conjuntoConvidado.adicionarConvidado("Convidado 3",1235);
    //     conjuntoConvidado.adicionarConvidado("Convidado 4",1236);
    //     System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de convidados");

    //     conjuntoConvidado.removerConvidadoPOrCondigoCovite(1234);
    //     System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados dentro do Set de convidados");

    //     conjuntoConvidado.exibirConvidados();


// OrdenccaoPessoa ordenccaoPessoa = new OrdenccaoPessoa();

// ordenccaoPessoa.adcionarPessoa("Nome 1", 20, 1.56);
// ordenccaoPessoa.adcionarPessoa("Nome 2", 30, 1.80);
// ordenccaoPessoa.adcionarPessoa("Nome 3", 25, 1.70);
// ordenccaoPessoa.adcionarPessoa("Nome 4", 17, 1.56);

// System.out.println(ordenccaoPessoa.pessoaList);

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
