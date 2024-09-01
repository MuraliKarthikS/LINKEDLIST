import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class LinkedList {
    private static Node convertarr2LL(int[] arr) {
        // Create the head node with the first element
        Node head = new Node(arr[0]);
        Node mover = head;

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the size of the array as input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Validate size constraint
        if (size < 1 || size > 1000000) {
            System.out.println("Array size must be between 1 and 1000000.");
            return;
        }

        int[] arr = new int[size];

        // Input the array elements
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            // Validate element constraint
            if (arr[i] < 1 || arr[i] > 1000000) {
                System.out.println("Each element must be between 1 and 1000000.");
                return;
            }
        }

        // Convert array to linked list

        // Print the linked list in the required format
        Node current = convertarr2LL(arr);
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {  // Add arrow only if it's not the last element
                System.out.print("->");
            }
            current = current.next;
        }
        sc.close();
    }
}
