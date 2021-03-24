#include <iostream>
using namespace std;
int arr[1000],top1=-1,top2=-1,n;
void push_stack1(int val)
{
  if(top1>=1000)
    cout<<"Stack 1 overflow";
  else
  {
    arr[++top1] = val;
  }
}
void push_stack2(int val)
{
  if(top2>=1000)
    cout<<"Stack 2 overflow";
  else
  {
    if(top2==-1)
    {
      top2 = n = top1;
    }
    arr[++top2] = val;
  }
}
void pop_stack1()
{
  if(top1==-1)
    cout<<"Stack underflow. pop from stack 1 failed\n";
  else
  	--top1;
}
void pop_stack2()
{
   if(top2<=n)
    cout<<"Stack underflow. pop from stack 2 failed\n";
  else
  	--top2;
}
void display_stack1()
{
  cout<<"Stack 1 Elements:\n";
  for(int i=top1;i>=0;i--)
    cout<<arr[i]<<" ";
  cout<<endl;
}
void display_stack2()
{
  cout<<"Stack 2 Elements:\n";
  for(int i=top2;i>n;i--)
    cout<<arr[i]<<" ";
  cout<<endl;
}
int main() 
{
  int n1,n2,value,d1,d2;
  cin>>n1;
  for(int i=0;i<n1;i++)
  {
    cin>>value;
    push_stack1(value);
  }
  cin>>n2;
  for(int i=0;i<n2;i++)
  {
    cin>>value;
    push_stack2(value);
  }
  display_stack1();
  display_stack2();
  cin>>d1>>d2;
  for(int i=0;i<d1;i++)
    pop_stack1();
  for(int i=0;i<d2;i++)
    pop_stack2();
  display_stack1();
  display_stack2();
  return 0;
}
