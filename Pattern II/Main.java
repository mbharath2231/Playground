#include<iostream>
using namespace std;
int main()
{
  int i,j,n,k=1,l;
  cin>>n;
  for(i=0;i<n;i++)
  {
    if(i%2==0)
    {
      for(j=0;j<i;j++)
    {
      cout<<k<<"*";
        k++;
    }
    cout<<k<<"\n";
      k++;
    }
    else
    {
      l=k+i;
      for(j=i;j>0;j--)
      {
        cout<<l<<"*";
        l=l-1;
      }
      cout<<l<<"\n";
      k=l+i+1;
    }
  }
}
  