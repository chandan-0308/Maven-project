package sjb.greedymethod.TreesandGraph;

import java.util.ArrayList;

//simple program to converting node to graph(Bfs)

public class Graph 
{
	ArrayList<ArrayList<Integer>> graph;//creating array list of 2d
	int v;
	Graph(int nodes)
	{
		v=nodes;
		graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<v;i++)
		{
			graph.add(new ArrayList<Integer>());
		}
	}
	void edge(int v,int u)//v=vertices u=edges
	{
		//bidirected/bidirectional graph
		graph.get(v).add(u);
		graph.get(u).add(v);
	}
	void prentgr()
	{
		for(int i=0;i<v;i++)
		{
			System.out.println("node: "+i);
			for(int x:graph.get(i))System.out.println("->"+x);//use of lambda type function
		}
	}
	public static void main(String[] args)
	{
		Graph g=new Graph(5);
		g.edge(0, 1);
		g.edge(3, 2);
		g.edge(2, 4);
		g.prentgr();
	}
}

