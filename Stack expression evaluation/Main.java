#include<iostream>
using namespace std;
class Node
{
  public:
  	int data;
  	Node *next;
}*head = NULL;
void push(int val)
{
  Node *newnode = new Node();
  newnode->data = val;
  newnode->next = head;
  head = newnode;
}
int pop()
{
  Node *temp = head;//1000
  head = temp->next;
  temp->next = NULL;
  int val = temp->data;//5
  free(temp);
  return val;
}
int main()
{
  string s;
  cin>>s;//56+7-
  for(int i=0;i<s.length();i++)//i=5 ; 5<5 false
  {
    if(s[i]>='0' && s[i]<='9')
      push(s[i] - '0');
    else
    {
      int a = pop();//7
      int b = pop();//11
      switch(s[i])
      {
        case '+': push(a+b);break;
        case '-': push(a-b);break;
        case '*': push(a*b);break;
        case '/': push(a/b);break;
      }
    }
  }
  cout<<"Answer is "<<pop();
  return 0;
}
