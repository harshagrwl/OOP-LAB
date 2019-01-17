#include<iostream>

using namespace std;

int main(){
	float f,c;
	cout<<"Enter the temp in Fahrenheit: ";
	cin>>f;
	c = 5*(f - 32)/9;
	cout<<"The temperature in celsius is: "<<c<<endl;
	return 0;
}