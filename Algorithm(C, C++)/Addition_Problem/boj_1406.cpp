#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main(void) {

    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    string s;
    getline(cin, s);

    stack<char> left, right;
    for (int i = 0; i < s.size(); i++) {
        left.push(s[i]);
    }

    int n;
    cin >> n;
    cin.ignore();
    while(n--) {
        string cmd;
        getline(cin, cmd);
        if(cmd[0] == 'L') {
            if(!left.empty()) {
                right.push(left.top());
                left.pop();
            }
        } else if (cmd[0] == 'D') {
            if(!right.empty()) {
                left.push(right.top());
                right.pop();
            }
        } else if (cmd[0] == 'B') {
            if(!left.empty()) {
                left.pop();
            }
        } else if (cmd[0] == 'P') {
            left.push(cmd[2]);
        }
    }

    while(!left.empty()) {
        right.push(left.top());
        left.pop();
    }
        
    while(!right.empty()) {
        cout << right.top();
        right.pop();
    }

    return 0;
}