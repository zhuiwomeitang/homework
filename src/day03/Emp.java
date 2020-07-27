package day03;

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
 *    姓名:张三,年龄:25,性别:男,薪资:5000,入职时间:2006-02-15
 * 
 * 定义equals方法，要求只要名字相同，则认为内容一致。
 * @author Bonnie
 *
 */
public class Emp implements Comparable<Emp> {
    String name;
    int age;
    String gender;
    int Salary;
    Date hiredate;
    Emp( String name,int age,String gender,int Salary,Date hiredate){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.Salary=Salary;
        this.hiredate=hiredate;
    }

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
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    @Override
    public String toString() {
        return "姓名："+name+","+"年龄："+age+","+"性别："+gender+","+"工资："+Salary+","+"入职时间："+hiredate;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Emp){
            if(this.name==((Emp) obj).name&&this.age==age){
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Emp o) {
        return this.age-o.age;
    }
}
