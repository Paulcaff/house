public class Person {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(){

        this.name = "No Owner Specified";
        this.age = 0;
    }

    public Person (String name,int age){
        setName(name);
        setAge(age);
    }

    public String toString(){
        return "Name: "+name+ "Age: "+age;
    }
}
