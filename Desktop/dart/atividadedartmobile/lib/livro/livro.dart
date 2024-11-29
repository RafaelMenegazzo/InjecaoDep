class livro{

  String autor = "";
  String titulo = "";
  int pag = 0;


  @override
  String toString(){
    return "Nome do livro: $titulo; qtd páginas: $pag; Autor: $autor";
  }
}