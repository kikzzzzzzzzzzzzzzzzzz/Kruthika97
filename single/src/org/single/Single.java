package org.single;

public class Single {
public static Single s;
private Single()
{}
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

	public static void main(String[] args) {
getInstance();
	s.company();
	}

}
