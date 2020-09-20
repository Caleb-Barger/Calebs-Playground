#include<iostream>

using namespace std;

struct Date {
	int y;
	int m;
	int d;
};

void print_date(Date& dd) {
	cout << dd.y << " " << dd.m << " " << dd.d;
}

void init_date(Date& dd, int y, int m, int d) {
	dd.y = y;
	dd.m = m;
	dd.d = d;
}

int main() {
	Date today;
	init_date(today, 2020, 9, 20);
	print_date(today);
}


