#include<bits/stdc++.h>
using namespace std;
class A{
public:
	int a, b, c;
	void ip(){
		cout<<"Enter value of a";
		cin>>a;
	}
};
class B: public A{
public:
	void ip2(){
		cout<<"Enter the value of b";
		cin>>b;
	}
};
class C: public B{
public:
	void ip3(){
		cout<<"Enter the value of c";
		cin>>c;
	}
	void disppro(){
		cout<<"The product of a, b and c is: "<<a*b*c<<endl;
	}
};
int main(){
	C test;
	test.ip();
	test.ip2();
	test.ip3();
	test.disppro();
}