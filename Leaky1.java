import java.util.*;
public class Leaky1 {
  public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,I,l=0,x1=0,x=0,ta[],lc=0;
Scanner s=new Scanner(System.in);
System.out.println("enter the size of the packets,number of packets,size of the bucket");
I=s.nextInt();
n=s.nextInt();
l=s.nextInt();
ta =new int[n];
System.out.println("enter the intervals of packet arrival");
for(int j=0;j<n;j++) 
	ta[j]=s.nextInt();
int m=0,count=0;
for(int k=1;k<n*I;k++) {
	if(ta[m]==k) {
		
		if(x>l) {
			System.out.println("this packet at "+ta[m]+" is non conforming");
			
				if(m==n-1) {
					
				break;
				
			}
			m++;
			continue;
		}
		x=x+I;
		lc=ta[m];
		System.out.println("this packet at "+ta[m]+" is conforming and space occupied is"+x);
		count=count+1;
			if(m==n-1) {
			break;
		}
		m++;
		
		if(count!=1) {
			x--;
			System.out.println("At "+k+"->1 bit leaked and remaining is "+x);
		}
		
	}
	else
	{
		if(x<=0) {
			x=0;
			System.out.println("0 bits in the bucket");
		}
		else {x--;
			System.out.println("At "+ k+"->1 bit leaked and remaining is "+x);
	     	}
	}}}}
