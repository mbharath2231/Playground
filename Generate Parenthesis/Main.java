#include<iostream>
#include<vector>
using namespace std;
void solve(int ob,int cb,string s,vector<string> &v)
{
  if(ob==0&&cb==0)
  {
    v.push_back(s);
    return;
  }
  if(ob!=0)
  {
    string temp = s;
    temp.push_back('(');
    solve(ob-1,cb,temp,v);
  }
  if(cb>0)
  {
    string temp = s;
    temp.push_back(')');
    if(cb-1 >= ob)
    	solve(ob,cb-1,temp,v);
    else
      return;
  }
  return;
}
int main() 
{
  int n;//no of pairs
  cin>>n;
  string s="";
  vector<string> v;
  int ob=n,cb=n;
  solve(ob,cb,s,v);
  for(int i=0;i<v.size();i++)
    cout<<v[i]<<endl;
  return 0;
}