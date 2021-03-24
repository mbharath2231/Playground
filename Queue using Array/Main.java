#include<iostream>
using namespace std;
int queue[1000],front=-1,rear=-1;
int isEmpty()
{
  return (front==-1 && rear==-1);
}

int insert(int n)
{
  if(front==-1 && rear==-1)
    front=rear=0;
  else
    rear+=1;
  queue[rear]=n;
 
}

void del()
{
  if(front==-1 && rear==-1)
    cout<<"Queue Underflow\n";
  else if(front==rear)
  {
    cout<<"Element deleted from queue is : "<<queue[front]<<endl;
    front=rear=-1;
  }
  else
  {
    cout<<"Element deleted from queue is : "<<queue[front]<<endl;
    front+=1;
  }
   
}

void display()
{
  if(isEmpty())
    cout<<"Queue is empty\n";
  else
  {
    for(int i=front;i<=rear;i++)
      cout<<queue[i]<<" ";
    cout<<"\n";
  }
}
int main()
{
  int n;
  while(cin>>n)
  {
    if(n==1)
    {
      int a;
      cin>>a;
      insert(a);
    }
    else if(n==2)
    {
      del();
    }
    else if(n==3)
    {
      display();
    }
    else if(n==4)
    {
      return 0;
    }
    else
      cout<<"Wrong choice\n";
  }
  return 0;
}