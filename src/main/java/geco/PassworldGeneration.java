package geco;

import java.util.Random;

public class PassworldGeneration {

    /**
     * Liste des char possibles pour le mot de passe.
     */
    private final String ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&()*+,-./:;<=>?@[]^_{|}~";

    /**
     * Generation d'un mot de passe aléatoire.
     * @param size taille du mdp.
     * @return
     */
    public String getRandomPassworld(int size) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            sb.append(ALPHA.charAt(random.nextInt(ALPHA.length())));
        }
        return sb.toString();
    }
}
