import java.util.Date;

public class Noticia implements Operacoes{
    protected int id_postagem;
    protected String titulo, responsavel, conteudo;
    protected Date data;

    public Noticia(){

    }
    public Noticia(int id_postagem, String titulo, String responsavel, String conteudo, Date data){
        this.id_postagem = id_postagem;
        this.titulo = titulo;
        this.responsavel = responsavel;
        this.conteudo = conteudo;
        this.data = data;
    }

    public int getId_postagem() {
        return id_postagem;
    }

    public void setId_postagem(int id_postagem) {
        this.id_postagem = id_postagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void publicar(){

    }

    @Override
    public void remove() {

    }

    @Override
    public void insere() {

    }

    @Override
    public void edita() {

    }

    @Override
    public void consulta() {

    }

    @Override
    public String toString() {
        return "Noticia{" +
                "id_postagem=" + id_postagem +
                ", titulo='" + titulo + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", data=" + data +
                '}';
    }
}
