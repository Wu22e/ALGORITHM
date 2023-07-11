#include <iostream>
#include <stack>
#include <string>
using namespace std;


int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    
    stack<int> stk;
    string s;
    int n;
    int arr = 0;

    cin >> n;

    while (n--) {
        int input_num;
        cin >> input_num;
        if(input_num > arr) {
            while (input_num > arr) {
                stk.push(++arr);
                s += '+';
            }
            stk.pop();
            s += '-';
        } else {
            bool found = false;
            if(!s.empty()) {
                int top = stk.top();
                stk.pop();
                s += '-';
                if (input_num == top) {
                    found = true;
                }
            }
            if (!found) {
                cout << "NO" <<'\n';
                return 0;
            }
        }
    }

    for (char c : s) {
        cout << c << '\n';
    }
    return 0;
}