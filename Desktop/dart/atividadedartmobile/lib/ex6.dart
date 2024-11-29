import 'dart:io';

int pot(int a, int b){

  int poten = 1;

  if(b == 0){
    return 1;
  }

  for(int i = 0; i < b; i++){
    poten *= a;

  }
  return poten;
}

main(){
  print("digite um número;"); 
  int a = int.parse(stdin.readLineSync()!);
  print("Digite ao que ele será elevado: ");
  int b = int.parse(stdin.readLineSync()!);

  print(pot(a, b));
  
}

