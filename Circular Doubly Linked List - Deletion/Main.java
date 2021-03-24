#include <iostream>
using namespace std;
struct node{
 int data;
 node *next,*prev;
}*first,*last,*temp,*newnode;
void traverse(){
 temp=first;
 cout<<temp->data<<"-->";
 temp=temp->next;
 while(temp!=first)
 {
   cout<<temp->data<<"-->";
   temp=temp->next;
 }
}
void deletion(int x)
{
 temp=first;
 while(x>0)
 {
   first->prev=first->prev->prev;
   last=first->prev;
   last->next=first;
   x--;
 }
}
int main()
{
// Type your code here
   int n;
   first=NULL;
   cin>>n;
   for(int i=0;i<n;i++)
   {
     newnode=new node();
     cin>>newnode->data;
     if(first==NULL)
       first=last=newnode;
     else
     {
       last->next=newnode;
       newnode->prev=last;
       last=newnode;
     }
   }
 last->next=first;
 first->prev=last;
 traverse();
 cout<<"\n";
 int x;
 cin>>x;
 deletion(x);
 traverse();
return 0;
}