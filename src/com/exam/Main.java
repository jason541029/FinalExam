package com.exam;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	List<Food>foods = new ArrayList<>();
	public Main(){
	readfoods();
	for(Food f: foods){
		
		System.out.println("請輸入餐點:");
		System.out.println(f.getName());
	}
	}
	

		

	
		// TODO Auto-generated method stub
		private void readfoods() {
			
			try {
				BufferedReader in  = new BufferedReader(new FileReader(("menu.txt")));
				String line = in.readLine();
				while(line!=null);
				String[]tokens = line.split(",");
				String id = tokens[0];
				String name = tokens[1];
				int number = Integer.parseInt(tokens[2]);
				int kcal = Integer.parseInt(tokens[3]);
			Food f= new Food(id ,name ,number,kcal);
			foods.add(f);
				

		
			

			
		

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
				
			}
			}
		

