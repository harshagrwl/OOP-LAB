#include<iostream>
#include<string>
using namespace std;
class stu{
	string name,rno,branch,sem;
public:
	void ip(){
		cout<<"Enter Name: ";
		cin>>name;
		cout<<"Enter Reg no.: ";
		cin>>rno;
		cout<<"Enter branch: ";
		cin>>branch;
		cout<<"Enter semester: ";
		cin>>sem;

	}
	void op(){
		cout<<"Student Details: "<<endl;
		cout<<"Name: "<<name<<endl;
		cout<<"Reg. no.: "<<rno<<endl;
		cout<<"Branch: "<<branch<<endl;
		cout<<"Semster : "<<sem<<endl;
	}
};
int main(){
	stu a;
	a.ip();
	a.op();
	return 0;
}