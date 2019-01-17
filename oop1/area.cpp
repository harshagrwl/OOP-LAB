#include<iostream>
using namespace std;

	class circle{
		float radius;
		float area;
	public:
		void getarea(){
			cout<<"Enter radius";
			cin>>radius;
		
			area = 3.14196*radius;
			cout<<"The area is: "<<area;
		}
	};
	class triangle{
		float b, h;
		float area;
	public:
		void getarea(){
			cout<<"Enter base and height";
			cin>>b>>h;
		
			area = b*h/2;
			cout<<"The area is: "<<area;
		}
	};
	class rect{
		float l,b;
		float area;
	public:
		void getarea(){
			cout<<"Enter length anf breadth";
			cin>>l>>b;
		
			area = l*b;
			cout<<"The area is: "<<area;
		}
	};

	int main(){
		int a;
		cout<<"Enter Your Choice: 1. Circle 2.Triangle 3.Rectangle ";
		cin>>a;
		switch(a){
			case 1:
			circle a;
			a.getarea();
			break;

			case 2:
			triangle b;
			b.getarea();
			break;

			case 3:
			rect c;
			c.getarea();
			break;
		}

	}

