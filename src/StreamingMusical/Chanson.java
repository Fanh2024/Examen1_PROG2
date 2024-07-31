package StreamingMusical;

import java.util.List;

public class Chanson {
    private String id;
    private String titre;
    private double duree;
    private List<String> genres;

    public Chanson(String id, String titre, double duree, List<String> genres) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
        this.genres = genres;
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public double getDuree() {
        return duree;
    }

    public List<String> getGenres() {
        return genres;
    }
}
