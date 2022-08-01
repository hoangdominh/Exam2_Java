import java.util.ArrayList;
import java.util.List;

public class TestStudentList {
    public static void printStudents(StudentList list){
        list.printList();
    }
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        studentList.add(new Student(1, "Do Minh Hoang","30-07-1999"));
        studentList.add(new Student(2, "Nguyen Van Ninh","04-01-1999"));
        studentList.add(new Student(3, "Le Duc Minh","01-0-1999"));
        printStudents(studentList);
        System.out.println("-------------------------");
//       Cho phép sửa học sinh khi nhập id
        System.out.println("Sửa học sinh theo id ");
        studentList.repairStudent(2,"Nguyen Van Hoang ","01-01-1999");
        printStudents(studentList);
        System.out.println("-------------------------");

//      Xóa sinh viên khi nhập id
        System.out.println("Xóa sinh viên theo id ");
        studentList.removeStudent(2);
        printStudents(studentList);

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();





    }
}
