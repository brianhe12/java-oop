
public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    /** Constructor */
    public Employee(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /** Getters */
    public int getID(){
        return id;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getName(){
        return firstName+' '+lastName;
    }

    public int getSalary(){
        return salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    /** Setters */
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int raiseSalary(int percent){
        double gain = 1+((double)(percent)/100);
        salary = (int)(salary * gain);
        return salary;
    }

    public String toString(){
        return "Employee[id="+id+",name="+getName()+",salary="+salary+"]";
    }
}
