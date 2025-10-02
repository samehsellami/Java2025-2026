import java.util.Scanner;

public class ZooManagement {

    int nbrCages;
    String zooName;

    public void afficherInfo() {
        System.out.println(zooName + " comporte " + nbrCages + " cages.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        while (zoo.zooName.trim().isEmpty()) {
            System.out.println("Erreur : le nom ne doit pas être vide.");
            System.out.print("Entrez le nom du zoo : ");
            zoo.zooName = scanner.nextLine();
        }

        System.out.print("Entrez le nombre de cages : ");
        zoo.nbrCages = scanner.nextInt();

        while (zoo.nbrCages <= 0) {
            System.out.println("Erreur : le nombre doit être positif.");
            System.out.print("Entrez le nombre de cages : ");
            zoo.nbrCages = scanner.nextInt();
        }

        zoo.afficherInfo();

        scanner.close();
    }
}
