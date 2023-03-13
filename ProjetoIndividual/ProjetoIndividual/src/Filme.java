

public class Filme extends Midia {
    private int duracao;
    private String tipo;
    private String[] elenco = new String[5];
    private String diretor;
    private String produtor;

    public Filme(String titulo, String ano, String genero, int duracao, String tipo, String[] elenco, String diretor, String produtor) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.tipo = tipo;
        this.elenco = elenco;
        this.diretor = diretor;
        this.produtor = produtor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        if(duracao > 90){
            this.setTipo("Longo");
        } else{
            this.setTipo("Curto");
        }
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }
}
