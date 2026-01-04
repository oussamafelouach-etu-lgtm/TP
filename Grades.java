import java.util.Scanner;
import java.util.Arrays;
public class Grades {
    public static void main (String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of grades you want store: ");
        int nbr = sc.nextInt();
        double grades[]= new double[nbr];
        for (int i=0;i<grades.length;i++){
            System.out.println("entre the grade number "+(i+1));
            grades[i]=sc.nextDouble();
        }
        Arrays.sort(grades);
        System.out.println("the grades sorted from the lawest to the highest ares "+Arrays.toString(grades));
        double avg =0;
        double sum=0;
        for (int i=0; i<grades.length;i++){
            sum +=grades[i];
            avg=sum/grades.length;
        }
        System.out.println("average grade is :" +avg);
        double max=0;
        double min=20;
        for (int i=0;i<grades.length;i++){
            if (grades[i] >max){
                max=grades[i];
            if (grades[i] <min){
                min=grades[i];
            }
            }
        }
        System.out.println("The lowest grades is "+min);
        System.out.println("The highest grades is "+max);
        System.out.println("the number of students with a grade entered by the user : "+grades.length);


    }
}
