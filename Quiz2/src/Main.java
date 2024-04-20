import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Binary Search Tree & Singly Linked List Test!");
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();

        Random random = new Random();
        for (int i = 0; i <= 10000; i++) {
            int randomNumber = random.nextInt();
            binarySearchTree.insert(randomNumber);
            singlyLinkedList.add(randomNumber);
        }

        final long startTimeTree = System.nanoTime();
        binarySearchTree.search(30);
        final long finalTimeTree = System.nanoTime();

        System.out.println("Three execution time is  " + (finalTimeTree - startTimeTree) + "ns");

        final long startTimeList = System.nanoTime();
        singlyLinkedList.contains(30);
        final long finalTimeList = System.nanoTime();

        System.out.println("List execution time is  " + (finalTimeList - startTimeList) + "ns");



    }
}