# new feature
# language: pt

Funcionalidade:
  Eu, pretendente a vaga de automação
  Preciso construir cenários de teste automatizado
  Para validar meus conhecimentos

  Esquema do Cenário: Validar desafio 1
    Dado              que acessei a página de teste
    E                 mudei o valor da combo Select version
    E                 Cliquei no botão Add Customer
    E                 Preencho o campo name <Name>
    E                 Preencho o campo last name <Last name>
    E                 Preencho o campo contactfirstname <ContactFirstName>
    E                 Preencho o campo phone <Phone>
    E                 Preencho o campo address1 <AddressLine1>
    E                 Preencho o campo adrress2 <AddressLine2>
    E                 Preencho o campo city <City>
    E                 Preencho o campo state <State>
    E                 Preencho o campo postal code <PostalCode>
    E                 Preencho o campo country <Country>
    E                 Preencho o campo employeer <Employeer>
    E                 Preencho o campo creditlimit <CreditLimit>
    Quando            Clico no botão Save
    Entao             valido a mensagem e fecho o browser


    Exemplos:
      | Name            |Last name |ContactFirstName|Phone        |AddressLine1  |AddressLine2 |City        |State |PostalCode|Country|Employeer |CreditLimit |
      | Teste Stefanini |Teste@2018|Leandro         |51 9999-9999 |Av Bento, 6681|Teste address|Porto Alegre|RS    |91000-000 |Brasil |Fixter    | 200        |

    Cenário: Validar desafio 2
    Dado         que acessei a página do segundo teste
    E            obter o valor da url
    Quando       comparar os valores da url
    Entao        fecha a tela


