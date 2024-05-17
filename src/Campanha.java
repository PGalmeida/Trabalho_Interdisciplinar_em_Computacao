import java.util.Date;

public class Campanha extends  Noticia{
    private String objetivo;
    private Date data_inicio, data_fim;

    public Campanha(){
        super();
    }

    public Campanha(int id_postagem, String titulo, String responsavel, String conteudo, Date data, String objetivo, Date data_inicio, Date data_fim) {
        super(id_postagem, titulo, responsavel, conteudo, data);
        this.objetivo = objetivo;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }

    @Override
    public String toString() {
        return "Campanha{" +
                super.toString() +
                "objetivo='" + objetivo + '\'' +
                ", data_inicio=" + data_inicio +
                ", data_fim=" + data_fim +
                '}';
    }

    @Override
    public void publicar() {
    }
}
