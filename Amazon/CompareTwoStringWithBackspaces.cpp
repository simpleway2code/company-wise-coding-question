/*    String based problem - a key on keyboard was inserting # instead of backspace in the strings. Given two such erroneous strings check if they are equal or not.

Example : str1 - a#bc##dd str2 - b#dd. Both strings are equal as, the str1 -> dd as output after deleting every character that occurs before # similarly str2 -> dd.*/

#include <bits/stdc++.h>
using namespace std;
string processStr(string x){
    stack<char> s;
    string result="";
    for(char c:x){
        if(c=='#'){
            if(!s.empty())
                s.pop();
        }
        else{
            s.push(c);
        }
    }
    while(!s.empty()){
        result=s.top()+result;
        s.pop();
    }
    return result;
}
bool isEqual(string x,string y){
   
    return processStr(x)==processStr(y);
}



int main() {
    string a,b;
    cin>>a>>b;
    cout<<isEqual(a,b);
	return 0;
}
