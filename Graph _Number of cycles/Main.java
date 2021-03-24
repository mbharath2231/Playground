#include<iostream>
#include<list>
using namespace std; 
int n,x,u,v,counter=0;
list <int> adjacency_list[1000]; 
bool visited[1000]={0};
void insert()
{
  adjacency_list[u].push_back(v);
  //adjacency_list[u].push_back(v);
}
void iscyclic(int v,int parent)
{
  list<int>::iterator i; 
    for (i = adjacency_list[v].begin(); i != adjacency_list[v].end(); i++) 
    {
      if(visited[*i]==0)
      {
        visited[*i]=1;
        iscyclic(*i,v);
      }
      else if(*i!=parent){//cout<<*i<<" ";
        counter++;}
    }
  
}
void Cycles()
{ 
  for(int i=1;i<=n;i++)
  {
    if(visited[i]==0)
    {
      visited[i]=1; 
      iscyclic(i,-1);
    } 
  }
}
  
int main()
{
  cin>>n>>x; 
  for(int i=0;i<x;i++)
  {
    cin>>u>>v; 
    insert(); 
  } 
  Cycles();
  cout<<"Number of Cycles: "<<counter*2-((counter-1)%2);
  
}