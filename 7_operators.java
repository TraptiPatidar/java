class Operator{
	public static void main(String args[]){
		int a=5,b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((float)a/b);
		System.out.println(a%2);
		System.out.println(a==5 && b==0);
		System.out.println(a==5 || b==0);
		System.out.println(a!=0);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(a--);
		System.out.println(--b);
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~a);
		System.out.println(a>>1);
		System.out.println(b<<1);
		System.out.println(a>>>1);
		System.out.println((a>b)?a:b);
		a+=2;
		System.out.println(a);
		b*=2;
		System.out.println(b);
		a&=b;
		System.out.println(a);
		a-=2;
		System.out.println(a);
		b/=2;
		System.out.println(b);
		a%=2;
		System.out.println(a);
		a>>=2;
		System.out.println(a);
		b<<=2;
		System.out.println(b);
		a>>>=1;
		System.out.println(a);
	}
}