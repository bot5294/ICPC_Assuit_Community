#include <bits/stdc++.h>
using namespace std;
#define ull unsigned long long
#define ll long long
#define dd long double
#define p2(n) (n)*(n)
#define p(n,os) pow(n,os)
#define REP(i,a,b) for (int i = a; i < b; i++)
#define PINF LONG_LONG_MAX
#define NINF LONG_LONG_MIN
#define Num_of_Digits(n) ((int)log10(n) + 1)
#define sz(x) ll(x.size())
#define endl '\n'
#define nom(c) ((int)((c)-'0'))
#define fsmal(c) (((int)(c))-32)
#define let(n) ((char)((n)+'0'))
#define fcap(n) (int)(((n)+32))
#define fix(x) cout<<fixed<<setprecision(x)
#define pr(a,b) pair<a,b>
#define pb push_back
#define mp make_pair
#define F first
#define S second
#define vect(n) vector<n>
#define veci vector<int>
#define vecll vector<ll>
#define vecdd vector<dd>
#define vec_2d(type,name,n,m) vector<vect(typee)> name(n,vect(typee)(m));
#define cin(vec) for(auto& i : vec) cin >> i;
#define cout(vec) for(auto& i : vec) cout << i << ' '; cout << \n;
#define copv(vec) copy(vec.begin(),vec.end(),ostream_iterator<int>(cout,' '));cout<<endl;
#define copa(arr,n) copy(arr,arr+n,ostream_iterator<int>(cout,' '));cout<<endl;
#define cin_2d(vec) for(auto &r:vec)for(auto &c:r) cin>>c;
#define cout_2d(vec) for(auto &r:vec){for(auto &c:r)cout<<c<<' ';cout<<endl;}
#define PI acos(-1)
#define hole(s) (s).begin(),(s).end()
#define ltor(s,l,r) (s).begin()+l,(s).begin()+r
#define apps ll t;cin>>t;while(t--){app();cout<<endl;}
#define Aqib ios_base::sync_with_stdio(false); cin.tie(nullptr); cout.tie(nullptr);
ll fact(ll n){if(n==1)return n;else return n*fact(n-1);}
bool istPrime(ll n){if(n==2)return 1;if(n<2||n%2==0)return 0;for(ll i=3;i*i<=n;i+=2){if(n%i==0)return 0;}return 1;}
ll gcd(ll x,ll y){if(x==0||y==0)return max(x,y);return gcd(max(x,y)%min(x,y),min(x,y));}
ll lcm(ll x,ll y){return (x*y)/gcd(x,y);}
ll fastpow(ll x,ll n){ll result = 1;while(n>0){if(n%2==1)result=result*x;x=x*x;n/=2;}return result;}
ll modfastpow(ll x,ll n,ll m){ll result = 1;while(n>0){if(n%2==1)result=(result*x)%m;x=(x*x)%m;n/=2;}return result;}
dd log_a_to_base_b(dd a, dd b){return log(a) / log(b);}
bool comparesort(pair<ll,ll> a,pair<ll,ll> b){if(a.first<b.first)return a.first>b.first;else return b.first<a.first;}
bool isTriangle(dd a,dd b,dd c){if(a+b>c&&a+c>b&&c+b>a)return true;return false;}
bool isRightbycoordinates(dd x1,dd y1,dd x2,dd y2,dd x3,dd y3){dd a1=p(abs(x2-x1),2)+p(abs(y2-y1),2),a2=(p(abs(x2-x3),2)+p(abs(y2-y3),2)),a3=(p(abs(x3-x1),2)+p(abs(y3-y1),2));if(a1==0||a2==0||a3==0)return false;if( max({a1,a2,a3}) ==  min({a1,a2,a3}) +  ((a1+a2+a3)-(max({a1,a2,a3})+min({a1,a2,a3})) ))return true;return false;}
//app
void app(ll a,ll b){
    cout << gcd(a,b)<<" ";
    cout<< lcm(a,b);
}
main(){
    Aqib;
    fix(0);
    ll a;
    ll b;
    cin >> a >> b;
    app(a,b);
    return 0;
}