package Airport;

import java.util.*;

public class MyBuiltInSortingTest {
	public static void main(String[] args) {
		Random random = new Random();
		List<Integer> list = new ArrayList<Integer>();
		
		for(int k = 0; k < 10; k++) {
			list.add(random.nextInt(100));
		}
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
