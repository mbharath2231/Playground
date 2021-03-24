#include <iostream>
using namespace std;
class Node
{
  public:
	float data;
  	Node *left,*right;
}*root = NULL;
void append(float val)
{
  Node *temp = root;
  Node *newnode = new Node();
  newnode->left = NULL;
  newnode->data = val;
  newnode->right = NULL;
  if(root == NULL)
    root = newnode;
  else
  {
    while(1)
    {
      if(val < temp->data)
      {
        if(temp->left == NULL)
        {
          temp->left = newnode;
          break;
        }
        else
          temp = temp->left;
      }
      else
      {
        if(temp->right == NULL)
        {
          temp->right = newnode;
          break;
        }
        else
          temp = temp->right;
      }  
    }
  }
}
void display(Node *root)
{
  if(root!=NULL)
  {
    display(root->left);
    cout<<root->data<<" ";
    display(root->right);
  }
}
int main() 
{
  float value;
  while(1)
  {
    cin>>value;//6 3 2 1 4 7 8 6 4
    if(value>0)
      append(value);
    else
      break;
  }
  cout<<"Tree values are:"<<endl;
  display(root);
    return 0;
}
