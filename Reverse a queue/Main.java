#include<iostream>
#include<queue>
#include<stack>
using namespace std;
queue <int> q;
stack <int> s;

void display()
{
  while(!q.empty())
  {
    cout<<q.front()<<" ";
    s.push(q.front());
    q.pop();
  }
}

void reverse()
{
  while(!s.empty())
  {
    cout<<s.top()<<" ";
    s.pop();
  }
}

int main()
{
  int n,f=0;
  while(cin>>n)
  {
    if(n<0)
      break;
    else
    {
      q.push(n);
      f=1;
    }
 
  }
  if(!f)
  {
    cout<<"Queue is empty";
    return 0;
  }
  else
  {
    cout<<"Before reversing:\n";
    display();
    cout<<"\nAfter reversing:\n";
    reverse();
  }
  return 0;
}
