#include <iostream>
using namespace std;
int total_ways(int cr,int cc,int n,int m)
{
  if(cr>=n || cc>=m)//border condition
    return 0;
  if(cr==n-1 && cc==m-1)//destination reached 
    return 1;
  return total_ways(cr,cc+1,n,m) + total_ways(cr+1,cc,n,m);//moves to right + moves to down
}
int main() 
{
  int n,m;
  cin>>n>>m;//n->rows and m->col
  cout<<total_ways(0,0,n,m);
  return 0;
}
