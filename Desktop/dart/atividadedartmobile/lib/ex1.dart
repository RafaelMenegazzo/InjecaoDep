import 'dart:io';

void main(){


  final double pi = 3.14;

  print("Digite o valor do raio");
  int raio = int.parse(stdin.readLineSync()!);

  double area = (raio*raio) * pi;

  print("A área é $area");
}