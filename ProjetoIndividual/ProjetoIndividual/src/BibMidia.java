public class BibMidia {
    String[] midias_geral ;
    String usuario;
    String [] playlist_unica;
    int midiaAtual;

    public BibMidia(String[] midias_geral, String usuario, String[] playlist_unica) {
        this.midias_geral = midias_geral;
        this.usuario = usuario;
        this.playlist_unica = playlist_unica;
    }

    public String[] getMidias_geral() {
        return midias_geral;
    }

    public void setMidias_geral(String[] midias_geral) {
        this.midias_geral = midias_geral;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String[] getPlaylist_unica() {
        return playlist_unica;
    }

    public void setPlaylist_unica(String[] playlist_unica) {
        this.playlist_unica = playlist_unica;

    }
}
