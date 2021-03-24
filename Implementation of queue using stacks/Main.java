#include<iostream>
#include<stack>
using namespace std;
int main()
{
  stack <int> s1,s2;
  int n,a;
  cin>>n;
  while(n--)
  {
    cin>>a;
    s1.push(a);
  }
  while(!s1.empty())
  {
    s2.push(s1.top());
     s1.pop();
  }
  while(!s2.empty())
  {
    cout<<s2.top()<<" ";
    s2.pop();
  }
  return 0;
}