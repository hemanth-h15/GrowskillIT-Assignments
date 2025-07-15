package EduSmartProject;


abstract class User {
    private String name;
    private String email;
    private String userId;

    public User(String name, String email, String userId) {
        this.name = name;
        this.email = email;
        this.userId = userId;
    }

    public final void displayWelcome() {
        System.out.println("Welcome, " + name + "!");
    }
 // return using get and set method 
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserId() {
        return userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract void viewProfile();
}
interface ProgressTrackable {
    void trackProgress();
}
 // creating student class
class Student extends User implements ProgressTrackable {
    private String enrolledCourse1;
    private String enrolledCourse2;

    public Student(String name, String email, String userId) {
        super(name, email, userId);
        this.enrolledCourse1 = null;
        this.enrolledCourse2 = null;
    }

    public void enrollCourse(String courseName) {
        if (this.enrolledCourse1 == null) {
            this.enrolledCourse1 = courseName;
            System.out.println(getName() + " enrolled in " + courseName);
        } else if (this.enrolledCourse2 == null) {
            this.enrolledCourse2 = courseName;
            System.out.println(getName() + " enrolled in " + courseName);
        } else {
            System.out.println(getName() + " cannot enroll in more than 2 courses.");
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Student Profile - Name: " + getName() + ", Email: " + getEmail());
        System.out.println("Enrolled Courses: " + enrolledCourse1 + ", " + enrolledCourse2);
    }

    @Override
    public void trackProgress() {
        System.out.println(getName() + " is tracking course progress...");
    }
}

// creating instructor
class Instructor extends User {
    private String createdCourse1;
    private String createdCourse2;

    public Instructor(String name, String email, String userId) {
        super(name, email, userId);
        this.createdCourse1 = null;
        this.createdCourse2 = null;
    }

    public void createCourse(String courseName) {
        if (this.createdCourse1 == null) {
            this.createdCourse1 = courseName;
            System.out.println(getName() + " created course: " + courseName);
        } else if (this.createdCourse2 == null) {
            this.createdCourse2 = courseName;
            System.out.println(getName() + " created course: " + courseName);
        } else {
            System.out.println(getName() + " cannot create more than 2 courses.");
        }
    }

    @Override
    public void viewProfile() {
        System.out.println("Instructor Profile - Name: " + getName() + ", Email: " + getEmail());
        System.out.println("Created Courses: " + createdCourse1 + ", " + createdCourse2);
    }
}

class Admin extends User {

    public Admin(String name, String email, String userId) {
        super(name, email, userId);
    }

    public void removeUser(User user) {
        System.out.println("Admin removed user: " + user.getName());
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile - Name: " + getName() + ", Email: " + getEmail());
    }
}

class Course {
    private String title;
    private int durationInHours;
    private final int maxStudents;

    // Constructor 1
    public Course(String title, int durationInHours, int maxStudents) {
        this.title = title;
        this.durationInHours = durationInHours;
        this.maxStudents = maxStudents;
    }

  // need to overload
    public Course(String title) {
        this.title = title;
        this.durationInHours = 0;
        this.maxStudents = 50;
    }

    public String getTitle() {
        return title;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void showCourseDetails() {
        System.out.println("Course Title: " + title);
        System.out.println("Duration (hrs): " + durationInHours);
        System.out.println("Max Students: " + maxStudents);
    }
}


public class Project2 {
    public static void main(String[] args) {
        // Create 2 Students
        Student s1 = new Student("Hemanth", "hemanth@gmail.com", "1234");
        Student s2 = new Student("Vishwa", "Vishwa@gmail.com", "6789");

        // Create 2 Instructors
        Instructor i1 = new Instructor("Sandesh", "Sandesh@gmail.com", "I01");
        Instructor i2 = new Instructor("Manas", "Manas@gmail.com", "I02");

        //Create 1 Admin
        Admin admin = new Admin("Admin", "admin@gmail.com", "A01");

        // Instructors create courses
        i1.createCourse("Java Basics");
        i1.createCourse("OOP in Java");
        i2.createCourse("Data Structures");
        i2.createCourse("Algorithms");

        // available courses for student 
        s1.enrollCourse("Java Basics");
        s1.enrollCourse("Algorithms");
        s2.enrollCourse("Data Structures");

        //Display all user profiles
        System.out.println("----- User Profiles -----");
        s1.viewProfile();
        s2.viewProfile();
        i1.viewProfile();
        i2.viewProfile();
        admin.viewProfile();

        //Students track progress
        System.out.println("--- Tracking Progress ---");
        s1.trackProgress();
        s2.trackProgress(); 

        // Admin to removes a user
        System.out.println("--- Admin Actions ---");
        admin.removeUser(s2);

        // Display course details
        System.out.println("--- Course Details ---");
        Course c1 = new Course("Java Basics", 30, 100);
        Course c2 = new Course("Algorithms");  // using  constructor(overload)

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}