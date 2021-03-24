#include<iostream>
#include<queue>
#include<stack>
using namespace std;
int main()
{
  queue<int> q;
  stack<int> s;
  int n,a,k;
  cin>>n;
  for(int i=0;i<n;i++)
  {
    cin>>a;
    q.push(a);
  }
  cin>>k;
  if(k>=0 && k<=n)
  {
    for(int i=0;i<k;i++)
    {
      s.push(q.front());
      q.pop();
    }
    while(!s.empty())
    {
      q.push(s.top());
      s.pop();
    }
    for(int i=0;i<n-k;i++)
    {
      q.push(q.front());
      q.pop();
    }
  }
  while(!q.empty())
  {
    cout<<q.front()<<" ";
    q.pop();
  }
   
}
