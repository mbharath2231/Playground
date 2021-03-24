#include<iostream>
using namespace std;
int main()
{
    int a[100][100],n,i,j,s=0,s1=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
      if(i==j)
        s+=a[i][j];
      if(i+j==n-1)
        s1+=a[i][j];
    }
  }
  if(s==s1)
    cout<<"Yes";
  else
    cout<<"No";
}