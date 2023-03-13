public class Musico extends Artista {
    String atuacao;

    public Musico(String nome, String dataNascimento, String premiacoes, String genero, String atuacao) {
        super(nome, dataNascimento, premiacoes, genero);
        this.atuacao = atuacao;
    }

    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }
}
