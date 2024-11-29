import 'dart:io';

void main(){

  print("Digite uma temperatura em Fahrenheit");
  int tf = int.parse(stdin.readLineSync()!);

  double celso = ((5*(tf-32)) / 9);

  print("Temperatura em celsius = $celso");

}