#include<iostream>
using namespace std;
class timeq{
public:
	int h,m,s;

	timeq(){
		h = 0;
		m = 0;
		s = 0;
	}
	/*void ip(){
		cout<<"Enter the hours:";
		cin>>h;
		cout<<"Enter the minutes:";
		cin>>m;
		cout<<"Enter the seconds:";
		cin>>s;
	*/
	timeq(int hh, int mm, int ss){
		h = hh;
		m = mm;
		s = ss;
	}
	
	void op(){
		cout<<"The Entered time is: "<<h<<":"<<m<<":"<<s<<endl;

	}
};

int main(){
	timeq a;
	
	a.op();
	timeq b(5, 10, 55);
	b.op();
	return 0;
}