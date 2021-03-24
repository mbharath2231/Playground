#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100],b[100][100],i,j;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cout<<a[i][j]+b[i][j]<<" ";
    }
    cout<<"\n";
  }
    
}