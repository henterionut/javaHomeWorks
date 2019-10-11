import java.util.HashMap;

public class Organization {


            //MainMethod
            public static void main(String[] args)
            {
                Employee e1 = new Employee("Ionut",22, 'M', "QA");
                Employee e2 = new Employee("Mihai",30, 'M', "QA");
                Employee e3 = new Employee("Raluca",30, 'F', "QA");


                HashMap<Integer, Employee> employees = new HashMap<>();

                employees.put(1, e1);
                employees.put(2, e2);

                //get employee based on attributes
                System.out.println(employees.get(1).getName());
                //remove employee
                employees.remove(2,e2);
                // System.out.println(employees);
                employees.put(2,e3);
                System.out.println(employees);
                //Update attribute
                e2.setSex('F');
                System.out.println(e2.getSex());






            }





        }




