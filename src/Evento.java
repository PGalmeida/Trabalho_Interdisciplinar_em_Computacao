import java.util.Date;

public class Evento extends Noticia{
    private String local, horas, participantes;
    private Date data_evento;

    public Evento(){
        super();
    }

    public Evento(int id_postagem, String titulo, String responsavel, String conteudo, Date data, String local, String horas, String participantes, Date data_evento) {
        super(id_postagem, titulo, responsavel, conteudo, data);
        this.local = local;
        this.horas = horas;
        this.participantes = participantes;
        this.data_evento = data_evento;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public Date getData_evento() {
        return data_evento;
    }

    public void setData_evento(Date data_evento) {
        this.data_evento = data_evento;
    }

    @Override
    public String toString() {
        return "Evento{" +
                super.toString() +
                "local='" + local + '\'' +
                ", horas='" + horas + '\'' +
                ", participantes='" + participantes + '\'' +
                ", data_evento=" + data_evento +
                '}';
    }

    @Override
    public void publicar() {

    }
}
