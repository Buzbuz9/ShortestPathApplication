import java.util.LinkedList;
import java.util.ArrayList;
import java.io.IOException;
public class Main {
   public static void main(String[] args) {
        //launch();
        
        
        Node start = new Node("Start", "0000", 0);
        Node end = new Node("End", "0102", 4);
        Node n = new Node("", "", 1);
        Node n2 = new Node("", "", 2);
        Node n3 = new Node("", "", 3);
        Node n4 = new Node();
        
         LinkedList<Node> list0 = new LinkedList<Node>();
        list0.add(n);
        list0.add(n2);
        list0.add(n3);
        
        
        LinkedList<Node> list1 = new LinkedList<Node>();
        list1.add(start);
        list1.add(n2);
        list1.add(n3);
        
        LinkedList<Node> list2 = new LinkedList<Node>();
        list2.add(start);
        list2.add(n);
        list2.add(n3);
        
        LinkedList<Node> list3 = new LinkedList<Node>();
        list3.add(start);
        list3.add(n);
        list3.add(n2);
        list3.add(end);
        
        LinkedList<Node> list4 = new LinkedList<Node>();
        list4.add(n3);
      
        
        ArrayList<LinkedList<Node>> group = new ArrayList<LinkedList<Node>>();
        group.add(list0);
        group.add(list1);
        group.add(list2);
        group.add(list3);
        group.add(list4);
       
        Graph g = new Graph(group);
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.traversal(start, end, g);
        
        
    }
}
