package inheritance;
/**
 * 
 * Study for the inheritance and polymorfism
 */

public class Student extends Person{
    
    double gpa;

    public Student(String name, double gpa){
        super(name);
        this.gpa = gpa;
    }

    @Override
    public String toString(){
        return this.getName() + " : " +  this.gpa;
    }

    public String bla(){
        return "bla";
    }

    public static void main(String[] args) {
        Person[] persons = new Person[3];

        
        //Every Student is a Person and every Faculty is a person
        persons[0] = new Person("Victor");
        persons[1] = new Student("Victor", 8.0);
        persons[2] = new Faculty("Victor", 10000);

        if (persons[1] instanceof Student)
            System.out.println(((Student) persons[1]).bla());
    }
}