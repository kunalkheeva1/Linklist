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
            while(currentNode!=null){
                currentNode =currentNode.next;   //changing the pointers until the condition reaches
            }currentNode.next=newNode;          //so the new node which already has next as null wil be the current node
        }
    }


    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addFirst("Kunal");

    }
}
