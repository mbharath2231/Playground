

#include<iostream>
#include<list>
using namespace std; 
int n,x,u,v;
list <int> adjacency_list[1000]; 
void insert()
{
  adjacency_list[v-1].push_back(u); 
  if(v!=u)
  adjacency_list[u-1].push_back(v); 
}
void display()
{
  cout<<"The adjacency list representation for the given graph:\n"; 
  for(int i=0;i<n;i++)
  {
    cout<<"\t"<<i+1<<"-> { "; 
    for (auto x : adjacency_list[i]) 
           cout  << x<<"  "; 
    
    cout<<"} \n";
  }
}
int main()
{
  //Type your code here
  cin>>n>>x; 
  while(cin>>u>>v)
  {
    insert();
  } 
  display();
}