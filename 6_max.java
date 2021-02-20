class Max{
	public static void main(String args[]){
		int a=2,b=1,c=3;
		int d=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println("max="+d);
	}
}