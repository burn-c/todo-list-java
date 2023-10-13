<h1 align="center">
  🗒️ - TODO List API
</h1>

<h3 align="center">
API para aplicação de todo list para controlar suas tarefas.
</h3>
<h5 align="center">
  Feito com JAVA + Spring Boot
</h5>

<h3 align="center">
  <a href="https://todo-list-burndev.onrender.com/">🗒️ Teste a API aqui :)</a>
</h3>

<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/burn-c/ignite-todo?color=red">
  <img alt="License" src="https://img.shields.io/badge/licence-MIT-red">
   <a href="https://www.linkedin.com/in/carlosoliveiradev/">
    <img alt="Made by Carlos Oliveira" src="https://img.shields.io/badge/made%20by-carlos%20oliveira-red">
  </a>
  <a href="https://github.com/burn-c/goeat-api/stargazers">
    <img alt="Stargazers" src="https://img.shields.io/github/stars/burn-c/ignite-todo?style=social">
  </a>
</p>

<p align="center">
  <a href="#---instalar-e-executar">Instalar e executar</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-backend">Backend</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-telas">Telas</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#-tecnologias">Tecnologias</a>
</p>

<hr>

<h1 align="center">
  ⚙ Instalar e executar
</h1>


## 💻 Backend

1. Clonar repositório:

```sh
git clone https://github.com/burn-c/todo-list-java
```
### 🚧 Em construção 🥲

## 🪧 Rotas

### 😄 /users/

#### Criar usuário - POST
##### body

```json
{
	"name": "Fulano",
	"username": "fulano",
	"password": "12345"
}
```

### 🗒️ /tasks/
##### Headers - Basic Auth - Enviar em todas rotas
- username
- password

#### Criar task - POST
##### body
```json
{
	"description": "Desenvolver API com Spring boot para aplicação de todo list.",
	"title": "Desenvolver API todo list",
	"priority": "ALTA",
	"startAt": "2023-10-14T12:30:00",
	"endAt": "2023-10-14T12:40:00"
}
```

#### Atualizar task - PUT - `/tasks/:idTask`
##### body
```json
{
	"description": "Desenvolver API com Spring boot para aplicação de todo list.",
	"title": "Desenvolver API todo list",
	"priority": "ALTA",
	"startAt": "2023-10-14T12:30:00",
	"endAt": "2023-10-14T12:40:00"
}
```
*Obrigatório enviar pelo menos um campo.

#### Listar tasks do usuário - GET

## Validações nas rotas
### 🚧 Em construção 🥲


## 🖥️ Telas

### 🚧 Em construção 🥲

## 🛠 Tecnologias

O projeto foi desenvolvido com as seguintes tecnologias:

-  [JAVA 17](https://www.oracle.com/java/technologies/downloads/#java17)
-  [Spring Boot 3.1.4](https://spring.io/projects/spring-boot)
-  [Maven](https://projectlombok.org/setup/maven)
-  [Bcrypt Java Library and CLI Tool](https://github.com/patrickfav/bcrypt)
-  [H2 Database Engine](https://www.h2database.com/html/main.html)
-  [VS Code](https://code.visualstudio.com/)

---

Encontrou algum erro ? Tem alguma dica ? Enviei uma pull request! Ficarei feliz em receber! 😁

Made with 🔥 by Carlos Oliveira ( BurN  ) - [My linkedin!](https://www.linkedin.com/in/carlosoliveiradev/)