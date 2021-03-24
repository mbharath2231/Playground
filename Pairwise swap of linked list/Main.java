#include<iostream>
#include<cstdlib>
using namespace std;
class Node
{
	public:
	int data;//2 bytes
	Node *next;//2 bytes
}*head = NULL;
void append(int val)
{
	Node *temp,*newnode;
	temp = head;
	//create memory for node
	newnode = new Node();//4 bytes
	//insert the values
	newnode->data = val;
	newnode->next = NULL;
	//link
	if(head == NULL)//1000 == NULL false
		head = newnode;
	else
	{
		while(temp->next != NULL)//NULL!=NULL false
			temp = temp->next;
		//lastnode connection
		temp->next = newnode;
	}
}
void display()
{
	Node *temp = head;
	while(temp != NULL)//NULL != NULL false
	{
		cout<<temp->data<<endl;//8 3 5 
		temp = temp->next;
	}
}
void pairwise_swap()
{
  Node *temp = head;
  while(temp != NULL && temp->next!=NULL)//first condn -> even count, second condn->odd count
  {
 	int val = temp->data;
    temp->data = temp->next->data;
    temp->next->data = val;
    temp = temp->next->next;
  }
}
int main()
{
	int value;
	while(1)
	{
		cin>>value;//8 3 5 -1
		if(value>0)
			append(value);
		else
			break;
    }
  pairwise_swap();
  display();
	return 0;
}