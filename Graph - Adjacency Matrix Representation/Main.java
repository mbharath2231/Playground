#include<iostream>
using namespace std;
void printMatrix(int **adj_mat,int nv)
{
  cout<<"Adjacency Matrix Representation:"<<endl;
  for(int i=0;i<nv;i++)
  {
    for(int j=0;j<nv;j++)
    {
      cout<<adj_mat[i][j]<<" ";
    }
    cout<<endl;
  }
}
int main()
{
  int nv,ne,s_node,e_node,weight;//nv -> no of vertices and ne -> no of edges
  string dir;
  cout<<"Please enter the number of nodes in the graph"<<endl;
  cin>>nv;
  cout<<"Please enter the number of edges in the graph"<<endl;
  cin>>ne;
  cout<<"Is the graph directed"<<endl;
  cin>>dir;
  int **adj_mat = (int**)malloc(sizeof(int*)*nv);
  for(int i=0;i<nv;i++)
    *(adj_mat+i) = (int*)malloc(sizeof(int) * nv);
  for(int i=0;i<nv;i++)
    for(int j=0;j<nv;j++)
      adj_mat[i][j] = 0;
  printMatrix(adj_mat,nv);
  for(int i=0;i<ne;i++)
  {
    cout<<"Enter the start node, end node and weight of edge no "<<i+1<<endl;
    cin>>s_node>>e_node>>weight;
    if(dir == "yes")
    {
    	adj_mat[s_node-1][e_node-1] = weight;
    }
    else
    {
      	adj_mat[s_node-1][e_node-1] = weight;
    	adj_mat[e_node-1][s_node-1] = weight;
    }
  }
  printMatrix(adj_mat,nv);
  return 0;
}
