package day04;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 * 定义私有属性:
 * String name;
 * int age;
 * String gender;
 * int salary;
 * Date hiredate;//入职时间
 * 
 * 定义构造方法，以及属性get,set方法.
 * 定义toString方法，格式如:
 *    张三,25,男,5000,2006-02-15
 * 
 * 定义equals方法，要求名字以及年龄相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp {
    String name;
    int age;
    String gender;
    int salary;
    Date hiredate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Emp(String name, int age, String gender, int salary, Date hiredate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        Calendar cal=Calendar.getInstance();
        cal.setTime(hiredate);
        int year=cal.get(Calendar.YEAR);
        int mouth=cal.get(Calendar.MONTH);
        int day=cal.get(Calendar.DAY_OF_MONTH);
         return name+","+age+","+gender+","+salary+","+ year+"-"+mouth+"-"+day;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Emp){
            if (this.name.equals(((Emp) obj).name)&&this.age==((Emp) obj).age){return true;}
        } return false;
    }
}
