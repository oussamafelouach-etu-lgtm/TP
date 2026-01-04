import java.util.Scanner;
public class Conjug{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un verbe du premier groupe :");
        String verbe=sc.next();
        String conjv=verbe.substring(0,verbe.length()-1);
        String conj=verbe.substring(0,verbe.length()-2);
        if (verbe.endsWith("er")){
            System.out.println("je "+conjv);
            System.out.println("tu "+conjv+"s");
            System.out.println("il/elle "+conjv);
            System.out.println("nous "+conj+"ons");
            System.out.println("vous "+conj+"ez");
            System.out.println("ils/elles "+conj+"ent");
        }
        else {
            System.out.println("ce vebre n'est pas de premier groupe ");
        }





    }
}
