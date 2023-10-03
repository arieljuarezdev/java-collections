package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    private Set <Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set <Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set <Produto> exibirPorPreco(){
        Set <Produto> produtosPorPreco = new TreeSet<>(new ComparetorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("coisa 1" , 111, 1.5, 10);
        cadastroProdutos.adicionarProduto("coisa 2" , 122, 1.3, 7);
        cadastroProdutos.adicionarProduto("coisa 3" , 121, 1.0, 4);

        // System.out.println(cadastroProdutos.produtoSet);

        // System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());

    }

}
