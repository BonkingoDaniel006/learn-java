// print + indentation

/*public class Main {
    public static void main(String[] args){
        String nom = "Bokingo";
        String prenom = "Daniel";
        int age = 20;
        String presentations = "Salut! je suis " + nom + " "+ prenom + " et j'ai " + age + "ans";
        System.out.println(presentations);


    }
}*/

//input

/*import java.util.Scanner;
public class Main {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("votre nom: ");
        String nom = sc.nextLine ();
        System.out.println("Bonjour " + nom); 
        sc.close();
        }
}*/


//if, elif, else

/*import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre note: ");
        int age = sc.nextInt();
        if (age < 10){
            System.out.println("mention: Insufisant");

        }
        else if (age <= 11){
            System.out.println("passable");

        }
        else if (age <= 13){
            System.out.println("Assez bien");

        }
        else if (age <= 15){
            System.out.println("Bien");

        }
        else if (age <= 17){
            System.out.println("Très bien");

        }
        else if (age >= 18){
            System.out.println("Excellent");

        }
        
        sc.close();
    }
}*/
/* public class Main{
    public static void main (String[] args) {
        for (int i = 0; i <= 10; i+= 2){
            System.out.println(i);

        }
    }
}*/


public class Main {
    public static void main (String[] args){
        int number = 0;
        while (number<5) {
            System.out.println(number);
            number++;
        }
    }
}