import 'veiculo.dart';

void main(){
  Veiculo carro1 = new Veiculo();

  carro1.marca = "Volkswagen";
  carro1.modelo = "Fusca";
  carro1.motor_configurar(1000, "V12");

  carro1.desligar();
  carro1.ligar();

  print(carro1);
}