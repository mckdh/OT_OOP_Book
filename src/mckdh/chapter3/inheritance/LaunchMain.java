package mckdh.chapter3.inheritance;

public class LaunchMain {
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		int varInt3 = childClass.varInt1;
//		int varInt4 = childClass.varInt4; // private는 실행 불가능
		
		childClass.method3();
//		childClass.method4() // private는 실행 불가능;
	}
}
