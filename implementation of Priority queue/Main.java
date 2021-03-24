#include<iostream>
#include<queue>
using namespace std;
priority_queue <int> Q;
void display()
{
  while(!Q.empty())
  {
    cout<<Q.top()<<" "; 
    Q.pop(); 
  } 
}
int main()
{
  //Type your code here
  int n; 
  while(cin>>n)
  {
    if(n<0)
      break; 
    Q.push(n);
  } 
  display(); 
  
}