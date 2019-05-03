package hs.kr.emirim.program;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class program {

	public static void main(String[] args) {
		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		System.out.println("in1 == in2 --> " + (in1== in2));
		System.out.println("in1.equals(in2) --> " + in1.equals(in2));
		System.out.println("in1.equals(in3) --> " + in1.equals(in3));
		System.out.println("----------------------");
		//toString()
		System.out.println(new Integer(100).toString());
		System.out.println(new Double(55.7).toString());
		System.out.println("----------------------");
		//wrapper()
		System.out.println(Integer.valueOf("132"));
		System.out.println(Double.valueOf("123.456"));
		//parseInt() : String -> int
		System.out.println(Integer.parseInt("456"));
		//parseDouble() : String -> double
		System.out.println("789.123");
		//Wrapper클래스 -> 기본자료형
		System.out.println(new Integer(100).intValue());
		System.out.println(new Double(3.31).doubleValue());
		
		ArrayList arr = new ArrayList();
		arr.add(new Integer(200));
		arr.add(100);
		for(Object o : arr) {
			System.out.println((int)0);
		}
	}

}
