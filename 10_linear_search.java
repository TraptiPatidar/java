class Linear_search{
	public static void main(String args[]){
		int a[]={5,2,3,9,1};
		int x=9,l=0;
		for (int i=0;i<a.length;i++){
			if(a[i]==x){
				System.out.println("Element found at position "+i);
				l=1;
			}
		}
		if(l==0)
			System.out.println("Element not found");
	}
}