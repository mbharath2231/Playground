#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100],i,j,m=-1,k=0,s=0;
  cin>>r>>c;
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    s=0;
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      s+=a[i][j];
    }
    cout<<s<<" ";
    if(s>m)
    {
      m=s;
      k=i+1;
    }
  }
  cout<<"\nRow "<<k<<" has maximum sum";
  k=0;
  m=-1;
  cout<<"\nSum of columns is ";
  for(j=0;j<c;j++)
  {
    s=0;
    for(i=0;i<r;i++)
    {
      s+=a[i][j];
    }
    cout<<s<<" ";
    if(s>m)
    {
      m=s;
      k=j+1;
    }
  }
  cout<<"\nColumn "<<k<<" has maximum sum";
}