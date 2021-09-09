package week1day2;

public class IntersectionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3,4,5,6,7};
int[]b= {2,3,4,7,8,9,10};
for(int i=0;i<=(a.length)-1;i++) {
	for(int j=0;j<=(b.length)-1;j++) {
		if(a[i]==b[j]) {
			System.out.println("The Inserting Number is::"+a[i]);
		}
	}
}
	}

}
