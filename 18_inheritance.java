class A{
	int a=2;
	void display(){
		System.out.println("a= "+a);
	}
}
class B extends A{
	int b=9;
	void show(){
		System.out.println("b= "+b);
	}
}
class Inheritance{
	public static void main(String[] args) {
		B b=new B();
		b.show();
		b.display();
	}
}