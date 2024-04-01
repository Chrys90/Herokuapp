#language:pt

  @checkbox
  Funcionalidade: Clicar checkbox

    @checkbox_marcado
    Cenario: Realizar clique no checkbox
      Dado que esteja no herokuapp no link Checkboxes
      Quando clicar em checkbox1
      Entao devera ser exibido o checkbox marcado

    @checkbox_desmarcado
    Cenario:Desmarcar checkbox
      Dado que esteja na pagina com checkbox marcado
      Quando clicar em checkbox1
      Entao devera ser exibido o checkbox desmarcado