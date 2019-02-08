package TimeComplexityOfSet;

import java.util.ArrayList;

import jyBSTSet.BSTsSet;
import jyBSTSet.FileOperation;
import jyBSTSet.Set;
import jylinkList.LinkedListSet;

public class main {
	private static double testSet(Set<String> set, String filename) {

        long startTime = System.nanoTime();

        System.out.println(filename.substring(4));
        ArrayList<String> words = new ArrayList<>();
       FileOperation.readFile(filename, words) ;
            System.out.println("Total words: " + words.size());
            for (String word : words) {
                set.add(word);
            }
            System.out.println("Total different words: " + set.getSize());
        
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        String filename = "src/a-tale-of-two-cities.txt";
        //2叉树
        BSTsSet<String> bstSet = new BSTsSet<>();
        double time1 = testSet(bstSet, filename);
        System.out.println("AVLTree Set: " + time1 + " s");

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        //链表 
        LinkedListSet<String> linkedListSet = new LinkedListSet<>();
        double time2 = testSet(linkedListSet, filename);
        System.out.println("Linked List Set: " + time2 + " s");

    }

}


