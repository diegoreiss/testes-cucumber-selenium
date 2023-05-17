#language:pt
Funcionalidade: Cadastrar Perfil

  Contexto: Dado que o usuário esta na modal Cadastrar Perfil

  Cenário: Cadastrar Perfil com os campos obrigatorios
    Dado que o usuário preencheu o campo Nome
    Quando clicar no botão salvar
    Então o Perfil deve ser cadastrado no banco de dados
    E Deve apresentar uma mensagem de feedback dizendo Perfil salvo com sucesso!

  Cenário: Cadastrar Perfil com todos os campos
    Dado que o usuário preencheu os campos Nome e Descrição
    Quando clicar no botão salvar
    Então o Perfil deve ser cadastrado no Banco de dados
    E Deve apresentar uma mensagem de feedbak dizendo Perfil salvo com sucesso!

  Cenário: O campo nome deve ter ao menos 3 caracteres
    Dado que usuário preencheu o campo Nome com <campo>  caracteres
    Quando clicar no botão salvar
    Entao deve apresentar a mensagem de feedback informando que <campo>


