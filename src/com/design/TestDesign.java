package com.design;
//infinite loop
public class TestDesign {
	public TestDesign getInstance(TestDesign obj) {
		return obj;
	}
	public static void main(String[] args) {
		/*for(int i=1;true;i++) {
			TestDesign td = new TestDesign();
			System.out.println(td.getInstance(td));
		}*/
	}
}
