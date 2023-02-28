package Patterns;
public class Pattern_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=14;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
	if(i+j<=(n-1)/2 || i-j>=(n-1)/2||i==0||i==n-1||j==0 )//add j==0 to get k
	{
	System.out.print("*");
	}
	else
	{
	System.out.print(" ");
	}
	
	
}
System.out.println(" ");
}
}
}

	