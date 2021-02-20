interface Demo{
	 public void show();
}
class A implements Demo{
	 public void show(){
		System.out.println("interface method");
	}
}
class Interface_prog{
	public static void main(String[] args) {
		A a=new A();
		a.show();
	}
}