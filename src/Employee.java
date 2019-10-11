public class Employee {

    //Variables
    String name;
    int age;
    char sex;
    String department;

    @Override
    public String toString() {
        return "Nume:" + this.name + "\nVarsta:" + this.age + "\nSex:" + this.sex + "\nDepartament:" + this.department;
    }

    //Constructor declaration
    public Employee(String name, int age, char sex, String department) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public String getDepartment() {
        return department;
    }

    //Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setSex(char newSex) {
        this.sex = newSex;
    }

    public void setDepartment(String newDepartment) {
        this.name = newDepartment;
    }
}
