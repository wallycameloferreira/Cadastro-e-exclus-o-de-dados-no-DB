# 📚 Minha Biblioteca — Estante Viva

Uma aplicação web de gerenciamento de livros desenvolvida com **Java + Spring Boot + PostgreSQL**, com uma interface HTML/CSS/JavaScript.

O projeto foi desenvolvido com o objetivo de praticar conceitos de desenvolvimento **backend, frontend, APIs REST, persistência de dados e integração com banco de dados**.

## Atenção
## ⚠️ Configuração do banco de dados

Este projeto utiliza um banco de dados PostgreSQL executado localmente em um container Docker, com credenciais definidas exclusivamente para fins de desenvolvimento e testes.

As credenciais presentes na configuração local **não devem ser utilizadas em ambientes de produção** e não representam uma configuração adequada para cenários reais.

> **Importante:** credenciais, senhas, tokens ou quaisquer outros dados sensíveis não devem ser versionados em repositórios públicos. Em ambientes reais, recomenda-se utilizar variáveis de ambiente, secrets ou ferramentas específicas de gerenciamento de credenciais.


---

## 🚀 Funcionalidades

- 📖 Listar livros cadastrados
- ➕ Cadastrar novos livros
- 🗑️ Excluir livros
- 🔍 Filtrar livros por título, autor ou ano
- 📊 Exibir contador de livros
- 💻 Interface web responsiva
- 🔗 Comunicação entre frontend e backend através de API REST
- 🐘 Persistência dos dados no PostgreSQL
- 🐳 Banco de dados executado através do Docker

---

## 🛠️ Tecnologias utilizadas

### Backend

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven

### Banco de dados

- PostgreSQL
- Docker

### Frontend

- HTML5
- CSS3
- JavaScript
- Fetch API

---

## 🏗️ Arquitetura

O projeto utiliza uma organização em camadas:

```text
Frontend
   │
   │ HTTP / JSON
   ▼
Controller
   │
   ▼
Repository
   │
   ▼
PostgreSQL
````

### Estrutura do projeto

```text
biblioteca/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── exemplo/
│       │           └── biblioteca/
│       │               │
│       │               ├── BibliotecaApplication.java
│       │               │
│       │               ├── controller/
│       │               │   └── LivroController.java
│       │               │
│       │               ├── model/
│       │               │   └── Livro.java
│       │               │
│       │               └── repository/
│       │                   └── LivroRepository.java
│       │
│       └── resources/
│           ├── application.properties
│           └── static/
│               └── index.html
│
├── pom.xml
└── README.md
```

---

# 🔌 API REST

A aplicação disponibiliza os seguintes endpoints:

| Método | Endpoint           | Descrição             |
| ------ | ------------------ | --------------------- |
| GET    | `/api/livros`      | Lista todos os livros |
| POST   | `/api/livros`      | Cadastra um livro     |
| DELETE | `/api/livros/{id}` | Exclui um livro       |

---

## 📥 Cadastro de livro

### Request

```http
POST /api/livros
Content-Type: application/json
```

### Body

```json
{
  "titulo": "Dom Casmurro",
  "autor": "Machado de Assis",
  "ano": 1899
}
```

### Response

```json
{
  "id": 1,
  "titulo": "Dom Casmurro",
  "autor": "Machado de Assis",
  "ano": 1899
}
```

---

## 📖 Listagem de livros

### Request

```http
GET /api/livros
```

### Response

```json
[
  {
    "id": 1,
    "titulo": "Dom Casmurro",
    "autor": "Machado de Assis",
    "ano": 1899
  }
]
```

---

## 🗑️ Exclusão de livro

### Request

```http
DELETE /api/livros/1
```

O livro correspondente ao ID informado será removido do banco de dados.

---

# 🗄️ Banco de dados

O projeto utiliza PostgreSQL.

### Banco

```text
dsadb
```

### Tabela

```text
livros
```

### Estrutura

| Campo  | Tipo         | Descrição           |
| ------ | ------------ | ------------------- |
| id     | SERIAL       | Identificador único |
| titulo | VARCHAR(200) | Título do livro     |
| autor  | VARCHAR(200) | Autor do livro      |
| ano    | INTEGER      | Ano de publicação   |

---

# 🐳 PostgreSQL com Docker

O PostgreSQL pode ser executado através do Docker.

Exemplo:

```bash
docker run --name dbdsa \
  -e POSTGRES_USER=dsa \
  -e POSTGRES_PASSWORD=dsa1010 \
  -e POSTGRES_DB=dsadb \
  -p 5434:5432 \
  -d postgres:17.5
