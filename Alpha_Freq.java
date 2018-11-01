import java.util.Scanner;
import java.util.*;

public class Alpha_Freq {
	public static class has{
		char c;
		int count;
		has(){
			this.count=0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str;
str=s.next();
char list[]=str.toCharArray();
int m;
m=list.length;
has f=new has();
has h[]=new has[m];
for(int i=0;i<m;i++)
	h[i]= new has();
h[0].c=list[0];
h[0].count++;
int k=1;
boolean flag=true;
for(int i=1;i<m;i++) {
	flag=true;
	for(int j=0;j<k;j++) {
		if(list[i]==h[j].c) {
			h[j].count++;
			flag=false;
			break;
		}
	}
	if(flag) {
		
		h[k].c=list[i];
		h[k].count++;
		k++;
	}
	
}
for(int i=0;i<k;i++)
	System.out.println(h[i].c+ " has repeated "+h[i].count+" times");
for(int i=0;i<k;i++)
	for(int j=0;j<k-i-1;j++) {
		if(h[j].count<h[j+1].count) {
			f = h[j];
			h[j]=h[j+1];
			h[j+1]=f;
		}
	}
for(int i=0;i<k;i++)
	for(int j=0;j<h[i].count;j++)
		System.out.print(h[i].c);

	
	}

}
