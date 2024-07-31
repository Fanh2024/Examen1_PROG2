package StreamingMusical;

import java.time.LocalDate;
import java.util.List;

public class Album {
    private String id;
    private String nom;
    private LocalDate dateSortie;
    private List<Chanson> chansons;

    public Album(String id, String nom, LocalDate dateSortie, List<Chanson> chansons) {
        this.id = id;
        this.nom = nom;
        this.dateSortie = dateSortie;
        this.chansons = chansons;
    }

    public List<Chanson> getChansons() {
        return chansons;
    }
}
