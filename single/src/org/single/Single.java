package org.single;

public class Single {
public static Single s;
private Single()
{
	System.out.println("private constructor");
	
}
public static Single getInstance()
{
	if(s==null)
	s = new Single();
	return s;
	}
	
public void company()
{
	System.out.println("Company");
	}
private void name() {
System.out.println("Singleton");
}

	public static void main(String[] args) {
getInstance();
	s.company();
	}

}
