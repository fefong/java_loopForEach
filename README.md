Java Loop ForEach
========================

Description: ForEach - iterate over an array or Iterable.

Example Application: LOOP - FOR EACH (JAVA)

## Loop Structure

```java
for (T t : ElementIterable)
  // code block to be executed in loop
}
```

# Model

_Model:_  [Person](src/model/Person.java);

```java
public class Person {

private int id;
private String name;
private Date date;
    
// Getters and Setters;
// Override toString();
}
```
* See [Getters and Setters](https://github.com/fefong/java_GettersAndSetters);


### Example 1: Array or Vector object (Person)
```java
Person[] persons = new Person[2];
persons[0] = person1;
persons[1] = person2;

for (Person person : persons) {
	System.out.println(person.toString());
}
```

### Example 2: List or ArrayList (Person)
```java
List<Person> persons = new ArrayList<Person>();
persons.add(person1);
persons.add(person2);

for (Person person : persons) {
	System.out.println(person.toString());
}
```

## Some links for more in depth learning

* [JAVA PRINT](https://github.com/fefong/java_print);
* [JAVA SWITCH CASE](https://github.com/fefong/java_switch);
* [JAVA IF/ELSE](https://github.com/fefong/java_ifElse);
* [JAVA ARITHMETIC](https://github.com/fefong/java_calculator);