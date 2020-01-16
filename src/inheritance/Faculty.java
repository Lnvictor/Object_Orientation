public class Faculty extends Person{
    
    private double salary;

    public Faculty(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return this.getName() + " : " + this.getSalary(); 
    }
}