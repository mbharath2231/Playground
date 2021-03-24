#include<iostream>
using namespace std;
class Amount
{
  public:
  int a;
  int b;
};
int main()
{
	Amount x;
  cin>>x.a>>x.b;
  cout<<x.a+x.b;
	return 0;
}