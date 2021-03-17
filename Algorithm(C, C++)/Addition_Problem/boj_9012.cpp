#include <iostream>
// #include <stack>
#include <string>
using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int tc;
    cin >> tc;
    while(tc--) {
        string s;
        int stack = 0;
        cin >> s;
        for(char c : s) {
            if(c == '(') {
                stack++;
            }
            else if (c == ')') {
                stack--;
            }
            
            if( stack < 0) {
                cout <<"NO"<<'\n';
                break;
            }
            // cout<< "i am here \n";
        }
        if( stack == 0) {
            cout << "YES" <<'\n';
        } else if(stack > 0) {
            cout <<"NO"<<'\n';
        }
    }
    return 0;
}