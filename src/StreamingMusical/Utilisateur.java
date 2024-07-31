package StreamingMusical;

import java.util.HashSet;
import java.util.Set;

public class Utilisateur {
    private String nom;
    private Set<Playlist> playlists;
    private Set<Playlist> favoris;

    public Utilisateur(String nom, Set<Playlist> playlists, Set<Playlist> favoris) {
        this.nom = nom;
        this.playlists = new HashSet<>();
        this.favoris = new HashSet<>();
    }

    public void addPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }

    public void likePlaylist(Playlist playlist) {
        if (favoris.contains(playlist)) {
            favoris.remove(playlist);
                playlist.unlike();
        } else {
            favoris.add(playlist);
                playlist.like();
        }
    }

    public String getNom() {
        return nom;
    }
}
