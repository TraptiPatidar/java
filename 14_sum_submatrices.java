class Sum_submatrices{
	public static void main(String[] args) {
		int a[][]={{1,2,3},
				 {4,5,6},
				 {7,8,9}};
		int sum=0;
		int i=a.length;
		int j=a[0].length;
		for(int x=0;x<i;x++){
			for(int y=0;y<j;y++){
				sum+=((x+1)*(y+1))*((i-x)*(j-y))*a[x][y];
			}
		}
		System.out.println("sum= "+sum);
	}
}