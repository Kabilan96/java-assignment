package week1day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=153,q=0,r=0,m;
m=n;
int sum=0;
while(m!=0) {
	q=m/10;
	r=m%10;
	sum=sum+(r*r*r);
	m=q;
}
System.out.println(+sum);
if(n==sum) {
	System.out.println("the number is Armstrong");
}	
else {
	System.out.println("the number is not Armstrong");
}
}
}