#include<iostream>
using namespace std;
class Node
{
  public:
  int data;
  Node *next;
}*head=NULL;
void append(int val)
{
  Node *temp,*newnode;
  temp=head;
  newnode=new Node();
  newnode->data=val;
  newnode->next=NULL;
  if(head==NULL)
    head=newnode;
   else
   {
     while(temp->next!=NULL)
       temp=temp->next;
     temp->next=newnode;
   }
}
void delete_beg()
{
  Node *temp,*next;
  temp=head;
  next=temp->next;
  head=next;
  temp->next=NULL;
  free(temp);  
}
void display()
{
  Node *temp=head;
  while(temp!=NULL)
  {
    cout<<temp->data<<endl;
    temp=temp->next;
  }
}
int main()
{
  int value;
  while(1)
  {
    cin>>value;
    if(value>0)
      append(value);
     else
       break;
  }
  delete_beg();
  display();

  return 0;
}