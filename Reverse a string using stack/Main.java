#include<iostream>
using namespace std;
class Node
{
  public:
	char data;
  	Node *next;
}*head = NULL;
void append(char val)
{
  Node *newnode = new Node();
  newnode->data = val;
  newnode->next = head;
  head = newnode;
}
void display()
{
  while(head!=NULL)//4000 != NULL true
  {
    cout<<head->data;
    head = head->next;
  }
}
int main()
{
  string s;
  getline(cin,s);//face
  for(int i=0;i<s.length();i++)//i=1; 1<4 true
    append(s[i]);//append('a')
  display();
  return 0;
}
