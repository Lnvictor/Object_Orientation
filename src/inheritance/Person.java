package inheritance;
public class Person {
    
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    @Override
    public String toString(){
        return this.getName();
    }
}