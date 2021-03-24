#include<iostream>
using namespace std;
struct Node
{
  int data;
  Node *prev,*next;
}*newnode,*first,*last,*temp;

void display()
{
  temp=first;
  while(temp!=NULL)
  {
    cout<<temp->data<<"\n";
    temp=temp->next;
  }
}
void insert(int pos,int val)
{
  temp=first;
  newnode = new Node();
  newnode->data=val;
  if(pos==1)
  {
    newnode->prev=first;
    newnode->next=first->next;
    first->next=newnode;
   
  }
  else
  {
    while(pos>1)
    {
      temp=temp->next;
      pos--;
    }    
    if(temp->next!=NULL)
    {
     newnode->prev=temp;
     newnode->next=temp->next;
     temp->next=newnode;
    }
    else
    {
      last->next=newnode;
      newnode->prev=last;
      newnode->next=NULL;
    }
  }
}
     
int main()
{
  int n,pos,val;
  while(cin>>n)
  {
   if(n<0)
     break;
    newnode = new Node();
    newnode->data=n;
    if(first==NULL)
    {
      first=last=newnode;
      first->prev=NULL;
    }
    else
    {
      last->next=newnode;
      newnode->prev=last;
      last=newnode;
    }
  }
  cout<<"Before inserting:\n";
  display();
  cout<<"Enter the value and position\n";
  cin>>pos>>val;
  insert(pos,val);
  cout<<"After inserting:\n";
  display();

  return 0;
}
