# Chatter - Middleware

Este projeto, desenvolvido na disciplina de Sistemas Distribuídos, implementa um chat em tempo real que conecta um **cliente Web** a um **cliente Desktop** utilizando **middleware em Java com RMI (Remote Method Invocation)**.

Este repositório contém exclusivamente o código do **middleware**.

  - **Cliente Web**: [link para o repositório](https://github.com/KemilyRezende/Chatter)
  - **Cliente Desktop**: [link para o repositório](https://github.com/KemilyRezende/Chatter-Middleware)

## Sobre o Middleware

O **Middleware** do Chatter é responsável por intermediar a comunicação entre os clientes **Web** e **Desktop**, garantindo a troca de mensagens em tempo real. Ele utiliza **Java RMI (Remote Method Invocation)** para permitir que os clientes interajam remotamente com os serviços de chat.

Principais Responsabilidades

  - Gerenciar o envio e recebimento de mensagens entre os clientes.
  - Manter a comunicação entre o cliente Web e o cliente Desktop.
  - Fornecer interfaces remotas para o acesso aos serviços de chat.

## Estrutura de Arquivos do Middleware

A estrutura do Middleware está organizada em duas partes principais:

### Interfaces RMI

As interfaces definem os métodos que podem ser chamados remotamente pelos clientes Web e Desktop.

  - **`rmiDesktopInterface.java`** – Define os métodos acessíveis pelo cliente **Desktop** para envio e recebimento de mensagens.
  - **`rmiWebInterface.java`** – Define os métodos acessíveis pelo cliente **Web** para comunicação com o middleware.

### Implementação dos Servidores

Os arquivos abaixo contêm a lógica de execução do **middleware** e a implementação dos serviços **RMI**.

  - **`rmiDesktopImpl.java`** – Implementa a interface `rmiDesktopInterface.java`, gerenciando a comunicação com os clientes **Desktop**.
  - **`rmiWebImpl.java`** – Implementa a interface `rmiWebInterface.java`, permitindo a comunicação com os clientes **Web**.
  - **`ControlPanel.java`** – Interface de controle do servidor, permitindo monitoramento e administração do middleware.

## Integração com os Clientes

  1. O cliente **Desktop** se comunica com o middleware chamando os métodos disponíveis em `rmiDesktopInterface.java`.
  2. O cliente **Web** interage com o middleware através da `rmiWebInterface.java`.
  3.  O **middleware** recebe as mensagens, processa e encaminha para os respectivos clientes conectados.

## Visualização

<p align="center">
  <img src="https://github.com/KemilyRezende/Chatter-Middleware/blob/main/tela/tela.png" alt="Painel de Controle">
</p>
<p align="center"><em>Painel de controle</em></p>

## Como executar

Antes de iniciar, certifique-se de ter instalado:
  - **Java 8** ou superior.
  - **Maven**

### Passos para executar


1. Clone esse repositório e acesse a pasta:
  ```bash
    git clone https://github.com/KemilyRezende/Chatter-Cliente-Desktop.git
    cd Chatter-Middleware/chat_server
  ```

2. Compile e empacote o projeto:
  ```bash
    mvn clean compile
    mvn package
  ```

3. Execute o projeto
  ```bash
    java -jar target/chat_server-1.0-SNAPSHOT.jar 
  ```

### Configurações Importantes

- Os servidores **Web** e **Desktop** são iniciados em **localhost** nas portas 7777 e 7775, respectivamente. Caso seja necessário alterar as portas, modifique o arquivo `ControlPanel.java`.
- O armazenamento das mensagens é feito localmente em um arquivo de texto dentro da pasta dados, localizada no diretório home do usuário. Se desejar mudar o local de armazenamento, edite o caminho do arquivo no código-fonte (`rmiDesktopImpl.java` e `rmiWebImpl.java`).

