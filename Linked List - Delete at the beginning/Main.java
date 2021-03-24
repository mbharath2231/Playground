#include<iostream>
using namespace std;
struct Node
{ 
	int data; 
	Node* next; 
}*newnode, *first, *last, *temp;
void insertion()
{
	int n;
	cin>>n;
	for(int i = 0; i < n; i++){
    	newnode = new Node();
    	cin>>newnode->data;
		if(first == NULL)
		{
	    	first = last = newnode;
		}
		else
		{
	    	last->next = newnode;
        	last=newnode;
		}
		last->next = NULL;
	}
}
void deletion()
{
  int n;
  cin>>n;
  while(n--)
  {
    temp=first;
    if(temp==NULL)
    {
      cout<<"No elements to delete\n";
    }
	else
    {
      first=first->next;
      delete(temp);
    }
  }
}
void display()
{
    temp = first;
    if(temp==NULL)
    {
        cout<<"No elements to display"<<endl;
    }
    else
    {
    	while(temp != NULL)
    	{
    	    cout<<temp->data<<"-->";
    	    temp=temp->next;
    	}
    	cout<<"NULL\n";
    }
}

int main() { 
  insertion();
  display();
  deletion();
  display();
  return 0; 
}