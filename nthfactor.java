import.java.util.*;
class main{
public static void main(string[]args)
 {
int num,n;
scanner sc new scanner(system.in);
system.out .print("enter a number");
num=sc.nextint();
system.out.println("enter n);
n=sc.nextint();
int i,count=0;
for(i=1;i<=num;i++)
{
if(num%i==0)
{
count=count+1;
if(count==n)
{
system.out.println(n+"factor is"+1);
}
}
}
system.out.print("\n total factors of "+num";"+count);
}
}
