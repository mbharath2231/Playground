#include<iostream>
using namespace std;
int main()
{
   //Type your code here..
  int a,b;
  cin>>a>>b;
  if(a==0 || b==0)
    cout<<"Division by zero Exception";
  else
    cout<<a/b;
}