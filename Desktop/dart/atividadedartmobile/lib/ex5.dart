double somaLista(List<int> lista){
  int soma = 0;

  for(int i = 0; i < lista.length; i++){
    soma+= lista[i];
  }

  return soma / lista.length;
}

main(){


  List<int> lista = [1,5,4,36,4];
  print("A média dos números da lista é: ${somaLista(lista)}");

}