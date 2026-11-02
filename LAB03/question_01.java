import java.util.ArrayList;
import java.util.Scanner;


abstract class Student{
    private String studentID;
    private String fullName;
    private String address;
    private int totalCredits;
    private double gpa;

    Student(String studentID, String fullName, 
            String address, int totalCredits, double gpa){
        this.studentID = studentID;
        this.fullName = fullName;
        this.address = address;
        this.totalCredits = totalCredits;
        this.gpa = gpa;
    }

    public int getTotalCredits(){
        return totalCredits;
    }

    public double getGPA(){
        return gpa;
    }

    public abstract boolean isEligibleForGraduation();

    public void displayInfor(){
        System.out.print("\nStudent ID: " + this.studentID);
        System.out.print("\nFull Name: " + this.fullName);
        System.out.print("\nAddress: " + this.address);
        System.out.print("\nTotal Credits: " + this.totalCredits);
        System.out.print("\nGPA: " + this.gpa);
    }
};

class CollegeStudent extends Student{
    private double graduationExamScore;

    CollegeStudent(String studentID, String fullName, String address,
                int totalCredits, double gpa, double graduationExamScore){
        super(studentID, fullName, address, totalCredits, gpa);
        this.graduationExamScore = graduationExamScore;
    }

    @Override
    public boolean isEligibleForGraduation(){
        return this.getTotalCredits() >=120 && this.getGPA() >=5.0 
            && this.graduationExamScore >=5.0;
    };

};

class UniversityStudent extends Student{
    private double thesisScore;
    private String thesisTitle;

    UniversityStudent(String studentID, String fullName, String address, 
                    int totalCredits, double gpa, double thesisScore, String thesisTitle){
        super(studentID, fullName, address, totalCredits, gpa);
        this.thesisScore = thesisScore;
        this.thesisTitle = thesisTitle;
    }

    @Override
    public boolean isEligibleForGraduation(){
        return getTotalCredits() >=170 && getGPA() >= 5.0 && this.thesisScore>= 5.0;
    }

    @Override
    public void displayInfor(){
        super.displayInfor();
        System.out.print("\nThesis Title: " + thesisTitle);
        System.out.print("\nThesis Score: " + thesisScore);
    };

};


class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = Integer.parseInt(input.nextLine());

        for(int i=0; i<n; i++){
            System.out.println("\nStudent" + (i+1));
            System.out.println("Type(1-College, 2-University): ");
            int type = Integer.parseInt(input.nextLine());

            if(type != 1 && type != 2){
                System.out.println("Invalid student type.");
                i--;
                continue;
            }

            System.out.print("\nStudent ID: ");
            String studentID = input.nextLine();

            System.out.print("\nFull Name: ");
            String fullName = input.nextLine();

            System.out.print("\nAddress: ");
            String address = input.nextLine();

            System.out.print("\nTotal Credits: ");
            int totalCredits = Integer.parseInt(input.nextLine());

            System.out.print("\nGPA: ");
            double gpa = Double.parseDouble(input.nextLine());

            if(totalCredits<0 || gpa<0 || gpa>10){
                System.out.print("Invalid Total Credits or GPA");
                i--;
                continue;
            }

            if(type == 1){

                System.out.print("\nGraduation Exam Score: ");
                double graduationExamScore = Double.parseDouble(input.nextLine());

                if(graduationExamScore <0 || graduationExamScore >10){
                    System.out.print("\nInvalid Graduation Exam Score");
                    i--;
                    continue;
                }

                students.add(new CollegeStudent(studentID, fullName, address,
                totalCredits, gpa, graduationExamScore));


            }
            else{

                System.out.print("\nThesis Title: ");
                String thesisTitle = input.nextLine();
                System.out.print("\nThesis Score: ");
                double thesisScore = Double.parseDouble(input.nextLine());

                if(thesisScore <0 || thesisScore >10){
                    System.out.print("\nInvalid Thesis Score");
                    i--;
                    continue;
                }

                students.add(new UniversityStudent(studentID, fullName, address, 
                    totalCredits, gpa, thesisScore, thesisTitle));
            }

        };

        int totalCount = 0;
        int uniCount = 0;
        int colCount =0;
        for(Student s: students){
            if(s.isEligibleForGraduation()){
                totalCount++;
                
                if( s instanceof CollegeStudent){
                    colCount++;
                }

                if( s instanceof UniversityStudent){
                    uniCount++;
                }
            }

        }

        System.out.println("\nEligible students: " + totalCount);
        System.out.println("\nEligible University students: " + uniCount);
        System.out.println("\nEligible College students: " + colCount);

        UniversityStudent best = null;
        for(Student s: students){
            if(s instanceof UniversityStudent){
                UniversityStudent u = (UniversityStudent) s;
                if(best == null || u.getGPA() >best.getGPA()){
                    best = u;
                }
            }
        };
        
        if(best == null){
                System.out.print("\nNot found the best University Student");
            }
        else{
            best.displayInfor();
        }
    }
}