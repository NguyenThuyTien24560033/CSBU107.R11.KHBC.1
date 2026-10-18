class UITStudent {
    private String studentId;
    private String fullName;
    private String major;
    private double gpa;

    public UITStudent() {
        this("N/A", "N/A", "Unassigned", 0.0);
    }

    public UITStudent(String studentId, String fullName) {
        this(studentId, fullName, "Unassigned", 0.0);
    }

    public UITStudent(String studentId, String fullName, String major, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
        this.gpa = (gpa >= 0.0 && gpa <= 10.0) ? gpa : 0.0;
    }

    public boolean isPassed() {
        return this.gpa >= 5.0;
    }

    public String academicClassification() {
        if (this.gpa >= 8.0) return "Excellent";
        if (this.gpa >= 6.5) return "Good";
        if (this.gpa >= 5.0) return "Average";
        return "Poor";
    }

    public void displayInfo() {
        System.out.println("");
        System.out.println("Student ID    : " + this.studentId);
        System.out.println("Full Name     : " + this.fullName);
        System.out.println("Major         : " + this.major);
        System.out.println("GPA           : " + this.gpa);
        System.out.println("Passed Status : " + (isPassed() ? "PASSED" : "FAILED"));
        System.out.println("Classification: " + academicClassification());
    }

    public static void main(String[] args) {
        UITStudent s1 = new UITStudent();                                    
        UITStudent s2 = new UITStudent("24560000", "Nguyen Thanh An");         
        UITStudent s3 = new UITStudent("24560001", "Tran Thuy Chi", "CS", 8.5);    
        UITStudent s4 = new UITStudent("24560002", "Le Nhat Anh", "SE", 4.5); 
        UITStudent s5 = new UITStudent("24560003", "Pham Hong Duyen", "AI", 6.8);

        UITStudent[] students = {s1, s2, s3, s4, s5};
        for (UITStudent s : students) {
            s.displayInfo();
        }
    }
}