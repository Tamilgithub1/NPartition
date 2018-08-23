import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int a=in.nextInt();
	int b=in.nextInt();
	if(n%2==0) {
		int r=n/2;
		if(a<=r && b<=n) 
			System.out.println("YES");
	}else
		System.out.println("NO");
}}
