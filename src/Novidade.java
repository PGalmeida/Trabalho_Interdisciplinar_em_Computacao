import java.util.Date;

public class Novidade extends Noticia{
    private String categoria, destaque;

    public Novidade(){
        super();
    }
    public Novidade(int id_postagem, String titulo, String responsavel, String conteudo, Date data, String categoria, String destaque) {
        super(id_postagem, titulo, responsavel, conteudo, data);
        this.categoria = categoria;
        this.destaque = destaque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDestaque() {
        return destaque;
    }

    public void setDestaque(String destaque) {
        this.destaque = destaque;
    }

    @Override
    public String toString() {
        return "Novidade{" +
                super.toString() +
                "categoria='" + categoria + '\'' +
                ", destaque='" + destaque + '\'' +
                '}';
    }

    @Override
    public void publicar() {

    }
}
