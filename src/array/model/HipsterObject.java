package array.model;

public class HipsterObject
{
	private String name;
		
	public HipsterObject(String name)
		{
			this.name = name;
		}
	
	public String toString()
	{
		String description = "This Hipster's name is " + name;
		
		return description;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
