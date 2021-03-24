#include<iostream>
using namespace std;
int main()
{
   int r,c,a[100][100],i,j,s=0;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      if(i==0 || i+j==c-1 || i==r-1)
        s+=a[i][j];
    }
  }
  cout<<"Sum of Zig-Zag pattern is "<<s;
}