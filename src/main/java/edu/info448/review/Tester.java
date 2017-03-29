package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();

		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));

		Husky husky = new Husky("Bubby");
		husky.bark();
		husky.pullSled();

		//Dog.pullSled();

		Dog v1 = new Husky(); //--- works
		v1.bark();
		//Husky v2 = new Dog(); //--- doesn't work
		//Huggable v2 = new Husky(); //--- works
		//Huggable v3 = new TeddyBear(); //--- works
		//Husky v4 = new TeddyBear(); //--- doesn't work

		ArrayList<Huggable> hugList = new ArrayList<Huggable>(); //a list of huggable things
		hugList.add(new Husky()); //a Husky is Huggable
		hugList.add(new TeddyBear()); //so are Teddybears!

		//enhanced for loop ("foreach" loop)
		//read: "for each Huggable in the hugList"
		for(Huggable thing : hugList) {
		    thing.hug();
		}

		//Animal animal = new Animal();

		GiftBox<Husky> huskygiftbox = new GiftBox<Husky>(husky);
	}
}