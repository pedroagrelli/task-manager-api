# 🚀 Task Manager API

API REST para gerenciamento de tarefas desenvolvida utilizando **Java** e **Spring Boot**, permitindo criar, listar, atualizar e remover tarefas.

Este projeto foi desenvolvido como prática de backend e fundamentos de APIs REST, banco de dados e arquitetura em camadas.

---

## 📌 Funcionalidades

✅ Criar tarefas
✅ Listar todas as tarefas
✅ Atualizar tarefas
✅ Remover tarefas
✅ Persistência em banco de dados

---

## 🛠️ Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database
* Gradle
* REST API
* Lombok

---

## 🏗️ Arquitetura do Projeto

O projeto segue uma arquitetura em camadas:

```
controller → recebe requisições HTTP
repository → comunicação com banco de dados
model → entidades do sistema
```

---

## ▶️ Como executar o projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/pedroagrelli/task-manager-api
```

### 2️⃣ Entrar na pasta

```bash
cd task-manager-api
```

### 3️⃣ Executar aplicação

No Windows:

```bash
gradlew bootRun
```

No Linux/Mac:

```bash
./gradlew bootRun
```

A aplicação iniciará em:

```
http://localhost:8080
```

---

## 🌐 Endpoints da API

### 📋 Listar tarefas

```
GET /tasks
```

### ➕ Criar tarefa

```
POST /tasks
```

Body:

```json
{
  "title": "Minha nova tarefa",
  "completed": false
}
```

---

### ✏️ Atualizar tarefa

```
PUT /tasks/{id}
```

---

### ❌ Deletar tarefa

```
DELETE /tasks/{id}
```

---

## 🗄️ Banco de Dados

O projeto utiliza o **H2 Database** em memória.

Console disponível em:

```
http://localhost:8080/h2-console
```

---

## 📷 Exemplo de resposta da API

```json
[
  {
    "id": 1,
    "title": "Primeira Task",
    "completed": false
  }
]
```

---

## 👨‍💻 Autor

**Pedro Agrelli**

🎓 Estudante de Ciência da Computação
💻 Desenvolvedor Backend em formação

* LinkedIn: https://www.linkedin.com/in/pedro-agrelli-28646a3b3/
* GitHub: https://github.com/pedroagrelli

---

## 🚀 Próximas melhorias

* Autenticação com Spring Security
* Banco PostgreSQL
* Deploy em Cloud (AWS)
* Dockerização da aplicação
* Testes automatizados

---
