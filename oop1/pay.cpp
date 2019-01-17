#include<iostream>
using namespace std;
int main(){
	float bp, da, hra, gp;
	cout<<"Enter the basic pay: ";
	cin>>bp;
	da = 0.4*bp;
	hra = 0.2*bp;
	gp = bp + da +hra;
	cout<<"The Gross Pay is: "<<gp<<endl;
	return 0;
}