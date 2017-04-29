/*************************************************************************
	> File Name: use_new.cpp
	> Author: 
	> Mail: 
	> Created Time: 四 11/17 01:06:38 2016
 ************************************************************************/

#include<iostream>
using namespace std;

int main()
{
    int nights = 1001 ;
    int *pt = new int ;
    *pt  = 1001 ;

    cout << "nights value = " ;
    cout << nights << ": location " << &nights << endl ;
    cout << "int " ;
    cout << "value = " << *pt << ": location = " << pt << endl ;
    double * pd = new double ;
    *pd = 100000001.0 ;

    cout << "double " ;
    cout << "value = " << *pd << " location  = " << pd << endl ;
    cout << "location of pointer pd :" << &pd << endl ;
    cout << "size of pt = " << sizeof(pt) ;
    cout << ": size of *pt = " << sizeof(*pt) << endl ;
    cout << "Size of pd = " << sizeof(pd) ;
    cout << ": size of *pd = " << sizeof(*pd) << endl ;

    return 0 ;
}
