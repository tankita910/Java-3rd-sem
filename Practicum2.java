public class InheritanceDemo {
    static class Student {
        int studentId;
        String studentName, department;
        Student(int id, String name, String dept) {
            studentId = id;
            studentName = name;
            department = dept;
        }
        boolean valid() {
            return studentId > 0 &&
                   studentName != null &&
                   !studentName.isBlank();
        }
        void displayStudentDetails() {
            if (!valid()) {
                System.out.println("Invalid student data");
                return;
            }
            System.out.println(studentId + " " + studentName + " " + department);
        }
    }
    static class UndergraduateStudent extends Student {
        int semester;
        double cgpa;
        UndergraduateStudent(int id, String name, String dept,
                             int sem, double c) {
            super(id, name, dept);
            semester = sem;
            cgpa = c;
        }
        void displayUGDetails() {
            displayStudentDetails();
            if (semester < 1 || semester > 8 || cgpa < 0 || cgpa > 10) {
                System.out.println("Invalid UG details");
            } else {
                System.out.println("Semester=" + semester + " CGPA=" + cgpa);
            }
        }
    }
    static class PostgraduateStudent extends Student {
        String specialization, researchTopic;
        PostgraduateStudent(int id, String name, String dept,
                            String sp, String rt) {
            super(id, name, dept);
            specialization = sp;
            researchTopic = rt;
        }
        void displayPGDetails() {
            displayStudentDetails();
            if (researchTopic == null || researchTopic.isBlank()) {
                System.out.println("Invalid research topic");
            } else {
                System.out.println("Specialization=" + specialization +
                                   " Topic=" + researchTopic);
            }
        }
    }

    public static void main(String[] args) {

        new UndergraduateStudent(
            101, "Ravi", "CSE", 5, 8.75
        ).displayUGDetails();
        new PostgraduateStudent(
            201, "Anita", "ECE", "AI", "Computer Vision"
        ).displayPGDetails();
        new UndergraduateStudent(
            -10, "", "ISE", 10, 11.5
        ).displayUGDetails();
    }
}


