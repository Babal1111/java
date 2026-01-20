import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>{
	int id;
	String name;
	double marks;
	public Students(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Students s) {
		return this.id - s.id;
	}
}

// class SortByNames implements Comparator<Students>{

// 	@Override
// 	public int compare(Students s1, Students s2) {
// 		return s1.name.compareTo(s2.name);
// 	}

// }

class SortByMarks implements Comparator<Students>{

	@Override
	public int compare(Students s1, Students s2) {
		return Double.compare(s1.marks, s2.marks);
	}
	
}
public class Compratorr {
	public static void main(String[] args) {
		
		List<Students> st = new ArrayList<Students>();
        List<Students> at = new ArrayList<Students>();
		st.add(new Students(3, "Murali", 75.5));
		st.add(new Students(4, "Aditya", 85.5));
		st.add(new Students(1, "Vishnu", 80.5));
		st.add(new Students(2, "Pramod", 90.5));
		st.add(new Students(2, "Suraj", 55.5));
        Comparator<Students> c1 = (s1,s2)-> s1.name.compareTo(s2.name);
        Collections.sort(st,c1);
        
        for (Students s : st) {
			System.out.println(s);
		}
	}
}