class Boundary{
	public static void main(String[] args) {
		int[][] a={{1,2,3},
	  			   {4,5,6},
	  			   {7,8,9}};

	  	for(int i=0;i<a[0].length;i++){
	  		for(int j=0;j<a.length;j++){
	  			if(i==0||j==0||i==a[0].length-1||j==a.length-1)
	  				System.out.print(a[i][j]);
	  			else
	  				System.out.print(" ");
	  		}
	  		System.out.println();
	  	}

	}
}