class Binary_search{
	public static void main(String args[]){
		Bsearch s=new Bsearch();
		int a[]={2,4,6,8,10};
		int x=8;
		int n=a.length;
		int y=s.search(a,x,n-1,0);
		if(y==-1)
			System.out.println("element not found");
		else
			System.out.println("element found at position "+y);
	}
}
class Bsearch{
	int search(int a[],int x,int n,int l){
		if(n>=1){
			int mid=l+(n-1)/2;
			if(a[mid]==x)
				return mid;
			else if(a[mid]<x)
				return search(a,x,n,mid+1);
			else if(a[n/2]>x)
				return search(a,x,mid-1,l);
		}
		return -1;
	}
}