public class Linklist {
    Node head;
    //creating a seperate class of node to acces the nodes
    public class Node{
        String data;                 //data of the node
        Node next;                 //pointer towards the next node
        Node(String data){        //added a constructor to help in as object
            this.data= data;
            this.next =null;
        }
    }


    //creating a function to add the elements from the first
public void addFirst(String data){
        Node newNode= new Node(data);
        if(head==null){           //if head is null assign newNode to it
            head =newNode;
            return;
        }else{
            newNode.next =head;  //new node will point to head if there is already a list
            head =newNode;       //and the new head will be your added node
        }
    }



    //creating a function to add the elements at the end of the list
    public void addLast(String data){
        Node newNode =new Node(data); //same as add first condition
        if(head==null){
            head =newNode;
            return;
        }
        else{
            Node currentNode= head;   //here took currentNode as changes with head will impact the whole thing
            while(currentNode.next!=null){
                currentNode =currentNode.next;   //changing the pointers until the condition reaches
            }  currentNode.next= newNode;        //so the new node which already has next as null wil be the current node
        }
    }

    //creating a print method
    public void print(){
        if(head==null){       //rare case without any element in the list will print empty list
            System.out.println("Empty list");
            return;
        }
        Node currentNode= head;                        //head node
        while(currentNode!=null){                     //until the current node points null
            System.out.print(currentNode.data+" -> ");//It will print my data
            currentNode= currentNode.next;            //and will be updating my current node to point the next one
        }
        System.out.println("Null");
    }

    //creating method to delete the elements from the front one by one

    public void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            head= head.next;            //changing the next head to tbe consecutive one
        }

    }



    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addFirst("Kunal");
        list.addLast("Kheeva");
        list.print();
        list.addLast("The Great");
        list.print();

    }
}
