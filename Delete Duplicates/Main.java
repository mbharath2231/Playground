#include<iostream>
#include<cstdio>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*newnode,*temp,*first,*last,*del,*Next,*cur;

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
  while(scanf("%d",&n)==1)
  {
    if(n<0)
      break;
    newnode = new Node;
    newnode->data=n;
    if(first==NULL)
      first=last=newnode;
    else
    {
        last->next=newnode;
        last=newnode;
    }
  }
  cout<<"Linked list before removal of duplicates\n";
  display();
  temp=first;
  while(temp!=NULL)
  {
    cur=temp;
    while(cur->next!=NULL)
    {
      if(cur->next->data == temp->data)
      {
        del=cur->next;
        cur->next=cur->next->next;
        delete(del);
      }
      else
        cur=cur->next;
    }
    temp=temp->next;
  }
  cout<<"Linked list after removal of duplicates\n";
  display();
}