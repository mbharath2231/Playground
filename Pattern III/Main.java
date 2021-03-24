#include<iostream>
using namespace std;
int main()
{
  int i,j,n,k=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=0;j<i;j++)
    {
      cout<<i;
      if(j!=i-1)
        cout<<"*";
    }
    //cout<<"*";
    cout<<"\n";
  }
  for(i=n;i>=1;i--)
  {
    for(j=0;j<i;j++)
    {
      cout<<i;
      if(j!=i-1)
      {
        cout<<"*";
      }
    }
    cout<<"\n";
  }
}
    