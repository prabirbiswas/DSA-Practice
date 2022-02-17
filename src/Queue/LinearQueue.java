package Queue;

import java.util.Scanner;

class queue{
    private static int front,rear,capacity;
    private static  int Queue[];

    queue(int c){
        rear= -1;
        front=0;
        capacity=c;
        Queue =new int[capacity];
    }

    static void insert(int data){
        if((capacity-1) == rear) {
            System.out.println("\nQueue is full, can't insert the element");
            return;
        }
        rear++;
        Queue[rear]=data;

    }

    static void delete(){
        if(front>rear){
            System.out.println("\nQueue is empty");
            return;
        }
        System.out.println("\nDeleted Element is "+Queue[front]);
        front++;

        if(front>rear) {
            front = 0;
            rear = -1;
        }
    }

    static void display(){
        int i;
        if(front > rear){
            System.out.println("\nQueue is empty");
            return;
        }
        System.out.print("\nQueue contains: ");

        for(i=front;i<=rear;i++){
            System.out.print("\t"+ Queue[i]);
        }
    }
}

public class LinearQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input,item,capacity;
        System.out.print("Enter Capacity:");
        capacity= sc.nextInt();
        queue q = new queue(capacity);
        for(;;){
            System.out.println("\n\n1. To Insert Element");
            System.out.println("2. To delete Element");
            System.out.println("3. To Display Queue Elements");
            System.out.println("4. To Exit");
            System.out.print("Enter Choice:");
            input = sc.nextInt();

            switch (input){
                case 1:
                    System.out.print("Enter the item to Insert: ");
                    item=sc.nextInt();
                    q.insert(item);
                    q.display();
                    break;

                case 2:
                    q.delete();
                    q.display();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
                    continue;
            }
        }
    }
}
