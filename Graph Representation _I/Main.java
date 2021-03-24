#include<iostream>
#include<list> 
using namespace std;
int n,matrix[1000][1000]={0};
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
   matrix[u-1][v-1]=1;
 }
int main()
{
  cout<<"Enter number of nodes:\n"; 
  cin>>n; 
  int u,v;
  while(cin>>u>>v){
    insert(u,v);
  }
  display();
}