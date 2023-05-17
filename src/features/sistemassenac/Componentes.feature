#language:pt
Funcionalidade: Acessar vários componentes HTML

  Contexto:
    Dado que o usuário acessou o arquivo Campo de Treinamento

  @validar_campo_texfield_textarea
  Esquema do Cenário: Validar campo textfield e textarea
    Quando o usuário digitar <campo>
    Então no campo <componente> deve apresentar a palavra <resultado>
    Exemplos:
      | campo               | componente | resultado           |
      | Batatinha           | textfield  | Batatinha           |
      | Batatinha Batatinha | textarea   | Batatinha Batatinha |

  @validar_elemento_radio_button
  Cenário: Validar elemento Radio Button
    Quando o usuário clicar no elemento radio button
    Então o elemento radio button deve aparecer selecionado

  @validar_elemento_checkbox
  Cenário: Validar elemento checkbox
    Quando o usuário clicar no elemento checkbox
    Então o elemento checkbox deve aparecer selecionado

  @validar_elemento_radio_checkbox
  Esquema do Cenário: Validar campo radio e checkbox
    Quando o usuario clicar no elemento <elemento>
    Então o elemento <elemento> deve aparecer selecionado
    Exemplos:
      | elemento |
      | radio    |
      | checkbox |
