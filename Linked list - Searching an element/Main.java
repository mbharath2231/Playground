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
  Node *temp = head;
  Node *newnode = new Node();
  newnode->data = val;
  newnode->next = NULL;
  if(head == NULL)
    head = newnode;
  else
  {
    while(temp->next != NULL)
      temp = temp->next;
    temp->next = newnode;
  }
}
Node* search_value(int s)
{
  Node *temp = head;
  while(temp != NULL && temp->data != s)//3 != 3
    temp = temp->next;
  return temp;//NULL
}
int main()
{
  int value,search;
  while(1)
  {
    cin>>value;
    if(value>0)
      append(value);
    else
      break;
  }
  cout<<"Enter the value to be searched:"<<endl;
  cin>>search;//3
  Node *temp = search_value(search);//NULL
  if(temp != NULL)//3000 != NULL true
    cout<<search<<" is present in the list";
  else
    cout<<search<<" is not present in the list";
  return 0;
}
