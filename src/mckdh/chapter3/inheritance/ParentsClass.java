package mckdh.chapter3.inheritance;

public class ParentsClass {
	public int varInt1;   
	protected int varInt2; 
	int varInt3;
	private int varInt4;
	
	public void method1() {
		System.out.println("method1이 실행 됩니다.");
	}
	protected void method2() {
		System.out.println("method2가 실행 됩니다.");
	}
	void method3() {
		System.out.println("method3이 실행 됩니다.");
	}
	private void method4() {
		System.out.println("method4가 실행 됩니다.");
	}
}
