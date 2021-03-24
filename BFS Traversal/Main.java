#include<iostream>
#include<list> 
#include<queue>
using namespace std;
int n,matrix[1000][1000]={0}; 
int visited[1000]={0};
queue <int> Q;
void display()
{
  for(int i=0;i<n;i++)
  {
    for(int j=0;j<n;j++)
      cout<<matrix[i][j]<<"  "; 
    cout<<"\n"; 
  } 
}
 void insert(int u,int v)
 { 
   matrix[u][v]=1;
   matrix[v][u]=1;
 } 
void BFS(int i) 
{  
    visited[i]=1; 
    Q.push(i); 
   while(!Q.empty())
   {
     i=Q.front(); 
     Q.pop(); 
     cout<<i<<" "; 
     for(int j=0;j<n;j++)
     {
       if(matrix[i][j] && visited[j]==0)
       {
         visited[j]=1; 
         Q.push(j);
       } 
     }
   }
}
  

int main()
{
  cin>>n; 
  if(n==0) 
  { 
    cout<<"Graph doesn't exist"; 
    return 0; 
  }
  int u,v;
  while(cin>>u>>v){ 
    if(u<0) 
      break;
    insert(u,v);
  }  
  cout<<"BFS : ";
  BFS(0);
}