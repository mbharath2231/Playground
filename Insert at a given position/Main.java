#include <iostream> 
using namespace std; 
struct Node { 
    int data; 
    Node* next; 
}*newnode, *first, *last, *temp; 
int main() { 
    int n,pos,m=1;
    cin>>n;
    for(int i=0;i<n;i++)
    {
      newnode=new Node();
      cin>>pos>>newnode->data;
      newnode->next=NULL;
      m++;
      if(pos>=m)
      {
        cout<<"Invalid position\n";
        continue;
      }
      if(i==0)
      {
        if(pos!=1)
          cout<<"Invalid position\n";
        else
        first=last=newnode;
      }
      else if(pos==1)
      {
        newnode->next=first;
        first=newnode;
      }
      else
      {
      temp=first;
      while(pos>2)
      {
        temp=temp->next;
        pos--;
      }
        if(temp->next!=NULL)
        {
        newnode->next=temp->next;
        temp->next=newnode;
        }
        else
        {
          temp->next=newnode;
        }
       
     }
   }
    temp=first;
    while(temp!=NULL)
    {
      cout<<temp->data<<"->";
      temp=temp->next;
    }
   cout<<"NULL";
    return 0; 
}