#include <iostream>
#include <deque>
#include <string>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    string cmd;
    deque<int> deque;
    int n, pushNum;
    cin >> n;
    while(n--) {
        cin >> cmd;
        if (cmd == "push_front") {
            cin >> pushNum;
            deque.push_front(pushNum);
        } else if (cmd == "push_back") {
            cin >> pushNum;
            deque.push_back(pushNum);   
        } else if (cmd == "pop_front") {
            if(deque.empty()) {
                cout << -1 << '\n';
            } else {
                cout << deque.front() << '\n';
                deque.pop_front();
            }
        } else if (cmd == "pop_back") {
            if(deque.empty()) {
                cout << -1 << '\n';
            } else {
                cout << deque.back() << '\n';
                deque.pop_back();
            }
        } else if (cmd == "size") {
            cout << deque.size() << '\n';
        } else if (cmd == "empty") {
            if(deque.empty()) {
                cout << 1 << '\n';
            } else {
                cout << 0 << '\n';
            }
        } else if (cmd == "front") {
            if(deque.empty()) {
                cout << -1 << '\n';
            } else {
                cout << deque.front() << '\n';
            }
        } else if (cmd == "back") {
            if(deque.empty()) {
                cout << -1 << '\n';
            } else {
                cout << deque.back() << '\n';
            }
        }
    }

    return 0;
}