import java.sql.Timestamp;
import java.util.Date;

public class Student {
    private String maHocSinh;
    private int id;
    private String hoVaTen;
    private String ngaySinh;


    public Student(){}

    public Student(int id, String hoVaTen, String ngaySinh){
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getMaHocSinh(){
        maHocSinh = "HS"+id;
        return maHocSinh;
    }

    public void setMaHocSinh(int id,String maHocSinh){
        maHocSinh = "HS"+id;
        this.maHocSinh = maHocSinh;
    }
    public String getHoVaTen(){
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen){
        if(this.hoVaTen.equals(hoVaTen)){
            this.hoVaTen = hoVaTen+"A";
        } else {
            this.hoVaTen = hoVaTen;
        }
    }
    public String getNgaySinh(){
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh){
        this.ngaySinh = ngaySinh;
    }

    public String toString(){
        return "Học sinh: "+hoVaTen+", mã học sinh: "+id+", ngày sinh:  "+ngaySinh;
    }
}
