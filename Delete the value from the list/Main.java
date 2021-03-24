#include<iostream>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*newnode,*temp,*first,*last;
void display()
{
  temp=first;
  while(temp!=NULL)
  {
    cout<<temp->data<<"-->";
    temp=temp->next;
  }
  cout<<"NULL";
}
void del(int pos,int f)
{
  if(f==0)
    return ;
  temp=first;
  if(pos==1)
  {
    first=first->next;
    delete(temp);
  }
  else
  {
  while(pos>2)
  {
    temp=temp->next;
    pos--;
  }
  Node *t=temp->next;
  temp->next=temp->next->next;
  }
}
int main()
{
  int n,x,pos=0;
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
  cout<<"Before deletion:\n";
  display();
  temp=first;
  int found=0;
  while(temp!=NULL)
  {
    if(temp->data==x)
    {
      found=1;
      pos++;
      break;
    }
    pos++;
    temp=temp->next;
  }
  del(pos,found);
  cout<<"\nAfter deletion:\n";
  display();
  return 0;
}