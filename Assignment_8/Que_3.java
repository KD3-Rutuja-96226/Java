import java.util.ArrayList;
import java.util.List;

public class Que_3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.set(2, 0);
		
		list.forEach(e->System.out.println(e));
	}

}
