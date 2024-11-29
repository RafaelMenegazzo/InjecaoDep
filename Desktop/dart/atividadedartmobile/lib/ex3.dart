import 'dart:io';

void main(){
  
double sal, aumento = 0, porcentagem = 0;

print("Digite o seu salário base");
sal = double.parse(stdin.readLineSync()!);

if(sal < 280.00){
    porcentagem = 0.20;
} 
else if(sal >= 280.00 && sal < 700.00){
    porcentagem = 0.15;
}
else if(sal >= 700.00 && sal < 1500.00){
    porcentagem = 0.10;
}
else if(sal >= 1500.00){
    porcentagem = 0.05;
}

aumento = sal * porcentagem;


print("------------\\------------");
print("Salário base = $sal");
print("Porcentagem aplicada = ${porcentagem * 100}%");
print("Aumento = ${sal * porcentagem}");
print("Novo salário = ${sal + aumento}");
print("------------\\------------");

}