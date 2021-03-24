#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
  int a[1000],n,pos,ele,k=0,i;
    cin>>n;
    memset(a,-1,n);
    while(n>0)
    {
      n--;
      cin>>pos>>ele;
      if((k==0 && pos!=0))
      {
        cout<<"Insertion failed\n";
        return 0;
       }
     else if(pos>k)
     {
       cout<<"Insertion failed\n";
       continue;
     }
      if(a[pos]!=-1)
      {
       for(i=k;i>pos;i--)
          a[i]=a[i-1];
      }
      k++;
      a[pos]=ele;
    }
 

   for(i=0;i<k;i++)
   {
     cout<<"Value at x["<<i<<"]= "<<a[i]<<endl;
   }
  return 0;
}