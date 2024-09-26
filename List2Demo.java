import java.util.ArrayList;
import java.util.List;

public class List2Demo {

	public static void main(String[] args) {
		
		List<List> bigNum = new ArrayList<List>();

		List num1 = new ArrayList();
		num1.add(100);
		num1.add(200);
		num1.add(300);
		num1.add(400);
		
		List num2 = new ArrayList();
		
		num1.add(10.345f);
		num1.add(200.45f);
		num1.add("a");
		num1.add(true);
		
		
		bigNum.add(num1);
		bigNum.add(num2);
		
		
		
		
	}

}
