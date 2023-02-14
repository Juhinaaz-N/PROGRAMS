import java.util.*;
class Banking
{
public String name;
public long mobile;
public int password;
public String address;

public void kyc()
{
System.out.println("Enter customer name:");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
System.out.println("Enter mobile number:");
mobile=sc.nextLong();
}

public void createAccount()
{
String username;
int password;
System.out.println("Enter Username:");
Scanner sc=new Scanner(System.in);
username=sc.nextLine();
System.out.println("Enter Password:");
password=sc.nextInt();
}
}

class Sbi extends Banking
{
public static void main(String args[])
{
Sbi s=new Sbi();
s.kyc();
s.createAccount();
}
}



