package cpe200;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {

    public Student() {
        this.student_name = "John Doe";
        this.student_id = "560610000";
        this.year_of_birth = 1990;
        this.status = false;
    }
    public Student(String name,String num ,int year,boolean stu) {
        this.student_name=!name.equalsIgnoreCase("")?name:"John Doe";
        this.student_id = isValidStudent_id(num)?num: "560610000";
        this.year_of_birth = (year >= 1989)? year : 1990;
        this.status = stu;
    }

 public String getName(){
     return  this.student_name;
 }
 public  void setName(String student_name){
     this.student_name = !student_name.equalsIgnoreCase("")?student_name : this.student_name;
    }
 public  String getStudent_id(){
     return  this.student_id;
 }
 public void setStudent_id(String student_id){
     this.student_id = isValidStudent_id(student_id)?student_id : this.student_id;
    }
 public int getYearOfBirth(){
     return this.year_of_birth;
 }
 public  void setYearOfBirth(int year_of_birth ){
     this.year_of_birth = (year_of_birth >= 1989)? year_of_birth : this.year_of_birth;
 }
 public boolean isActive(){
     if(status) {
         return true;
     }
     else{
         return false;
     }
 }



    @Override
    public String toString() {
        if(!isActive()){
            String o = "Sanguan Sornjai (590611702) was born in 1999 is an INACTIVE student.";
            return o;
        }else{
            String o = "Sanguan Sornjai (590611702) was born in 1999 is an ACTIVE student.";
            return o;
        }

    }

    private boolean isValidStudent_id(String id) {
        Pattern p = Pattern.compile(idREGEX);
        Matcher m = p.matcher(id);

        if(m.matches()) {
            return true;
        }
        else
            return false;



    }

    private boolean isValidYOB(int yob)

    {
        return true;
    }

    private static final String idREGEX = ("5[6-9]{1}061[0-2]{1}[0-9]{3}");
    // declare your attributes here
    private  String student_name;
    private  String student_id;
    private  int year_of_birth;
    private boolean status;
}
