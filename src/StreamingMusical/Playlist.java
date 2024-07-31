package StreamingMusical;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Playlist {
    private String nom;
    private Set<Chanson> chansons;
    private int likes;

    public Playlist(String nom, Set<Chanson> chansons, int likes) {
        this.nom = nom;
        this.chansons = new HashSet<>();
        this.likes = 0;
    }

    public Playlist(String nom) {
        this.nom = nom;
    }

    public void addToPlaylist(Chanson chanson) {
        chansons.add(chanson);
    }

    public void addToPlaylist(Album album) {
        chansons.addAll(album.getChansons());
    }

    public void removeById(String id) {
        chansons.removeIf(chanson -> chanson.getId().equals(id));
    }

    public void like(){
        this.likes++;
    }

    public void unlike(){
        if(this.likes > 0){
            this.likes--;
        }
    }

    public int getTotalLikes(){
        return this.likes;
    }


    public String getNom() {
        return nom;
    }
}
