#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100],m=-1,i,j;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      if(a[i][j]>m)
        m=a[i][j];
    }
  }
  cout<<"The maximum element is "<<m;
}