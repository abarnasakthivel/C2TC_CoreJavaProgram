package Day15.Generics;

import java.util.List;

public class UnboundedWildCard {
	//Parameter List(<?>) is List of unknown type
	public static void display(List<?> ll) {
		for (Object o : ll) {
			System.out.println(o);
		}
	}
}
