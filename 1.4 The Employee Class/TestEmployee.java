
public class TestEmployee {
    public static void main(String[] args){
        Employee e1 = new Employee(117,"Master","Chief",116000);
        System.out.println(e1);
        
        /** Testing the Setters */
        e1.setSalary(200);
        System.out.println(e1.getAnnualSalary()); // 200 * 12
        e1.raiseSalary(20);
        System.out.println(e1.getSalary());

        /** Testing the Getters */
        System.out.println(e1.getID());
        System.out.println(e1.getFirstName());
        System.out.println(e1.getLastName());
        System.out.println(e1.getName());
        
    }

}
