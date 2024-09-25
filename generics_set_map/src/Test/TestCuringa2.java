package Test;

import java.util.Arrays;
import java.util.List;

public class TestCuringa2 {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);

	}

	public static void printList(List<?> list) {
		//list.add(3);O compilador não sabe qual é o tipo específico do qual a lista foi instanciada.
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}