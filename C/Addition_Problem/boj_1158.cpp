#include <iostream>
#include <queue>
using namespace std;

int main(void) {
    int n,k;
    queue<int> arr;
    cin>>n>>k;

    for (int i = 1; i <= n; i++) {
        arr.push(i);
        // cout << "i am " <<arr.back()<<'\n';
    }

    cout << '<';
    for(int i = 0; i < n; i++) {
        // cout << "------------->start<------------\n";
        for(int j = 0; j < k; j++) {
            // cout << "push val is "<< arr.front() <<'\n';
            if(j != k-1) {
                arr.push(arr.front());
            } else {
                if(i != n-1) {
                    cout << arr.front() << ", ";
                } else {
                    cout << arr.front() << ">\n";
                }
            }

            arr.pop();

            // cout << "current front val is "<< arr.front() << '\n';
        }

        // cout <<"-------------->end<----------------\n";
    }

 

    return 0;
}