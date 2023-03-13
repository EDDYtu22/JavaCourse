package Exeptions.src;

public class Person {

    String name;
    int age;

    public Person(String name, int age){
        this.setAge(age);
        this.setName(name);
    }

    public void setName(String name) {
        String letter = name.substring(0, 1);
        if(!letter.toUpperCase().equals(letter)){
            throw new InvalidPersonNameException("Invalid name", name);
        }
        this.name = name;
    }

    public void setAge(Integer age)  {
        if(age < 0 || age > 200){
            throw new InvalidPersonAgeException("Invalid age", age.toString());
        }
        this.age = age;
    }
    
    
}
