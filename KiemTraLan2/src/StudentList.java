import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentList {
    List<Student> students = new ArrayList<>();

    public List<Student> add(Student std){
        students.add(std);
        return students;
    }

//  Duyệt các học sinh trong list
    public void printList(){
        for (Student i : students){
            System.out.println(i);
        }
    }

//  Xóa học sinh theo mã học sinh
    public void removeStudent(int id){
        int num = 0;
        for (int i =0;i<students.size();i++){
            if (students.get(i).getId() == id){
                num = i;
            }
        }
        students.remove(num);
    }

//   Sửa học sinh khi nhập vào mã học sinh

    public void repairStudent(int id, String hoVaTen, String ngaySinh){
        for (Student i : students){
            if(i.getId() == id){
                i.setHoVaTen(hoVaTen);
                i.setNgaySinh(ngaySinh);
            }
        }
    }
}
