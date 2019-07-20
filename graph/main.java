package ReadAgain.dataAndAlgo.graph;

/**
 * 1.实现有向图、无向图、有权图、无权图的邻接矩阵和邻接表表示方法
 * 2.实现图的深度优先搜索、广度优先搜索
 * 3.实现 Dijkstra算 法、A*算法
 * 4.实现拓扑排序的 Kahn 算法、DFS算法
 */
public class main {
    public static void main(String[] args){
        graph demo = new graph(8);
        demo.addEdge(0,1);
        demo.addEdge(0,3);
        demo.addEdge(1,2);
        demo.addEdge(1,4);
        demo.addEdge(2,5);
        demo.addEdge(3,4);
        demo.addEdge(4,5);
        demo.addEdge(4,6);
        demo.addEdge(5,7);
        demo.addEdge(6,7);

        demo.dfs(0,6);


    }
}
