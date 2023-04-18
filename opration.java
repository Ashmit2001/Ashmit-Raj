import java.util.Scanner;

public class opration{

    int arr[];
    int size;
    opration(int capacity){
        arr = new int[capacity];
        size = 0;
    }
       void insert(int index , int element){
         // if(index>size){
           // throw new RuntimeException("it can't");
          //} if(size==index){
            //  throw new RuntimeException("it cant");
          //}
            for(int i =size-1; i>=index; i--){
                arr[i+1] = arr[i];
            }
                arr[index] = element;
                size++;
            }
       
       void delete( int index){
           if(size==0){
               throw new RuntimeException("size is empty");
           }
              for(int i = index; i<size; i++){
                  arr[i] = arr[i+1];
              }
               size--;
           
       }
       void print(){
           System.out.println("*****print******");
           for(int ele : arr){
               System.out.println(ele);
           }
           
       }
       void update(int element , int newelement){
           int index = search(element);
           if(index == -1){
               System.out.println("you cant do updation");
                 return;
           }
           arr[index] = newelement;
           
       }
       int search(int element){
           for(int i =0; i<size; i++){
               if(arr[i]==element){
                   return i;
               }
           }
           return -1;
           
           
       }
         public static void main(String arr[]){
             opration op = new opration(5);
             Scanner sc = new Scanner(System.in);
             int index ;
             int element;
             int newelement;
             while(true){
             System.out.println("1. Add new element");
             System.out.println("2.delete element");
             System.out.println("3.print element ");
             System.out.println("4.search element");
             System.out.println("5.update element");
             System.out.println("6.exit");
             System.out.println("enter the choice");

             int choice = sc.nextInt();
             switch(choice){
                 case 1:
                     System.out.println("enter the index");
                     index = sc.nextInt();
                     System.out.println("enter the element");
                     element = sc.nextInt();
                     op.insert(index , element);
                     break;
                     case 2:
                         System.out.println("enter the index");
                     index = sc.nextInt();
                         op.delete(index);
                         break;
                         case 3:
                             op.print();
                             case 4:
                                 System.out.println("enter the element");
                     element = sc.nextInt();
                                 String msg = op.search(element) == -1 ?"element not found  ":"element found"+element;
                                 System.out.println(msg);
                                 break;
                                 case 5:
                                     System.out.println("enter the element");
                     element = sc.nextInt();
                     System.out.println("enter the element");
                     newelement = sc.nextInt();
                                     op.update(element , newelement);
                                     break;
                                     case 6:
                                         sc.close();
                                         return;
                                         default:
                                         System.out.println("wrong choice");
                                 
             }
             }
         }
    }
