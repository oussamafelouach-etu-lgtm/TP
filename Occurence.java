import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une ligne de texte (max. 100 caractères) : ");
        String texte = scanner.nextLine();

        // Tableau pour compter les occurrences (indice 0 = 'a', 1 = 'b', ..., 25 = 'z')
        int[] nb_occurrences = new int[26];

        // Conversion en minuscules et comptage
        texte = texte.toLowerCase();

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);
            // Vérifie si c'est une lettre de a à z
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';  // transforme 'a'→0, 'b'→1, ..., 'z'→25
                nb_occurrences[index]++;
            }
        }

        // Affichage des résultats (seulement les lettres présentes)
        System.out.println("La chaîne \"" + texte + "\" contient :");

        for (int i = 0; i < 26; i++) {
            if (nb_occurrences[i] > 0) {
                char lettre = (char)('A' + i);  // on affiche en majuscule
                System.out.println(nb_occurrences[i] + " occurrence" +
                        (nb_occurrences[i] > 1 ? "s" : "") +
                        " de la lettre '" + lettre + "'");
            }
        }

        scanner.close();
    }
}
