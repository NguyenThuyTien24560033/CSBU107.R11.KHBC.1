import java.util.ArrayList;
import java.util.Scanner;

abstract class CourseRegistration {
    private String courseCode;
    private String courseName;
    private int credits;
    private int registeredStudents;

    public CourseRegistration(String courseCode, String courseName, int credits, int registeredStudents) {
        if (courseCode == null || courseCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Course code must not be empty.");
        }
        if (courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name must not be empty.");
        }
        if (credits < 1) {
            throw new IllegalArgumentException("Credits must be >= 1.");
        }
        if (registeredStudents < 0) {
            throw new IllegalArgumentException("Registered students must be >= 0.");
        }
        this.courseCode = courseCode.trim();
        this.courseName = courseName.trim();
        this.credits = credits;
        this.registeredStudents = registeredStudents;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public int getRegisteredStudents() {
        return registeredStudents;
    }

    public abstract double tuitionPerStudent();

    public double expectedCollection() {
        return tuitionPerStudent() * registeredStudents;
    }

    public void displayInfo() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
        System.out.println("Registered Students: " + registeredStudents);
    }

    public void displayInfo(int index) {
        System.out.println("\nCourse " + index);
        displayInfo();
    }
}

class TheoryCourse extends CourseRegistration {

    public TheoryCourse(String courseCode, String courseName, int credits, int registeredStudents) {
        super(courseCode, courseName, credits, registeredStudents);
    }

    @Override
    public double tuitionPerStudent() {
        return getCredits() * 450000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: TheoryCourse");
        super.displayInfo();
        System.out.println("Tuition Per Student: " + String.format("%,.0f", this.tuitionPerStudent()) + " VND");
        System.out.println("Expected Collection: " + String.format("%,.0f", this.expectedCollection()) + " VND");
    }
}

class LabCourse extends CourseRegistration {
    private double equipmentFee;

    public LabCourse(String courseCode, String courseName, int credits, int registeredStudents, double equipmentFee) {
        super(courseCode, courseName, credits, registeredStudents);
        if (equipmentFee < 0) {
            throw new IllegalArgumentException("Equipment fee must be >= 0.");
        }
        this.equipmentFee = equipmentFee;
    }

