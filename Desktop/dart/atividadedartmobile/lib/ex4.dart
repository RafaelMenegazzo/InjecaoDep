import 'dart:io';

main(){
  
  final int tam = 10;
  int num;

  print("Digite o valor para mostrar sua tabuada");
  num = int.parse(stdin.readLineSync()!);

  for(int i = 0; i <= tam; i++){
    print("$num X $i = ${num * i}");

  }

}