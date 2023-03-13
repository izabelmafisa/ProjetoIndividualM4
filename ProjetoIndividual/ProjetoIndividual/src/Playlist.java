public class Playlist {
    private String[] midia = new String[30];
    private int ordem_de_execucao ;
    private int midia_atual ;

    public Playlist(String[] midia, int ordem_de_execucao) {
        this.midia = midia;
        this.ordem_de_execucao = ordem_de_execucao;
        this.midia_atual = 0;
    }

    public String[] getMidia() {
        return midia;
    }

    public void setMidia(String[] midia) {
        this.midia = midia;

    }
    public void tocarMidia(String[] midia) {
        int i;
        for (i = 0; midia.length<i;i++) {
            System.out.println("tocando midias:" + midia[i]);
        };
        this.midia_atual = i;

    }

    public void proxMidia(){
        System.out.println("tocando proxima midia");

    }

    public void voltarMidia() {
        int i;
        for (i = midia.length; i >= 0; i--) {
            System.out.println("tocando midia anterior:" + midia[i]);
        }
        ;
        this.midia_atual = i;
    }

    public void misturarMidia(){
        System.out.println("misturando midias");
    }

    public int getOrdem_de_execucao() {
        return ordem_de_execucao;
    }

    public void setOrdem_de_execucao(int ordem_de_execucao) {
        this.ordem_de_execucao = ordem_de_execucao;
    }

    public int getMidia_atual() {
        return midia_atual;
    }

    public void setMidia_atual(int midia_atual) {
        this.midia_atual = midia_atual;
    }
}
