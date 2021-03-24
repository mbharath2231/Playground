#include<iostream>
#include<list> 
using namespace std; 
int n,u,v;
int matrix[1000][1000]={0}; 
bool visited[1000]={0};
void insert() 
{ 
  matrix[u][v]=1; 
  matrix[v][u]=1;
} 
void DFS(int i) 
{  
  visited[i]=1; 
  cout<<i<<" ";  
  for(int j=0;j<n;j++) 
  { 
    if(visited[j]==0 && matrix[i][j]) 
      DFS(j); 
  }
}
  
int main()
{
  //Type your code here 
  cin>>n; 
  if(n==0)  
  {
    cout<<"Graph doesn't exist"; 
    return 0; 
  }
  while(cin>>u>>v) 
  { 
    if(u<0 ) 
      break; 
    insert(); 
  }   
  cout<<"DFS : ";
  DFS(0);
  
}