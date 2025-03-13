# Chatter - Middleware

Este projeto, desenvolvido na disciplina de Sistemas Distribuídos, implementa um chat em tempo real que conecta um **cliente Web** a um **cliente Desktop** utilizando **middleware em Java com RMI (Remote Method Invocation)**.

Este repositório contém exclusivamente o código do **middleware**.

  - **Cliente Web**: [link para o repositório](https://github.com/KemilyRezende/Chatter)
  - **Cliente Desktop**: [link para o repositório](https://github.com/KemilyRezende/Chatter-Middleware)


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

#### Observações

