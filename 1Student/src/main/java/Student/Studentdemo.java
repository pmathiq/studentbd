
package Student;

public class Studentdemo {
    public int regno;
    public String name;
    public String section;
    public String dept;

    public Studentdemo(String name,String dept,String section,int regno){
        this.name=name;
        this.dept=dept;
        this.regno=regno;
        this.section=section;

    }

    public  int getRegno() {
        return this.regno;
    }

    public String getName() {
        return this.name;
    }

    public String getDept() {
        return this.dept;
    }

    public String getSection() {
        return this.section;
    }



}