    @Override
    public double tuitionPerStudent() {
        return getCredits() * 600000 + equipmentFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("Type: LabCourse");
        super.displayInfo();
        System.out.println("Equipment Fee Per Student: " + String.format("%,.0f", equipmentFee) + " VND");
        System.out.println("Tuition Per Student: " + String.format("%,.0f", this.tuitionPerStudent()) + " VND");
        System.out.println("Expected Collection: " + String.format("%,.0f", this.expectedCollection()) + " VND");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CourseRegistration> courses = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Add courses");
            System.out.println("2. Display all courses");
            System.out.println("3. Search by course code");
            System.out.println("4. Course with the largest expected collection");
            System.out.println("5. Total expected collection");
            System.out.println("6. Count Theory and Lab courses");
            System.out.println("7. Average tuition per student");
            System.out.println("8. Exit");
            System.out.println("============");
            System.out.print("Your choice: ");
            choice = Integer.parseInt(input.nextLine().trim());

            switch (choice) {
                case 1: {
                    System.out.println("\n--- Add Courses ---");
                    System.out.print("Enter number of courses (n > 0): ");
                    int n = Integer.parseInt(input.nextLine().trim());
                    while (n < 1) {
                        System.out.print("Invalid number of courses (n > 0). Enter again: ");
                        n = Integer.parseInt(input.nextLine().trim());
                    }

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nCourse " + (i + 1) + "/" + n);
                        System.out.print("Choose course type (1. TheoryCourse / 2. LabCourse): ");
                        int type = Integer.parseInt(input.nextLine().trim());
                        while (type != 1 && type != 2) {
                            System.out.print("Invalid course type. Enter again (1 or 2): ");
                            type = Integer.parseInt(input.nextLine().trim());
                        }

                        System.out.print("Course Code: ");
                        String courseCode = input.nextLine().trim();
                        while (true) {
                            boolean duplicate = false;
                            for (CourseRegistration course : courses) {
                                if (course.getCourseCode().equalsIgnoreCase(courseCode)) {
                                    duplicate = true;
                                }
                            }
                            if (courseCode.isEmpty()) {
                                System.out.print("Course code must not be empty. Enter again: ");
                                courseCode = input.nextLine().trim();
                            } else if (duplicate) {
                                System.out.print("Duplicate course code. Enter again: ");
                                courseCode = input.nextLine().trim();
                            } else {
                                break;
                            }
                        }

                        System.out.print("Course Name: ");
                        String courseName = input.nextLine().trim();
                        while (courseName.isEmpty()) {
                            System.out.print("Course name must not be empty. Enter again: ");
                            courseName = input.nextLine().trim();
                        }

                        System.out.print("Credits (>= 1): ");
                        int credits = Integer.parseInt(input.nextLine().trim());
                        while (credits < 1) {
                            System.out.print("Invalid credits (>= 1). Enter again: ");
                            credits = Integer.parseInt(input.nextLine().trim());
                        }

                        System.out.print("Registered Students (>= 0): ");
                        int registeredStudents = Integer.parseInt(input.nextLine().trim());
                        while (registeredStudents < 0) {
                            System.out.print("Invalid registered students (>= 0). Enter again: ");
                            registeredStudents = Integer.parseInt(input.nextLine().trim());
                        }

                        if (type == 1) {
                            courses.add(new TheoryCourse(courseCode, courseName, credits, registeredStudents));
                        } else {
                            System.out.print("Equipment Fee Per Student (>= 0): ");
                            double equipmentFee = Double.parseDouble(input.nextLine().trim());
                            while (equipmentFee < 0) {
                                System.out.print("Invalid equipment fee (>= 0). Enter again: ");
                                equipmentFee = Double.parseDouble(input.nextLine().trim());
                            }
                            courses.add(new LabCourse(courseCode, courseName, credits, registeredStudents, equipmentFee));
                        }
                    }
                    System.out.println("Added " + n + " course(s) successfully.");
                    break;
                }

                case 2: {
                    System.out.println("\n--- Display All Courses ---");
                    if (courses.isEmpty()) {
                        System.out.println("The course list is empty.");
                    } else {
                        int index = 1;
                        for (CourseRegistration course : courses) {
                            course.displayInfo(index);
                            index++;
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("\n--- Search By Course Code ---");
                    if (courses.isEmpty()) {
                        System.out.println("The course list is empty.");
                    } else {
                        System.out.print("Enter course code to search: ");
                        String searchCode = input.nextLine().trim();
                        boolean found = false;
                        for (CourseRegistration course : courses) {
                            if (searchCode.equalsIgnoreCase(course.getCourseCode())) {
                                found = true;
                                System.out.println();
                                course.displayInfo();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("The course does not exist.");
                        }
                    }
                    break;
                }

                case 4: {
                    System.out.println("\n--- Largest Expected Collection ---");
                    if (courses.isEmpty()) {
                        System.out.println("The course list is empty.");
                    } else {
                        CourseRegistration highest = courses.get(0);
                        for (CourseRegistration course : courses) {
                            if (course.expectedCollection() > highest.expectedCollection()) {
                                highest = course;
                            }
                        }
                        System.out.println("The largest expected collection: "
                                + String.format("%,.0f", highest.expectedCollection()) + " VND");
                        highest.displayInfo();
                    }
                    break;
                }

                case 5: {
                    System.out.println("\n--- Total Expected Collection ---");
                    double totalFee = 0;
                    for (CourseRegistration course : courses) {
                        totalFee += course.expectedCollection();
                    }
                    System.out.println("Total expected collection: " + String.format("%,.0f", totalFee) + " VND");
                    break;
                }

                case 6: {
                    System.out.println("\n--- Count Theory And Lab Courses ---");
                    int countTheory = 0;
                    int countLab = 0;
                    for (CourseRegistration course : courses) {
                        if (course instanceof TheoryCourse) {
                            countTheory++;
                        }
                        if (course instanceof LabCourse) {
                            countLab++;
                        }
                    }
                    System.out.println("TheoryCourse: " + countTheory);
                    System.out.println("LabCourse: " + countLab);
                    break;
                }

                case 7: {
                    System.out.println("\n--- Average Tuition Per Student ---");
                    double totalFee = 0;
                    int totalStudents = 0;
                    for (CourseRegistration course : courses) {
                        totalFee += course.expectedCollection();
                        totalStudents += course.getRegisteredStudents();
                    }
                    if (totalStudents == 0) {
                        System.out.println("Average tuition per student: N/A");
                    } else {
                        System.out.println("Average tuition per student: "
                                + String.format("%,.2f", totalFee / totalStudents) + " VND");
                    }
                    break;
                }

                case 8:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 8);
        input.close();
    }
}