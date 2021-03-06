public class Linklist {
    int size;
    Linklist(){
        this.size=0;     //initialize the size with zero, idk we do we initiliaze tho
    }
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
        } size++;
        newNode.next =head;  //new node will point to head if there is already a list
            head =newNode;       //and the new head will be your added node

    }



    //creating a function to add the elements at the end of the list
    public void addLast(String data){
        Node newNode =new Node(data); //same as add first condition
        if(head==null){
            head =newNode;
            return;
        } size++;

        Node currentNode= head;   //here took currentNode as changes with head will impact the whole thing
            while(currentNode.next!=null){
                currentNode =currentNode.next;   //changing the pointers until the condition reaches
            }  currentNode.next= newNode;        //so the new node which already has next as null wil be the current node
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
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            size--;        //idk why we added it here, this concept is not clear yet
        }else{
            head= head.next;            //changing the next head to tbe consecutive one
        }
    }

    //creating the method to delete the last elements from the list
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");   //same corner case as used in delete first
        return;
        }
        size--;            //idk if we are considering it for the upper half or the bottom of this method

        if (head.next==null){    //because if there is only one element then we are only deleting that one.
            head=null;
            return;
        }

        else{
            Node secondLast= head;
            Node lastNode= head.next;
            while(lastNode.next!=null){      //until the condition reaches consecutively changing the orders of elements
                lastNode = lastNode.next;
                secondLast = secondLast.next;
            }
            secondLast.next=null;           //Once we reached our condition then the second last element will point to null
        }
    }
    public int getSize(){
        return size;
    }

    //creating the method to reverse the nodes
    public void  reverseNode(){
        if(head==null||head.next==null){    //if its empty or just a list containing single element
            return;
        }
        Node current = head.next;
        Node previous = head;


        while(current!=null){
            Node next = current.next; //We here assign the next node to current.next, idk why are we declaring it in the loop, I tried outsite of it but did not work

            current.next = previous;  //its basically current node pointing backwards
            //values update
            previous = current;     // now previous points toward current node
            current = next;         //current links to next node and LOOP CONTINUTES
        }
        head.next = null;           //next of the head will be null
        head = previous;            //now the new head will be previous, so updating it
    }



    public static void main(String[] args) {
        Linklist list = new Linklist();
        list.addFirst("Kunal");
        list.addLast("Kheeva");
        list.addLast("saab the great");
        list.print();
        list.reverseNode();
        list.print();


    }
}
