<!-- 
    public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}

// ~~~~~   partial implementation of a subclass of `Student` to rep undergrads at university   ~~~~~ //

public class UndergraduateStudent extends Student {
    private int year;
    //....
} 
-->
<!-- 
Complete Chapter 9 exercises 5,6,7 as stated in text. Crucial things to notice:
1. Pay attention to the UML diagram on page 657.
2. No Ticket objects can be created (read text) - so the code like new Ticket(1); does not even
compile (it is after all an abstract class with abstract method getPrice()). -->

### HW5
---
5. Can the code in `UndergraduateStudent` class access the `name` and `age` fields it inherits from `Student`? Can it call the `setAge` method?
    * No, the code cannot access the `name` and `age` fields _directly_. However, we can add accessor methods to our superclass `Student` to expose the data so it can be used from there. It **can** in fact access and utilize the `setAge` method as a way of accessing that information. <br />
    <sub>(A class that extends another class does/will not have access to any fields declared `private` in the superclass. A sublass may not refer directly to any private fields that were declared in its superclass, so attempting this will result in a compiler error. This is so the subclass won't violate the encapsulation of the behavior of the superclass.
    _The solution:_ use accessor or mutator methods associated with the fields to access and change their values. By adding a class in the superclass that exposes the data, such as `getAge()` that would return the age requested in an instance of `UndergraduateStudent`.) </sub>