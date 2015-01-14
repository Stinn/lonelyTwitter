package ca.ualberta.cs.lonelytwitter;


public class Author extends user
{
	public Author(){
		super();
		name = "annoymous_author";
	}
	public Author(String string){
		super(string);
		
	}
	@Override
	public void serName(Sting x){
		name = x;
	}
}
