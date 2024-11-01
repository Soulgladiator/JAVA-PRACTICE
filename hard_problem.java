import java.util.*;

public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = 23;
        int[] edge = {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
        int node1 = 13;
        int node2 = 16;
        nearest(N,edge,node1,node2);
    }
    
    public static void nearest(int N,int[] Edge,int node1,int node2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        int element = -1;
        set1.add(node1);
        set2.add(node2);
        element = findNearest(Edge,node1,node2,set1,set2);
        System.out.print(element);
    } 
    
    public static int findNearest(int[] Edge,int node1,int node2,HashSet<Integer> set1,HashSet<Integer> set2){
        if(Edge[node1]==-1 && Edge[node2]==-1){
            return -1;
        }
        if(node2!=-1 && set1.contains(Edge[node2])){
            return Edge[node2];
        }
        else if(node2!=-1){
            set2.add(Edge[node2]);
        }
        if(node1!=-1 && set2.contains(Edge[node1])){
            return Edge[node1];
        }
        else if(node1!=-1){
            set1.add(Edge[node1]);
        }
        if(node1==-1 && node2!=-1){
            return findNearest(Edge,node1,Edge[node2],set1,set2);
        }
        if(node1!=-1 && node2==-1){
            return findNearest(Edge,Edge[node1],node2,set1,set2);
        }
        return findNearest(Edge,Edge[node1],Edge[node2],set1,set2);
        
    }
}


