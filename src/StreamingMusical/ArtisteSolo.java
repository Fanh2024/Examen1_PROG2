package StreamingMusical;

import java.time.LocalDate;

public class ArtisteSolo extends Artiste{
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    public ArtisteSolo(String id, String nomDeScene, int anneeDebut, String nationalite, String nom, String prenom, LocalDate dateNaissance) {
        super(id, nomDeScene, anneeDebut, nationalite);
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }
}
