import java.util.LinkedList;
import java.util.Queue;

class FileAttente {

    public static void main(String[] args) {
        // Créer une file d'attente (queue)
        Queue<String> file = new LinkedList<>();

        // Ajouter des personnes à la file
        file.add("Personne A");
        file.add("Personne B");
        file.add("Personne C");
        file.add("Personne D");
        file.add("Personne E");

        // Afficher et servir les personnes dans la file
        System.out.println("Servir les personnes dans la file d'attente:");

        // Tant que la file n'est pas vide, servir la première personne
        while (!file.isEmpty()) {
            String personne = file.poll();  // Retirer la première personne de la file
            System.out.println(personne + " est servi.");
        }

        System.out.println("Tous les clients ont été servis.");
    }
}
