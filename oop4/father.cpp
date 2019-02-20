#include<bits/stdc++.h>
using namespace std;

class father{
protected : int age;
public:
	father(){ }
	father (int x) {age = x;}
	virtual void iam( )
	{ cout << "I am the father, my age is :"<<age<<endl;}
};

class son : public father{
public :
	son (int y) {age = y;}
	void iam( )
	{ cout << "I am the son, my age is :"<<age<<endl;}
};

class daughter : public father{
public :
	daughter (int z) {age = z;}
	void iam( )
	{ cout << "I am the daughter, my age is :"<<age<<endl;}
};

int main(){
	father *p;
	father f(40);
	p = &f;
	p-> iam();
	
	son s(20);
	p = &s;
	p-> iam();
	
	daughter d(10);
	p = &d;
	p -> iam();
	return 0;
}