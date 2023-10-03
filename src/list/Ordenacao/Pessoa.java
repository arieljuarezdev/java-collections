package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable <Pessoa>{
    // ATRIBUTOS
    private String nome;
    private int idade;
    private double altura;

    // CONSTRUTOR
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // COMPARABLE
    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    // METODOS ACESSORES
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    
    // TOSTRING
    @Override
    public String toString() {
        // 
        return "Pessoa{" + "Nome: " + nome + "/ " 
                         + "Idade: " + idade + "/ " 
                         + "Altura: " + altura + "}";
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
    
}