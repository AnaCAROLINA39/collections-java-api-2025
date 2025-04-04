import list.CarrinhoDeCompras;
import list.ListaTarefa;

public class App {
    public static void main(String[] args) throws Exception {
    //   ListaTarefa listaTarefa = new ListaTarefa();
    //   System.out.println("numero total e : " + listaTarefa.obterNumeroTotalTarefas());

    //   listaTarefa.adicionarTarefa("TAREFA 1");
    //   listaTarefa.adicionarTarefa("TAREFA 1");
    //   listaTarefa.adicionarTarefa("TAREFA 3");
    //   System.out.println("numero total e : " + listaTarefa.obterNumeroTotalTarefas());

    //   listaTarefa.removerTarefa("TAREFA 3");
    //   System.out.println("numero total e : " + listaTarefa.obterNumeroTotalTarefas());

    //   listaTarefa.obterDescricaoTarefa();

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

    // Adicionando itens ao carrinho
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
    carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
    carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

    // Exibindo os itens no carrinho
    carrinhoDeCompras.exibirItens();

    // Removendo um item do carrinho
    carrinhoDeCompras.removerItem("Lápis");

    // Exibindo os itens atualizados no carrinho
    carrinhoDeCompras.exibirItens();

    // Calculando e exibindo o valor total da compra
    System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
