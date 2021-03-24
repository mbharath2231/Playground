#include <iostream>
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
void pop()
{
  Node *temp = head;
  head = temp->next;
  temp->next = NULL;
  free(temp);
}
char top()
{
  return head->data;
}
int checkParanthesis(string s)
{
  for(int i=0;i<s.length();i++)//i=11; 11<11 true
  {
    if(s[i] == ')')
    {
      char t = top();
      pop();
      int flag = 1;//0
      while(t != '(')
      {
        if(t=='+' || t=='-' || t=='*' || t=='/')
          flag = 0;
        t = top();
        pop();
      }
      if(flag == 1)
        return 1;
    }
    else
      append(s[i]);
  }
  return 0;
}
int main() 
{
  string s;
  cin>>s;//((a+b))
  if(checkParanthesis(s) == 1)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}
