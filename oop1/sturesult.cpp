#include<iostream>
#include<string>
using namespace std;
class stu{
public:
	string name,rno,branch,sem,age,gender;

	/*void ip(){
		cout<<"Enter Name: ";
		cin>>name;
		cout<<"Enter Reg no.: ";
		cin>>rno;
		cout<<"Enter Age: ";
		cin>>name;
		cout<<"Enter Name: ";
		cin>>name;
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
	}*/
};
class result : public stu{
	int tm,per;
	char grade;
	public:
		void ip(){
		cout<<"Enter Name: ";
		cin>>name;
		cout<<"Enter Reg no.: ";
		cin>>rno;
		cout<<"Enter Age: ";
		cin>>name;
		cout<<"Enter Name: ";
		cin>>name;
		cout<<"Enter branch: ";
		cin>>branch;
		cout<<"Enter semester: ";
		cin>>sem;
		cout<<"Enter total marks: ";
		cin>>tm;
		cout<<"Enter percentage: ";
		cin>>per;
		cout<<"Enter Grade: ";
		cin>>grade;
	}
	void op(){
		cout<<"Student Details: "<<endl;
		cout<<"Name: "<<name<<endl;
		cout<<"Reg. no.: "<<rno<<endl;
		cout<<"Branch: "<<branch<<endl;
		cout<<"Semster : "<<sem<<endl;
		cout<<"Total marks :"<<tm<<endl;
		cout<<"Percentage: "<<per<<endl;
		cout<<"Grade: "<<grade<<endl;
	}
};
	int main(){
		result a;
		a.ip();
		a.ip();
		return 0;
	}
	


