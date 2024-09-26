import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		List con = new ArrayList();
		
		con.add(100);
		con.add(200);
		con.add("Ramu");
		con.add(1.345f);
		con.add(true);
		con.add('A');
		
		con.add(2, "Avanthi");
		
		con.remove(4);
		
		System.out.println(con);
		System.out.println("From Loop");
		for(int i=0;i<con.size();i++) {
			System.out.println(con.get(i));
		}
		
		Iterator itr = con.iterator();
		System.out.println("From Itr.....");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
