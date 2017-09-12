package marshmellow.controller;

import marshmellow.model.MonsterModel;

public class MonsterRunner 
{
	public static void main(String[] args) 
	{
		MonsterModel myMonster = new MonsterModel(4 , 3 , "George", false , 2);
		System.out.println(myMonster);
	}	
}
