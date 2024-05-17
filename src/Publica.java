import java.util.Date;

public class Publica {
    private Date data_publica;
    private String autor;
    Noticia noticia;
    Site site;

    public Publica(){

    }

    public Publica(Date data_publica, String autor, Noticia noticia, Site site) {
        this.data_publica = data_publica;
        this.autor = autor;
        this.noticia = noticia;
        this.site = site;
    }

    public Date getData_publica() {
        return data_publica;
    }

    public void setData_publica(Date data_publica) {
        this.data_publica = data_publica;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "Publica{" +
                "data_publica=" + data_publica +
                ", autor='" + autor + '\'' +
                ", noticia=" + noticia +
                ", site=" + site +
                '}';
    }
}
