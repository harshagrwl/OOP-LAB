#include<iostream>
using namespace std;
class cno{
	float r,i;
public:
	void ip(){
		cout<<"Enter the real and imaginary parts: ";
		cin>>r>>i;
	}
	void op(){
		cout<<"The no. is: "<<r<<"+ i"<<i<<endl;
	}
	void operator ++(){
		r = r+1;
	}
	void operator --(){
		r = r-1;
	}
};
int main(){
	cno p;
	p.ip();
	p.op();
	cout<<"After increment: ";
	++p;
	p.op();
	cout<<"After decrrement: ";
	--p;
	p.op();
	return 0;
}