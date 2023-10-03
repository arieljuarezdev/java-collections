package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirTodosProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorEstoque(){
        Produto produtoMaiorQuantidadeValorEstoque = null;
        double maiorValorTotalProdutoEstoque = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()){
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if(valorProdutoEmEstoque > maiorValorTotalProdutoEstoque){
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirTodosProdutos();
        
        estoque.adicionarProduto(01, "produto 1", 1, 6);
        estoque.adicionarProduto(02, "produto 2", 2, 4);
        estoque.adicionarProduto(03, "produto 3", 3, 3);
        estoque.adicionarProduto(04, "produto 4", 3, 2);
        estoque.adicionarProduto(05, "produto 5", 5, 1);
        
        // estoque.exibirTodosProdutos();
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorEstoque());
    }

}
