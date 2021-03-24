#include<iostream>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*newnode,*temp,*first,*last,*Next,*cur;

int main()
{
  int n,x,s=0;
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
    s++;
  }
  cout<<"Enter the nth node:\n";
  cin>>x;
  int pos=s-x;
  if(pos<0)
    cout<<"There is no nth node in the list";
  else if(pos==1)
    cout<<last->data<<" is the nth node element in the list";
  else
  {
    temp=first;
    while(pos>0)
    {
      temp=temp->next;
      pos--;
    }
    cout<<temp->data<<" is the nth node element in the list";
   }
}
