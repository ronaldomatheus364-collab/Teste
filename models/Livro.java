public class Livro {

    // Atributos

    private int idLivro;
    private String titulo;
    private String autor;
    private String dataLancamento;

    // Construtor

    public Livro(int idLivro, String titulo, String autor, String dataLancamento) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
    }

    // Métodos getters e setters

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    

    

}
