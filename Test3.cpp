// Test3.cpp
#include <iostream>
using namespace std;

class Tree
{
public:
	int height = 0;
	void grow(int height) {
		cout << "height: " << height << endl;
		cout << "this->height: " << this->height << endl;
		this->height += height;
		cout << "after grow.." << endl;
		cout << "this->height: " << this->height << endl;
	}
};

int main()
{
	Tree t;
	t.grow(1);
	return 0;
}