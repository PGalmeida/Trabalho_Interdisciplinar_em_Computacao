import java.util.ArrayList;
import java.util.List;

public class Site {
    private String nome, url;
    private List<Configuracao_url> configuracao_urls;

    public Site(){
        this.configuracao_urls = new ArrayList<Configuracao_url>();
    }

    public Site(String nome, String url) {
        this.nome = nome;
        this.url = url;
        this.configuracao_urls = new ArrayList<Configuracao_url>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Configuracao_url> getConfiguracao_urls() {
        return configuracao_urls;
    }

    public void setConfiguracao_urls(List<Configuracao_url> configuracao_urls) {
        this.configuracao_urls = configuracao_urls;
    }

    public void addConfiguracao_url(String protocolo, String dominio, String caminho){
        this.configuracao_urls.add(new Configuracao_url(protocolo, dominio, caminho));
    }

    @Override
    public String toString() {
        return "Site{" +
                "nome='" + nome + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
