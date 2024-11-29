import 'package:atividadedartmobile/gerenciamento_carros/motor.dart';

class Veiculo{

  String marca = "";
  String modelo = "";
  bool liga = false, desliga = false;
  Motor _motor = Motor();

  get motor{
    return _motor;
  }

  void motor_configurar(int potencia, String tipo){
    _motor.potencia = potencia;
    _motor.tipo = tipo;
  }
  

  bool ligar(){
    if(!this.desliga){

    print("O carro está ligando");
    this.liga = true;

    return true;
    } else{
      return false;
    }
  }

  bool desligar(){

    if(this.liga){

      print("Desligando o carro");
      this.desliga = true;
      this.liga = false;

      return true;

    } else{

      print("O carro já está desligado");
      return false;

    }
  }

  @override
  toString(){

  return ("Marca: $marca; Modelo: $modelo; $Motor; $_motor");
  }

}