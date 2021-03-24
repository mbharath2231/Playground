#include<iostream>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*temp,*front,*rear;

void insert(int n)
{
  temp=new Node();
  temp->data=n;
  if(rear==NULL)
  {
    temp->next=NULL;
    rear=temp;
    front=temp;
  }
  else
  {
   
    rear->next=temp;
    temp->next=NULL;
    rear=temp;
  }
}

void display()
{
  temp=front;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp=temp->next;
  }
}
int main()
{
  int n;
  while(cin>>n)
  {
    if(n<0)
    {
      display();
      return 0;
    }
    else
       insert(n);
  }
  return 0;
}
