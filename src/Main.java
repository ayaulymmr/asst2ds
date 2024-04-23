//import java.io.*;
//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        ArrayList[] al = new ArrayList[10000];
//        Scanner scanner = new Scanner(System.in);
//        int lists = scanner.nextInt();
//        for(int i = 0; i < lists; i++)
//        {
//            al[i] = new ArrayList();
//            int number = scanner.nextInt();
//            for(int j = 0; j < number; j++)
//            {
//                int value = scanner.nextInt();
//                al[i].add(value);
//            }
//
//        }
//        int q = scanner.nextInt();
//
//        for(int i = 0; i < q;i++)
//        {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//
//            try
//            {
//                System.out.println(al[x-1].get(y-1));
//            }
//            catch(Exception e)
//            {
//                System.out.println("ERROR!");
//            }
//        }
//
//
//
//    }
//}
//2.
//import java.io.*;
//import java.util.*;
//public class Main {
//    public static void main(String[] args){
//        ArrayList<Integer> al=new ArrayList<>();
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        for(int i = 0; i < n; i++) //12 0 1 78 12
//        {
//            int value = scanner.nextInt();
//            al.add(value);//12 0 1 78 12
//        }
//        int q = scanner.nextInt();//2
//        for(int i = 0; i < q;i++){
//            String query = scanner.next();
//            if(query.equals("Insert")){
//                int x = scanner.nextInt();//5
//                int y = scanner.nextInt();//23
//                al.add(x,y);//12 0 1 78 12 23
//            }else{
//                int x = scanner.nextInt();//0
//                al.remove(x);// 0 1 78 12 23
//            }
//        }
//        Iterator itr=al.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next()+" ");
//        }
//    }
//}
//3.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] shelf = new int[2 * N];

        int left = N;
        int right = N;

        for (int i = 0; i < N; i++) {
            int operation = scanner.nextInt();

            if (operation == 1 || operation == 2) {
                int diskNumber = scanner.nextInt();
                if (operation == 1) {
                    shelf[--left] = diskNumber;
                } else {
                    shelf[right++] = diskNumber;
                }
            } else {
                if (operation == 3) {
                    System.out.println(shelf[left++]);
                } else {
                    System.out.println(shelf[--right]);
                }
            }
        }

        scanner.close();
    }
}

//4.
//import java.util.Stack;
//public class Main {
//
//    public static void reverse(Stack<Integer> st) {
//
//        if(st.isEmpty())
//            return;
//
//        int temp = st.pop();
//        reverse(st);
//
//        insertAtLast(st, temp);
//    }
//
//    public static void insertAtLast(Stack<Integer> stack, int elem){
//        if(stack.isEmpty()){
//            stack.push(elem);
//            return;
//        }
//        int topElem = stack.pop();
//        insertAtLast(stack, elem);
//        stack.push(topElem);
//    }
//
//    public static void main(String[] args) {
//
//        Stack<Integer> st = new Stack<>();
//        st.add(4);
//        st.add(3);
//        st.add(2);
//        st.add(1);
//
//        System.out.println(st);
//
//        reverse(st);
//
//        System.out.println(st);
//    }
//}

//5.
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class Main {
//    public static int unableToEat(int[] students, int[] samsas) {
//        List<Integer> studentsQueue = new ArrayList<>();
//        LinkedList<Integer> samsasStack = new LinkedList<>();
//
//        for (int student : students) {
//            studentsQueue.add(student);
//        }
//
//        for (int i = samsas.length - 1; i >= 0; i--) {
//            samsasStack.push(samsas[i]);
//        }
//
//        while (!studentsQueue.isEmpty()) {
//            if (studentsQueue.get(0).equals(samsasStack.peek())) {
//                studentsQueue.remove(0);
//                samsasStack.pop();
//            } else {
//                studentsQueue.add(studentsQueue.remove(0));
//            }
//
//            if (samsasStack.isEmpty() && !studentsQueue.isEmpty()) {
//                return studentsQueue.size();
//            }
//        }
//
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        int[] students = {1, 1, 0, 0};
//        int[] samsas = {0, 1, 0, 1};
//
//        int unableToEatCount = unableToEat(students, samsas);
//        System.out.println(unableToEatCount);
//    }
//}
//6.
//public class Main {
//    public static void heapify(int[] arr, int n, int i) {
//        int largest = i, left = 2 * i + 1, right = 2 * i + 2;
//
//        if (left < n && arr[left] > arr[largest]) largest = left;
//        if (right < n && arr[right] > arr[largest]) largest = right;
//
//        if (largest != i) {
//            swap(arr, i, largest);
//            heapify(arr, n, largest);
//        }
//    }
//
//    public static void buildMaxHeap(int[] arr) {
//        for (int i = arr.length / 2 - 1; i >= 0; i--) heapify(arr, arr.length, i);
//    }
//
//    public static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {12, 11, 13, 5, 6, 7};
//
//        System.out.println("Original array:");
//        printArray(arr);
//
//        buildMaxHeap(arr);
//
//        System.out.println("Max heap:");
//        printArray(arr);
//    }
//
//    public static void printArray(int[] arr) {
//        for (int value : arr) System.out.print(value + " ");
//        System.out.println();
//    }
//}
