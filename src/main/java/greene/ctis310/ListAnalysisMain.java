package greene.ctis310;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class ListAnalysisMain 
{
    public static void main( String[] args )
    {
        final int NUM_DOGS = 10000;
        
        // Create an ArrayList of Dog objects and populate it with random dogs and time it
        ArrayList<Dog> dogsArray = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_DOGS; i++) {
            dogsArray.add(new Dog());
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList time to add " + NUM_DOGS + " dogs: " + (endTime - startTime)+" milliseconds");

        //sort the ArrayList and then shuffle it and time both
        startTime = System.currentTimeMillis();
        Collections.sort(dogsArray);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList time to sort: " + (endTime - startTime)+" milliseconds");
        
        //shuffle the ArrayList and time it
        startTime = System.currentTimeMillis();
        Collections.shuffle(dogsArray);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList time to shuffle: " + (endTime - startTime)+" milliseconds");

        //get a ranodm object 1,000,000 times from the ArrayList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = (int) (Math.random() * NUM_DOGS);
            dogsArray.get(randomIndex);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList time to get 1,000,000 random dogs: " + (endTime - startTime)+" milliseconds");

        //create a loop to get each object in the list sequentially
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_DOGS; i++) {
            dogsArray.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList time to get elements sequentially: " + (endTime - startTime)+" milliseconds");
        System.out.println("--------------------------------------------------");

        // Create a LinkedList of Dog objects and populate it with random dogs
        LinkedList<Dog> dogsList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_DOGS; i++) {
            dogsList.add(new Dog());
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList time to add " + NUM_DOGS + " dogs: " + (endTime - startTime)+" milliseconds");

        //sort the LinkedList and then shuffle it and time both
        startTime = System.currentTimeMillis();
        Collections.sort(dogsList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList time to sort: " + (endTime - startTime)+" milliseconds");

        //shuffle the LinkedList and time it
        startTime = System.currentTimeMillis();
        Collections.shuffle(dogsList);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList time to shuffle: " + (endTime - startTime)+" milliseconds");

        //get a ranodm object 1,000,000 times from the LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = (int) (Math.random() * NUM_DOGS);
            dogsList.get(randomIndex);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList time to get 1,000,000 random dogs: " + (endTime - startTime)+" milliseconds");

        //create a loop to get each object in the list sequentially
        startTime = System.currentTimeMillis();
        for (int i = 0; i < NUM_DOGS; i++) {
            dogsList.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList time to get elements sequentially: " + (endTime - startTime)+" milliseconds");



    }
}
