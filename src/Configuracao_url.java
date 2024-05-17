public class Configuracao_url {
    private String protocolo, dominio, caminho;
    public Configuracao_url(){

    }

    public Configuracao_url(String protocolo, String dominio, String caminho) {
        this.protocolo = protocolo;
        this.dominio = dominio;
        this.caminho = caminho;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    @Override
    public String toString() {
        return "Configuracao_url{" +
                "protocolo='" + protocolo + '\'' +
                ", dominio='" + dominio + '\'' +
                ", caminho='" + caminho + '\'' +
                '}';
    }
    public void configurar(){

    }
}
