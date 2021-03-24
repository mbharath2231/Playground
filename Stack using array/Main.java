#include<iostream>
using namespace std;
int main()
{
  int s[1000],t=-1,n,a;
  while(cin>>n)
  {
    if(n==1)
    {
      cin>>a;
      s[++t]=a;
    }
    else if(n==2)
    {
      if(t!=-1)
        t--;
      else
        cout<<"Stack is Empty!!! Deletion is not possible!!!\n";
    }
    else if(n==3)
    {
      if(t!=-1)
      {
        for(int i=t;i>=0;i--)
          cout<<s[i]<<endl;
      }
      else
        cout<< "Stack is Empty!!!\n";
    }
    else if(n==4)
    {
      return 0;
    }
    else
      cout<<"Wrong selection!!! Try again!!!\n";
  }
     
 
  return 0;
}