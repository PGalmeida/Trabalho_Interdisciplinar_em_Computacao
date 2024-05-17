import java.util.Date;

public class Promocao extends Noticia{
    private String produto;
    private int desconto;
    private Date validade;

    public Promocao(){
        super();
    }

    public Promocao(int id_postagem, String titulo, String responsavel, String conteudo, Date data, String produto, int desconto, Date validade) {
        super(id_postagem, titulo, responsavel, conteudo, data);
        this.produto = produto;
        this.desconto = desconto;
        this.validade = validade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    @Override
    public String toString() {
        return "Promocao{" +
                super.toString() +
                "produto='" + produto + '\'' +
                ", desconto=" + desconto +
                ", validade=" + validade +
                '}';
    }

    @Override
    public void publicar() {

    }
}
