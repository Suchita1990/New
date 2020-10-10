package LinkedListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListConstructor
{
    public static void main(String[] args)
    {
		//LinkedList l=new LinkedList(); //Empty linkedlist
    	ArrayList al=new ArrayList();
    	al.add("Hi");
    	al.add("Suchita");
    	al.add("Sneha");
    	al.add(10);
    	al.add(20);
    	System.out.println("ArrayList:" +al);
    	//LinkedList( Collection c) constructor
    	LinkedList l=new LinkedList(al);
    	l.add("Hello");
    	l.add("Testing");
    	l.add("Shastra");
    	l.add("Resonantia");//add at the end of arraylist
    	l.add(al);//object of arraylist is added and stored in linkedlist
    	System.out.println("Add:"+l);
    	
    	//l.addAll(al); //all elements of arraylist is added in linkedlist
    	//System.out.println("AddAll:"+l);
    	
	}  
}

