#language:pt

  @addRemoveElements
  Funcionalidade: Validar pagina AddRemoveElements

    @addRemoveElementsSucesso
    Cenario: Validar botao de delete
      Dado eu estou na pagina inicial
      Quando clicar em Add Remove Elements
      E clicar em AddElement
      E clicar em Delete
      Entao o botao Delete deve ser removido