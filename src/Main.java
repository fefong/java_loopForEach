import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java_loopForEach.model.Person;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setId(1);
		person1.setName("Foo");
		person1.setDate(new Date());

		Person person2 = new Person();
		person2.setId(1);
		person2.setName("Baa");
		person2.setDate(new Date());
		
//--------------------------------------------------------------------
		{
			System.out.println("Vector/Array");

			// Persons[] - Vector object (Person)
			Person[] persons = new Person[2];
			persons[0] = person1;
			persons[1] = person2;

			for (Person person : persons) {
				System.out.println(person.toString());
			}
		}
//--------------------------------------------------------------------
		{
			System.out.println("List/ArrayList");

			// List<Person> - List / ArrayList object (Person)
			List<Person> persons = new ArrayList<Person>();
			persons.add(person1);
			persons.add(person2);

			for (Person person : persons) {
				System.out.println(person.toString());
			}

		}
//--------------------------------------------------------------------
		
	}
}
