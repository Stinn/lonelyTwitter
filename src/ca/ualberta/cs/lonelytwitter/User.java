package ca.ualberta.cs.lonelytwitter;

import java.io.IOException;


public abstract class User extends Object implements UserLike
	

{
	public String name;
	//private String gender;
	
	public String getName()
	{
	
		return name;
	}
	
	public abstract void setName(String x) throws IOException;
	//{
	//
	//	this.name = name;
	//}
	//protected Integer age;

	public User(String name)
	{

		super();
		this.name = name;
	}
	
	public User(){
		super();
		this.name = "anonymous";
	}
}
