package StreamingMusical;

public class Artiste {
    protected String id;
    protected String nomDeScene;
    protected int anneeDebut;
    protected String nationalite;

    public Artiste(String id, String nomDeScene, int anneeDebut, String nationalite) {
        this.id = id;
        this.nomDeScene = nomDeScene;
        this.anneeDebut = anneeDebut;
        this.nationalite = nationalite;
    }
}