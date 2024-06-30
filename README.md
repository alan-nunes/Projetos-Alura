# Conversor de Moedas

Bem-vindo ao projeto Conversor de Moedas! Este projeto foi desenvolvido como parte de um desafio, com o objetivo de criar um conversor de moedas interativo via console.

## Descrição do Projeto

Neste projeto, você aprenderá a:
- Realizar requisições a uma API de taxas de câmbio.
- Manipular dados JSON.
- Filtrar e exibir moedas de interesse.

## Funcionalidades

O sistema oferece as seguintes opções de interação com o usuário:
1 - Dolar Americano USD para >>> Real BRL
2 - Real BRL para >>> Dolar Americano USD
3 - Dolar Americano USD para  >>> Peso Argentino ARS
4 - Peso Argentino ARS para >>> Dolar Americano USD
5 - Real BRL para >>> Peso Argentino USR
6 - Peso Argentino para >>> Real BRL

## Tecnologias Utilizadas

- Java
- Biblioteca para solicitações HTTP: HttpClient / OkHttp
- Biblioteca para manipulação de JSON: Jackson / Gson
- IDE: IntelliJ IDEA / Eclipse

## Estrutura do Projeto

1. **Configuração do Ambiente Java**
   - Instalação do JDK e configuração do ambiente de desenvolvimento.
   - Instalação de uma IDE de sua escolha.

2. **Criação do Projeto**
   - Estruturação do projeto Java.
   - Configuração do Maven/Gradle para gerenciar as dependências.

3. **Consumo da API**
   - Configuração da biblioteca para realizar solicitações HTTP.
   - Realização de requisições GET para a API de taxas de câmbio.
   - Tratamento de erros de rede e resposta.

4. **Análise da Resposta JSON**
   - Utilização de bibliotecas para deserializar JSON.
   - Mapeamento das respostas JSON para classes Java correspondentes.

5. **Filtro de Moedas**
   - Seleção e filtragem das moedas de interesse a partir da resposta JSON.

6. **Exibição de Resultados aos Usuários**
   - Criação de um menu de interação textual no console.
   - Implementação das opções de conversão de moedas.

## Gerenciamento Ágil com Trello

O desenvolvimento do projeto foi gerenciado utilizando o Trello:
- **Pronto para iniciar:** Tarefas ainda não desenvolvidas.
- **Desenvolvendo:** Tarefas em desenvolvimento.
- **Pausado:** Tarefas iniciadas, mas pausadas.
- **Concluído:** Tarefas finalizadas.

## Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/conversor-de-moedas.git
