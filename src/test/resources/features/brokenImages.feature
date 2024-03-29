#language:pt

  @imagem_quebrada
  Funcionalidade: Imagem Quebrada

    Contexto:
      Dado que esteja na pagina inicial
      Quando clicar no link Broken Images

    @imagem1
    Cenario: Validar a primeira imagem do site herokuapp
      Entao verifico se a primeira imagem esta quebrada

    @imagem2
    Cenario: Validar a segunda imagem do site herokuapp
      Entao verifico que a segunda imagem esta quebrada

    @imagem3
    Cenario: Validar a terceira imagem do site herokuapp
      Entao verifico que a terceira imagem esta disponivel