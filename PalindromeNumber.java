package week1day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=303;
int temp=num,r,sum=0;
while(num>0) {
r=num%10;
sum=(sum*10)+r;
num=num/10;
}
if(temp==sum) {
System.out.println("given number is Palindrome Number");
}
else {
	System.out.println("given number is Not Palindrome Number");
}
	}

}
