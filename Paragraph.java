import java.util.Scanner;
import java.lang.String;
public class Paragraph{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter anything : ");
        String chaine = sc.nextLine();
        String reverseChaine ="";
        for (int i = chaine.length()-1; i >= 0; i--){
            reverseChaine+=chaine.charAt(i);
        }
        System.out.println("the enterd string is : "+chaine);
        System.out.println("the reversed string is : "+reverseChaine);
        int nbrWord = 1;
        for (int i=0;i<chaine.length();i++){
            if (chaine.charAt(i)==' '){
                nbrWord++;

            }
        }
        System.out.println("the number of word in this string is :"+nbrWord);
    }
}
