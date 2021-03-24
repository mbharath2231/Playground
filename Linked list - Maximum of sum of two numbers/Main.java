#include<iostream>
#include<cstdio>
using namespace std;
struct Node
{
  int data;
  Node *next;
}*newnode,*temp,*first,*last,*del,*Next,*cur;

int main()
{
  int n,m=0;
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
  temp=first;
  while(temp!=NULL)
  {
    cur=temp->next;
    while(cur!=NULL)
    {
      if(temp->data+cur->data > m)
        m=(temp->data + cur->data);
      cur=cur->next;
    }
    temp=temp->next;
  }
  cout<<m;
} 