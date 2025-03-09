import java.util.Scanner;
class StudentGradeCalculator{
    public static void main(String[] args){
        int n;
        float sum= 0.0F;
        String grade;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter mark of subject "+i);
            int mk=sc.nextInt();
            sum += mk;
        }
        float buf=sum/(n*100);
        float averagePercentage=buf*100;
        if(averagePercentage>=95){
            grade="O";
        }
        else if (averagePercentage>=90) {
            grade="A+";
        }
        else if(averagePercentage<90 && averagePercentage>=80){
            grade="A";
        }
        else if(averagePercentage<80 && averagePercentage>=70){
            grade="B+";
        }
        else if(averagePercentage<70 && averagePercentage>60){
            grade="B";
        }
        else{
            grade="C";
        }
        System.out.println("Total Marks:"+sum);
        System.out.println("Percentage:"+averagePercentage);
        System.out.println("Grade:"+grade);
    }
}