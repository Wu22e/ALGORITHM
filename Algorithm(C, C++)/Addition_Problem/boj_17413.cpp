#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main(void) {

    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    string word;
    getline(cin, word);
    word += '\n';
    stack<char> stack;
    bool flag = false;

    for (char c : word) {
        if ((c == ' ' || c == '\n') && !flag) {
            while (!stack.empty()) {
                cout << stack.top();
                stack.pop();
            }
            cout << c;
        } else if (c == '<' || flag) {
            while (!stack.empty()) {
                cout << stack.top();
                stack.pop();
            }
            cout << c;
            flag = true;
        } else {
            stack.push(c);
        }

        if (c == '>') flag = false;
    }

    
    return 0;
}