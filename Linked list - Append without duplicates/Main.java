#include<iostream>
#include<cstdio>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*newnode,*temp,*first,*last;

int check(int n)
{
  temp=first;
  while(temp!=NULL)
  {
    if(temp->data==n)
       return 0;
    temp=temp->next;
  }
  return 1;
}

void display()
{
  temp=first;
  while(temp!=NULL)
  {
    cout<<temp->data<<"\n";
    temp=temp->next;
  }
}
int main()
{
  int n;
  while(cin>>n)
  {
    if(n<0)
      break;
    newnode = new Node;
    newnode->data=n;
    if(first==NULL)
       first=last=newnode;
    else if(check(n))
    {
      last->next=newnode;
      last=newnode;
    }
  }
  display();
     
  return 0;
}