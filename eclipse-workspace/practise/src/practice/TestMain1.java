package practice;

import java.util.*;

public class TestMain1 {

	static List<Object> list = new ArrayList<Object>();
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "abc");
		Employee e2 = new Employee(2, "def");
		
		Student s1 = new Student(1, "pqr");
		Student s2 = new Student(2, "xyz");
		
		list.add(e1);list.add(e2);list.add(s1);list.add(s2);
		
		Map<Object, Character> map = new HashMap<Object, Character>();
		 
		for(Object ob : list) {
			if(ob instanceof Employee) {
				map.put(ob, 'E');
			} else {
				map.put(ob, 'S');
			}
		}
		
		Set<Employee> eSet = new TreeSet<Employee>(new IdComparator());
		Set<Student> sSet = new TreeSet<Student>(new NameComparator());
		
		for(Object ob : map.keySet()) {
			
		}
		
		
		
	}
	

}

class IdComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.id - e2.id;
	}
}

class NameComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2){
		return s1.name.compareTo(s2.name);
	}
}


class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
} 
class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
} 