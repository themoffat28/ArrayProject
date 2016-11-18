package array.model;

public class HipsterObject
{
	private String name;
	private int hipsterRank;
		
	public HipsterObject(String name)
		{
			this.name = name;
		}
	
	public String toString()
	{
		String description = "This Hipster's name is " + name;
		description += " with a rank of " + hipsterRank;
		
		return description;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void calculateHipsterRank()
	{
		hipsterRank = (int) (Math.random() * 10);
	}
	
	public void calculateHipsterRank(int scale)
	{
		hipsterRank = (int) (Math.random() * scale);
	}
	
	public void calculateHipsterRank(int scale, int shift)
	{
		hipsterRank = (int) (Math.random() * scale) + shift;
	}
}