```

Verificar o container:

```bash
docker ps
```

---

# ⚙️ Configuração

No arquivo:

```text
src/main/resources/application.properties
```

configure a conexão com o PostgreSQL:

```properties
spring.application.name=biblioteca

spring.datasource.url=jdbc:postgresql://localhost:5434/dsadb
spring.datasource.username=dsa
spring.datasource.password=dsa1010
```

> ⚠️ Por segurança, não publique senhas reais no GitHub. Em um projeto real, utilize variáveis de ambiente ou outro mecanismo de gerenciamento de credenciais.

---

# ▶️ Como executar o projeto

## 1. Clonar o repositório

```bash
git clone URL_DO_SEU_REPOSITORIO
```

Entre na pasta:

```bash
cd biblioteca
```

---

## 2. Iniciar o PostgreSQL

Com Docker:

```bash
docker start dbdsa
```

Ou crie um novo container utilizando a configuração apresentada anteriormente.

---

## 3. Criar a tabela

Execute no PostgreSQL:

```sql
CREATE TABLE livros (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(200),
    autor VARCHAR(200),
    ano INTEGER
);
```

---

## 4. Executar o Spring Boot

Pelo IntelliJ:

```text
BibliotecaApplication
```

Ou pelo Maven:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## 5. Acessar a aplicação

Abra no navegador:

```text
http://localhost:8080
```

---

# 🖥️ Interface

A aplicação possui duas telas principais:

### Cadastro

Permite cadastrar:

* Título
* Autor
* Ano de publicação

### Acervo

Permite:

* Visualizar os livros
* Filtrar por título
* Filtrar por autor
* Filtrar por ano
* Excluir livros

---

# 📚 Conceitos praticados

Durante o desenvolvimento foram praticados conceitos importantes de desenvolvimento web:

* Orientação a objetos com Java
* Spring Boot
* Injeção de dependências
* Controllers REST
* HTTP
* JSON
* CRUD
* Spring Data JPA
* Hibernate
* PostgreSQL
* Docker
* HTML
* CSS
* JavaScript
* Fetch API
* Integração entre frontend e backend
* Persistência de dados

---

# 🔄 Fluxo da aplicação

Exemplo de cadastro:

```text
Usuário
   │
   │ preenche formulário
   ▼
index.html
   │
   │ POST /api/livros
   │ JSON
   ▼
LivroController
   │
   ▼
LivroRepository
   │
   ▼
Hibernate / JPA
   │
   ▼
PostgreSQL
```

Para consulta:

```text
PostgreSQL
    │
    ▼
Repository
    │
    ▼
Controller
    │
    │ JSON
    ▼
JavaScript
    │
    ▼
Interface HTML
```

---

# 🎯 Próximos passos

Algumas melhorias planejadas para versões futuras:

* [ ] Implementar edição de livros
* [ ] Completar o CRUD com `PUT`
* [ ] Criar camada `Service`
* [ ] Implementar DTOs
* [ ] Adicionar validação dos dados
* [ ] Melhorar tratamento de exceções
* [ ] Criar testes unitários
* [ ] Criar testes de integração
* [ ] Adicionar documentação com Swagger/OpenAPI
* [ ] Utilizar variáveis de ambiente para configuração
* [ ] Criar `docker-compose.yml`
* [ ] Criar pipeline de CI/CD

---

# 👨‍💻 Sobre o projeto

Este projeto foi desenvolvido como parte do meu aprendizado em **Java e Spring Boot**, com foco na construção de uma aplicação full-stack simples e na compreensão da comunicação entre frontend, backend e banco de dados.

O objetivo principal foi entender na prática como uma aplicação Java pode disponibilizar uma API REST, persistir informações utilizando JPA/Hibernate e disponibilizar uma interface web para o usuário.

---

## 📄 Licença

Este projeto está disponível para fins de estudo e portfólio.


**O banco subiu com usuario e senha por e um banco de tester no docker e funciona somente na minha maquina. Em cenarios reais jamais suba as credenciais para o repositorio**

