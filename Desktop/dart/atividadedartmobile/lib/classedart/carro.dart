class Carro{

  String? modelo = "";
  String? marca = "";
  int? ano = 0;

  Carro();


  Carro.segundo(String modelo, String marca, int ano){
    this.ano = ano;
    this.marca = marca;
    this.modelo = modelo;
  }

  @override
  String toString(){
    return ("Classe Carro - modelo: $modelo; marca: $marca; Ano: $ano;");
  }

}

void main(){
  Carro carro = new Carro();

  carro.ano = 1994;
  carro.modelo = "Super";
  carro.marca = "ferrari";

  print(carro.toString());

  Carro carro2 =  Carro.segundo("Sedan", "Fiat", 2005);

  print(carro2.toString());


}