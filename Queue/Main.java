#include<iostream>
using namespace std;
int main()
{
  int n,m,a[100],i,c=0;
  cin>>n>>m;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  i=0;
 while(i<n)
  {
    if(a[i]<m && a[i+1]==1)
    {
      c++;
      ++i;
    }
   else
    c++;
   
   i++;
  }
  cout<<c;
}