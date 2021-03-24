#include<iostream>
using namespace std;
int main()
{
  int r,c,a[100][100],i,j,s=0;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    s=0;
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
      s+=a[i][j];
    }
    cout<<s<<"\n";
  }
}