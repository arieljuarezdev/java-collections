package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    // Atributos
    private long codigo; // chave primaria
    private String nome;
    private double preco;
    private int quantidade;

    // Constructor
    public Produto(String nome, long codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Comparable
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public long getCodigo() {
        return codigo;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }


    // refatoração de metodos
    @Override
    public boolean equals(Object p) {
        if(this == p) return true;
        if(!(p instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }


    @Override
    public String toString() {
        return "Produto[" + nome + ", cod " + codigo + ", preço " + preco + ", qtd " + quantidade + "]";
    }

}

class ComparetorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}
