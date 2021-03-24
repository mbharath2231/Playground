#include<iostream>
using namespace std;
class Node
{
  public:
  	int data;//2 bytes
  	Node *next;// 2,2 bytes => 4 bytes
}*head = NULL;
void append(int val)
{
  if(val>=0)//-1 > 0 false
  {
  	Node *temp = head;
  	//creating the memory for node
  	Node *newnode = new Node();
  	//insert the values
  	newnode->data = val;
  	newnode->next = NULL;
  	//link
  	if(head == NULL)//1000 == NULL false
    	head = newnode;
  	else
  	{
    	//to find lastnode
    	while(temp->next != NULL)
      		temp = temp->next;
    	//lastnode connection
    	temp->next = newnode;
  	}
  }
  else
  {
    if(head!=NULL)
    {
    	Node *temp = head;
    	//find lastnode
    	while(temp->next != NULL)
      		temp = temp->next;
    	temp->next = head;
    }
  }
}
void display()
{
  Node *temp = head;
  while(temp->next != head)
  {
    cout<<temp->data<<endl;
    temp = temp->next;
  }
  cout<<temp->data;
}
int main()
{
  int value;
  do
  {
    cin>>value;
    append(value);
  }while(value>0);
  if(head!=NULL)
  	display();
  else
    cout<<"No value has been inserted";
  return 0;
}
