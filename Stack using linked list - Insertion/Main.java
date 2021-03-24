#include<iostream>
using namespace std;
class Node
{
  public:
	int data;
  	Node *next;
}*head = NULL;
void append(int val)
{
  Node *newnode = new Node();
  newnode->data = val;
  newnode->next = head;
  head = newnode;
}
void display()
{
  Node *temp = head;
  while(temp!=NULL)//NULL != NULL false
  {
    cout<<temp->data<<" ";
    temp = temp->next;
  }
}
int main()
{
  int value;
  while(1)
  {
    cin>>value;//1 2 3 -1
    if(value>0)
    	append(value);
    else
      break;
  }
  if(head == NULL)
    cout<<"Stack is empty";
  else
  	display();
  return 0;
}