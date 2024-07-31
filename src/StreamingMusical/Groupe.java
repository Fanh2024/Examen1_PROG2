package StreamingMusical;

import java.util.List;

public class Groupe extends Artiste{
    private List<ArtisteSolo> membres;

    public Groupe(String id, String nomDeScene, int anneeDebut, String nationalite, List<ArtisteSolo> membres) {
        super(id, nomDeScene, anneeDebut, nationalite);
        this.membres = membres;
    }
}
