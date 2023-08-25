import java.util.Scanner;

public class StudentGrade
{
    public static void main(String args[])
    {
    	
        int marks[] = new int[6];
        int i;
        float total=0, Average,Percentage;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<6; i++) { 
           System.out.print("Enter Marks obtained in Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();

        Average = total/6;
        Percentage = total*100/600;
        System.out.println("The Average Marks of 6 subject is:"+Average);
        System.out.println("The Percentage is:"+Percentage+"%");
        System.out.print("The student Grade is: ");
        if(Average>=80)
        {
            System.out.print("Grade:-A");
        }
        else if(Average>=60 && Average<80)
        {
           System.out.print("Grade:- B");
        } 
        else if(Average>=40 && Average<60)
        {
            System.out.print("Grade:- C");
        }
        else
        {
            System.out.print("Grade:- D");
        }
    }
}
