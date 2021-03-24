#include<iostream>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*newnode,*temp,*first,*last;
int main(){
int n,f=0,x;
    cin>>n;
    while(n--)
    {
      newnode=new Node;
      cin>>newnode->data;
      if(first==NULL)
        first=last=newnode;
      else
      {
        last->next=newnode;
        last=newnode;
      }
    }
    cin>>x;
    temp=first;
    while(temp!=NULL)
    {
      if(temp->data==x)
      {
        f=1;
      }
      cout<<temp->data<<"-->";
      temp=temp->next;
    }
  cout<<"NULL\n";
  if(f)
    cout<<"Element Found";
  else
    cout<<"Element not found";
return 0;
}