package ReadAgain.dataAndAlgo.graph;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.LinkedList;
import java.util.Queue;

// 无向图的实现
public class graph {
    private int v;
    private LinkedList<Integer> adj[];

    public graph(int v){
        this.v = v;
        this.adj = new LinkedList[v];
        for(int i = 0; i < v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t){
        adj[s].add(t);
        adj[t].add(s);
    }

    //dfs
    boolean found = false;
    public void dfs(int s, int t){
        found = false;
        boolean [] visited = new boolean[v];
        int [] prev = new int[v];
        for(int i = 0; i < v; i++){
            prev[i] = -1;
        }
        recurDfs(s,t,visited,prev);
        printAll(prev,s,t);
    }

    private void recurDfs(int w, int t, boolean[] visited, int [] prev){
        if(found == true) return;
        visited[w] = true;

        if(w == t){
            found = true;
            return;
        }

        for(int i = 0; i < adj[w].size(); i++){
            int q = adj[w].get(i);
            if(!visited[q]){
                prev[q] = w;
                recurDfs(q,t,visited,prev);
            }
        }
    }

    // bfs
    public void bfs(int s, int t){
        if(s == t) return;
        boolean [] visited = new boolean[v];
        visited[s] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        int [] prev = new int[v];
        for(int i = 0; i < v; i++){
            prev[i] = -1;
        }

        while(!queue.isEmpty()){
            int w = queue.poll();
            for(int i = 0; i < adj[w].size(); i++){
                int q = adj[w].get(i);
                if(!visited[q]){
                    prev[q] = w;
                    if(q == t){
                        printAll(prev,s,q);
                        return;
                    }
                    visited[q] = true;
                    queue.add(q);
                }
            }
        }
    }

    //print
    public void printAll(int [] prev, int s, int t){
        if(prev[t] != -1 && s != t){
            printAll(prev,s,prev[t]);
        }
        System.out.print(t + " ");
    }
}
