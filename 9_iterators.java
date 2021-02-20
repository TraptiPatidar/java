class Iterators{
	public static void main(String args[]){
		System.out.println("for loop");
		for(int i=0;i<3;i++){
			System.out.println(i+" loop");
		}
		int i=0;
		System.out.println("while");
		while(i<3){
			System.out.println(i+" loop");
			i=i+1;
		}
		i=0;
		System.out.println("do while");
		do{
			System.out.println(i+" loop");
			i=i+1;
		}while(i<3);
	}
}