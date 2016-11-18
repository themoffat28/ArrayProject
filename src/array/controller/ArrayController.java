package array.controller;

import array.model.HipsterObject;
import array.view.HipsterFrame;

public class ArrayController
{
	private String[] words = {"this","is","the","next","level","of","hipster","the","itialization","sequence"};;
	private HipsterObject[] hipsters;
	private int[] numbers;
	private HipsterFrame appFrame;

	public ArrayController()
	{
		showHipsterLevelThree();
		hipsters = new HipsterObject[5];
		
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new HipsterObject("Hipster #" + index);
		}
		
		appFrame = new HipsterFrame(this);
		
	}
	
	public void start()
	{
		hipsters[0].setName("Mofo");
		
		for(HipsterObject current : hipsters)
		{
			System.out.println(current);
		}
		
	}
	
	public void impactHipsters()
	{
		for(HipsterObject currentHipster : hipsters)
		{
			currentHipster.calculateHipsterRank(10, -5);
		}
	}
	
	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	
	public HipsterObject[] getHipsters()
	{
		return hipsters;
	}
	
	public String [] getWords()
	{
		return words;
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
}
