#include<iostream>
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
    cout<<temp->data<<" ";
    temp=temp->next;
  }
}

int main()
{
  int n,size=0;
  while(cin>>n)
  {
    if(n<0)
      break;
    newnode = new Node();
    newnode->data=n;
    if(first==NULL)
      first=last=newnode;
    else
    {
      last->next=newnode;
      last=newnode;
    }
    size++;
  }
    if(first==NULL)
    {
         cout<<"Deletion of second last element is not possible\n";
         return 0;
    }
   cout<<"Before deleting:\n";
   display();
   if(first->next==NULL)
    {
      cout<<"\nDeletion of second last element is not possible\n";
      return 0;
    }
   temp=cur=first;
   if(first->next->next==NULL)
      first=last;
   else
   {
     while(temp->next->next!=NULL)
     {
      cur=temp;
      temp=temp->next;
     }
   
    del = cur->next;
    cur->next=last;
    delete(del);
   }
    cout<<"\nAfter deleting:\n";
    display();
}
 
