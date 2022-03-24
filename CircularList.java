public class CircularList{
    
    Node head;
    Node tail;
    public void insertatfirst(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        head = node;
        tail = node;
    }
    
    public void insertatown(int index, int data){
        
        Node node = new Node();
        node.data = data;
        if(index == 0){
            insertatfirst(data);
        }
        else{
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
        
    public void insertnext(int data){
        
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }
    
    public void delete(int data){
        
        Node node = head;
        if(node == null){
            System.out.println("No data here");
        }
        if(node.data == data){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.data == data){
                node.next = n.next;
                System.out.print("Data Deleted : " + n.data + "\n");
                break;
            }
            node = node.next;
        }while(node != head);
    }
    
    public void display(){
        
        Node node = head;
        if(head == null){
            System.out.println("No data's present here");
        }
        else{
            do{
                System.out.print(node.data + " --> ");
                node = node.next;
            }while(node != head);
        }
        System.out.print("END\n");
    }
}

// Created by Abdul Latif