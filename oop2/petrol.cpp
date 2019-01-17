#include<bits/stdc++.h>
using namespace std;
class liquid{
public:
	float sg;

};
class fuel{
public: 
	float rate;
	
};
class petrol: public liquid, public fuel{
public:
	void ip(){
		cout<<"Enter the specific gravity and rate of Petrol"<<endl;
		cin>>sg>>rate;
	}
	void disp(){
		cout<<"Specific Gravity:"<<sg<<endl<<"Rate:"<<rate<<endl;
	}
};
int main(){
	petrol p;
	p.ip();
	p.disp();
}