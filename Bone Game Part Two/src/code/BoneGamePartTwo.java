package code;

import java.util.Scanner;

public class BoneGamePartTwo {
	public static void odds(int target) {
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int tempPlayerScore = 0, tempCPU = 0, CPU = 0, playerScore = 0, playerThrow = 0, CPUThrow = 0;
		int min = 0, max = 1;

		char playAgain = 'y'; 		
		
		do
		{
			playerThrow = 0;
			CPUThrow = 0;
			
			System.out.println("Welcome to the Bone Game");
			System.out.println("========================");
			System.out.println("Player:" + playerScore + "      " + "CPU:" + CPU);
			System.out.println("========================");
			
			do
			{
				playerThrow++;
				tempPlayerScore = 0;
	
				System.out.println("Player throw: " + playerThrow);
				System.out.println("");
					
				int rectangle = (int)(Math.random()*(max-min + 1) + min);
				int square = (int)(Math.random()*(max-min + 1) + min);
				int triangle = (int)(Math.random()*(max-min + 1) + min);
				int circle = (int)(Math.random()*(max-min + 1) + min);
				int diamond = (int)(Math.random()*(max-min + 1) + min);			
				
				if(rectangle == 0)
					System.out.print("Blank ");
				else 
				{
					tempPlayerScore += 1;
					System.out.print("Rectangles! ");
				}
				if(square == 0)
					System.out.print("Blank ");
				else 
				{
					tempPlayerScore += 1;
					System.out.print("Squares! ");
				}
				if(triangle == 0)
					System.out.print("Blank ");
				else 
				{
					tempPlayerScore += 2;
					System.out.print("Triangles! ");
				}
				if(circle == 0)
					System.out.print("Blank ");
				else 
				{
					tempPlayerScore += 3;
					System.out.print("Circles! ");
				}
				if(diamond == 0)
					System.out.println("Blank");
				else 
				{
					tempPlayerScore += 4;
					System.out.println("Diamonds!");
				}
				System.out.println("");
				
				System.out.println("Your points:" + tempPlayerScore);
				
				if(playerThrow < 3)
				{
					System.out.println("Do you want to throw again (y/n)?");
					playAgain = input.next().charAt(0);
				}
	
			}while(playAgain == 'y' && playerThrow < 3);
			
			playerScore += tempPlayerScore;
			
			do
			{
				CPUThrow ++;
				tempCPU = 0;
				
				System.out.println("CPU throw: " + CPUThrow);
				System.out.println("");
					
				int rectangle = (int)(Math.random()*(max-min + 1) + min);
				int square = (int)(Math.random()*(max-min + 1) + min);
				int triangle = (int)(Math.random()*(max-min + 1) + min);
				int circle = (int)(Math.random()*(max-min + 1) + min);
				int diamond = (int)(Math.random()*(max-min + 1) + min);			
				
				if(rectangle == 0)
					System.out.print("Blank ");
				else 
				{
					tempCPU += 1;
					System.out.print("Rectangles! ");
				}
				if(square == 0)
					System.out.print("Blank ");
				else 
				{
					tempCPU += 1;
					System.out.print("Squares! ");
				}
				if(triangle == 0)
					System.out.print("Blank ");
				else 
				{
					tempCPU += 2;
					System.out.print("Triangles! ");
				}
				if(circle == 0)
					System.out.print("Blank ");
				else 
				{
					tempCPU += 3;
					System.out.print("Circles! ");
				}
				if(diamond == 0)
					System.out.println("Blank");
				else 
				{
					tempCPU += 4;
					System.out.println("Diamonds!");
				}
				
				System.out.println("");
				System.out.println("CPU points:" + tempCPU);			
				System.out.println("");
				
			}while(CPUThrow < 3 && tempCPU < tempPlayerScore);
				
			CPU += tempCPU;
			
		}while(CPU < 20 && playerScore < 20);
		
		System.out.println("      Game Results");
		System.out.println("========================");
		System.out.println("Player:" + playerScore + "    " + "CPU:" + CPU);
		System.out.println("========================");
		
		if(CPU > playerScore)
			System.out.println("CPU Wins!");
		else if(CPU < playerScore)
			System.out.println("Player Wins!");
		else
			System.out.println("Tie!");
		
	}

}
