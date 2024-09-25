package Test;

import java.util.ArrayList;
import java.util.List;

public class TestCuringa {

	public static void main(String[] args) {
//		List<Object> myObjs = new ArrayList<Object>();
//		List<Integer> myNumbers = new ArrayList<Integer>();
//		myObjs = myNumbers;
	// Código de exemplo que não funciona
	//	

		//O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:

		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
		
	}

}
