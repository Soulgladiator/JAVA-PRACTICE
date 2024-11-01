class solution{
int leastCommonDescendent(int nodes[], int N, int node1, int node2) {
    int visited[] = new int[N]; 
    int cnt1 = 0;  // used for counting length of path from node1 to node2
    int cnt2 = 0;  // used for counting length of path from node2 to node1
    int mark = node1;  // storing as a marker needed later for detecting end of search
    
    if (node1 == node2) return node2;

    // Initialize visited array
    for (int i = 0; i < N; i++) {
        visited[i] = 0;
    }

    // Traverse the path starting from node1
    while ((nodes[node1] != node1) && (nodes[node1] != -1) && (visited[node1] == 0) && (node1 != node2)) {
        visited[node1]++;
        node1 = nodes[node1];
        cnt1++;
    }
    visited[node1]++;  // Increment count for the meeting node in the cycle

    // Traverse the path starting from node2
    while ((nodes[node2] != node2) && (nodes[node2] != -1) && (visited[node2] < 2) && (node1 != node2)) {
        visited[node2]++;
        node2 = nodes[node2];
        cnt2++;
    }

    // If nodes are in different disjoint subgraphs
    if (node1 != node2) return -1;

    // Check if nodes are in different subgraphs but one has a loop
    if ((nodes[node1] == -1) && (visited[node2] == 1)) return -1;
    if ((nodes[node2] == -1) && (visited[node1] == 1)) return -1;

    // If nodes are in the same subgraph, return the node with the shorter path
    if (cnt1 > cnt2)
        return node2;
    else
        return mark;
}
public static void main(String[] args{


}
}
