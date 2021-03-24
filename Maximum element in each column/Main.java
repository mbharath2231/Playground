#include<iostream>
using namespace std;
int main()
{
   int r,c,a[100][100],i,j,m=-1;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      cin>>a[i][j];
  }
  for(j=0;j<c;j++)
  {
    for(i=0;i<r;i++)
    {
      if(m<a[i][j])
        m=a[i][j];
    }
    cout<<m<<"\n";
    m=-1;
  }
}