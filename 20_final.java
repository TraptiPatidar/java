// final class Super{											cant be inherited
	// final void show(){ 									cant be overriden
	// 	System.out.println("In the super class");
	// }
// }
class Sub{
	void show(){
		System.out.println("In the sub class");
	}
}
class Final{
	public static void main(String[] args) {
		final int a=4;
		Sub  s=new Sub();
		s.show();
		// a++; not posiible

	}
}