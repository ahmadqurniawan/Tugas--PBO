#include <iostream>
#include <iomanip>
using namespace std;
int main(){
  cout << "##  Program C++ Input Matriks 2 Dimensi ##" << endl;
  cout << "==========================================" << endl;
  cout << endl;
  //variabel dan tipe data
  int matriks[100][100];
  int jum_baris, jum_kolom, i, j;
  int a=1;
  cout << "Input jumlah baris matriks: ";
  cin >> jum_baris;
  cout << "Input jumlah kolom matriks: ";
  cin >> jum_kolom;
  cout << endl;
  // proses input array
  for(i = 0; i < jum_baris ; i++){
    for(j = 0; j < jum_kolom; j++){
      cout << "Baris " <<i+1<<", kolom "<<j+1<< " = ";
      cin >> matriks[i][j];
    }
    cout << endl;
  }
  cout << "Hasil matriks: " << endl;
  // menampilkan array
  for(i = 0; i < jum_baris ; i++){
    for(j = 0; j < jum_kolom; j++){
      cout << setw(3) << matriks[i][j] << " ";
    }
    cout<<"\n\n";
  }
  cout<<"Hasil perulangan while dan do while"<<endl;
  //perulangan while
  while(a<1){
  	cout<<"Belajar bahasa java "<<a<<endl;
  	a++;
  }
  //perulangan do while
  do{
  	cout<<"Belajar bahasa java "<<a<<endl;
  	a++;
  } while(i<1);
  cout<<endl;
  // array 1 dimensi
  int angka[5]={70,72,71,82,90};
    int b;
    cout<<"Hasil array 1 dimensi"<<endl;
    for (b=0;b<5;b++){
    	cout <<"Cetak angka ke-"<<i+1<<" = "<<angka[i]<<endl;
    }
    cout<<endl;
    // percabangan if else
    cout<<"Hasil percabangan if else"<<endl;
    int nilai;
  cout << "Input Nilai Anda (0 - 100): ";
  cin >> nilai;
 
  if (nilai >= 90 ) {
    cout << "A" << endl;
  }
  else if (nilai >= 80 && nilai < 90) {
    cout << "B" << endl;
  }
  else if (nilai >= 60 && nilai < 80) {
    cout << "C" << endl;
  }
  else if (nilai >= 40 && nilai < 60) {
    cout << "D" << endl;;
  }
  else if (nilai < 40) {
    cout << "E" << endl;
  }
  else {
    cout << "Maaf, format nilai tidak sesuai" << endl;
  }
  return 0;
}
