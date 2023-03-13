public class Musica extends Midia {
    private  String duracao;
    private  String cantor;
    private  Double notas;

    public Musica(String titulo, String ano, String genero, String duracao, String cantor, Double notas) {
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.cantor = cantor;
        this.notas = notas;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public Double getNotas() {
        if (notas >0 && notas <=5){
            System.out.println("Obrigado por avaliar");
        } else {
            System.out.println("Avaliar entre 1 e 5");
        }
        return notas;
    }

    public void setNotas(Double notas) {
        this.notas = notas;

    }
}
