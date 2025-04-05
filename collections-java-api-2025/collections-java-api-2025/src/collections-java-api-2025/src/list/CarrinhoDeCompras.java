package list;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> ItemList;

    public CarrinhoDeCompras() {
        this.ItemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.ItemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!ItemList.isEmpty()) {
            for (Item i : ItemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            ItemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

  public double calcularValorTotal(){
    double valorTotal = 0d;
    if (!ItemList.isEmpty()) {
        for(Item item : ItemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal+=valorItem;
        }
        return valorTotal;
    } else {
        throw new RuntimeException("A lista esta Vazia!");
    }
  }

    public void exibirItens() {
        if (!ItemList.isEmpty()) {
            System.out.println(this.ItemList);
        } else {
            System.out.println("A LISTA ESTA VAIZA!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras [ItemList=" + ItemList + "]";
    }


}
