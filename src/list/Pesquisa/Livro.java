package list.Pesquisa;

public class Livro {
    //ATRIBUTOS
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this. anoPublicacao = anoPublicacao;
    }

    //GETTERS
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "livro{" + "TITULO: " + titulo + 
                    '/' + "AUTOR: " + autor +
                    '/' + "PUBLICAÇÃO: " + anoPublicacao + "}";
    }
}
