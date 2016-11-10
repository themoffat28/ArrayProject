package array.controller;

import array.model.HipsterObject;

public class ArrayController
{
	private String[] words;
	private HipsterObject[] hipsters;
	private int[] numbers;

	public void start()
	{
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new HipsterObject("Hipster #" + index);
		}
		
		for(HipsterObject current : hipsters)
		{
			System.out.println(current);
		}
	}

	public ArrayController()
	{
		numbers = new int[20];
		words = new String[5];
		hipsters = new HipsterObject[5];
	}
}
