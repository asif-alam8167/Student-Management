package com.asif.collection_hashMap_scenario_01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentDataManagement {

	public static void main(String[] args)
	{
	   HashMap<String,Integer> hs = new HashMap<>();
	   Scanner sc = new Scanner(System.in);
	   while(true) {
	   System.out.println("------ Student Management Menu ------\r\n"
	   		+ "1. Add Student\r\n"
	   		+ "2. Update Marks\r\n"
	   		+ "3. Delete Student\r\n"
	   		+ "4. Search Student\r\n"
	   		+ "5. Display All Students\r\n"
	   		+ "6. Show Topper\r\n"
	   		+ "7. Show Lowest Scorer\r\n"
	   		+ "8. Show Total and Average Marks\r\n"
	   		+ "9. Exit");
	   System.out.print("Enter your choice :");
	   int choice = Integer.parseInt(sc.nextLine());
	   
	   switch(choice)
	   {
	   case 1:
		   System.out.print("Enter Student name : ");
		   String name = sc.nextLine();
		   System.out.println("Enter Student marks :");
		   Integer marks = Integer.parseInt(sc.nextLine());
		   hs.put(name, marks);
		   break;
	   case 2:
		   System.out.print("Enter Student name to update the marks : ");
		   name = sc.nextLine();
		   System.out.print("Enter new marks :");
		   marks = Integer.parseInt(sc.nextLine());
		   hs.computeIfPresent(name, (k,v)->marks);
		   break;
	   case 3:
		   System.out.print("Enter student name to be deleted :");
		   name = sc.nextLine();
		   hs.remove(name);
		   System.out.println("Student deleted successfully.");
		   break;
	   case 4:
		   System.out.print("Enter the student name to search :");
		   name = sc.nextLine();
		   if(hs.containsKey(name)){
			  System.out.print(name+" scored "+hs.get(name)+"\n");
		   }
		   else{
			   System.out.print("Student not found\n");
		   }
		   break;
	   case 5:
		   System.out.println("---Student Record ---");
		   hs.forEach((k,v)->System.out.println(k+" => "+v));
		   break;
	   case 6:
		   Entry<String, Integer> max = Collections.max(hs.entrySet(),(x,y)->x.getValue()-y.getValue());
		   System.out.println("Topper : "+max.getKey()+" => "+max.getValue());
		   break;
	   case 7:
		   Entry<String, Integer> min = Collections.min(hs.entrySet(), (x,y)->x.getValue()-y.getValue());
		   System.out.println("Lowest : "+min.getKey()+" => "+min.getValue());
		   break;
	   case 8:
		   int avg = 0;
		   int sum = 0;
		   int count=0;
		   for(Integer value : hs.values())
		   {
			   sum+=value;
			   count++;
		   }
		   avg=sum/count;
		   System.out.println("Average marks : "+avg);
		   System.out.println("total marks : "+sum);
		   break;
	   case 9:
		   System.out.println("Thank you and exit.");
		   System.exit(0);
	   }
	   
	   
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
