/*public class Main {
    public static void main(String[] args){
        String nom = "Bokingo";
        String prenom = "Daniel";
        int age = 20;
        String presentations = "Salut! je suis " + nom + " "+ prenom + " et j'ai " + age + "ans";
        System.out.println(presentations);


    }
}*/


import java.util.Scanner;

public class Main {

    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("entrez votre nom: ");
        String nom = sc.nextLine();
        System.out.println("bonjour " + nom);
        sc.close();

    }
}
