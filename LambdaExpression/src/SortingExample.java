import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


public class SortingExample {
	static List<Person> personsList;
	private static org.apache.log4j.Logger log = Logger.getLogger(SortingExample.class);
	
	
	public static void main(String[] args) {
		
		log.info("test message");
		SortingExample example = new SortingExample();
		example.passingObjectValues();
		
		example.beforeSorting();
		example.firstNameSorting();
		example.lastNameSorting();
		example.ageSorting();
		example.salarySorting();
	   }

	private void beforeSorting() {
		System.out.println("Before Sorting");
		for(Person person : personsList){
			System.out.println(person);
		}
	}

	private void salarySorting() {
		System.out.println("After Sorting With Salary");
		personsList.sort((Person p1, Person p2)->p1.getSalary()-(p2.getSalary()));
		personsList.forEach((person)->System.out.println(person));
		
		
	}

	private void ageSorting() {
		System.out.println("After Sorting With Age");
		personsList.sort((Person p1, Person p2)->p1.getAge()-(p2.getAge()));
		personsList.forEach((person)->System.out.println(person));
			}

	private void lastNameSorting() {

		System.out.println("After Sorting With Last Name");
		personsList.sort((Person p1, Person p2)->p1.getLastName().compareTo(p2.getLastName()));
		personsList.forEach((person)->System.out.println(person));
	
	}

	private void firstNameSorting() {
		System.out.println("After Sorting With First Name");
		personsList.sort((Person p1, Person p2)->p1.getFirstName().compareTo(p2.getFirstName()));
		personsList.forEach((person)->System.out.println(person));
		
	}

	private void passingObjectValues() {
		 personsList= new ArrayList<Person>();
		personsList.add(new Person("Teja","Gatla", 25, 10000));
		personsList.add(new Person("mani","vempati",24, 50000));
	}

}
