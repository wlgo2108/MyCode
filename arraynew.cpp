/*************************************************************************
	> File Name: arraynew.cpp
	> Author: 
	> Mail: 
	> Created Time: 四 11/17 01:13:49 2016
 ************************************************************************/

#include<iostream>
using namespace std;
int main()
{
    double * p3 = new double[3] ;
    p3[0] = 0.2 ;
    p3[1] = 0.5 ;
    p3[2] = 0.8 ;

    cout << "p3[1] is " << p3[1] << endl ;
    p3 = p3 + 1 ;
    cout << "Now p3[0] is " << p3[0] << endl ;
    cout << " p3[1] is " << p3[1] << endl ;
    p3 = p3 - 1 ;
    delete [] p3 ;
    return 0 ;
}
