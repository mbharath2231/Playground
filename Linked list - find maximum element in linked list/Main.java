#include<iostream>
#include<cstdlib>
using namespace std;
class Node
{
	public:
	int data;
	Node *next;
}*head = NULL;
void append(int val)
{
	Node *temp,*newnode;
	temp = head;
	newnode = new Node();
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
/*void display()
{
	Node *temp = head;
	while(temp != NULL)
	{
		cout<<temp->data<<" ";//8 3 5 
		temp = temp->next;
	}
}*/
int max_element()
{
  int max = 0;
  Node *temp = head;
  while(temp != NULL)
  {
    if(temp->data > max)
      max = temp->data;
    temp = temp->next;
  }
  return max;
}
int main()
{
	int value;
	while(1)
	{
		cin>>value;
		if(value>0)
			append(value);
		else
			break;
	}
  int max=max_element();
  cout<<max;
	return 0;
}