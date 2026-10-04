# Gerenciador de Tarefas

Projeto de estudo para praticar desenvolvimento back end com Java. A ideia é construir um sistema de tarefas com cadastro de usuários e CRUD completo, passo a passo, e documentar o que eu for aprendendo no caminho.

## Funcionalidades planejadas
- [ ] Cadastro de usuários
- [x] Criar, listar, editar e excluir tarefas (CRUD)
- [x] Status da tarefa (pendente, em andamento, concluída)
- [ ] Tarefas associadas a cada usuário
- [ ] Interface simples

## Tecnologias
- Java 21
- Spring Boot (Web, Data JPA, Validation)
- PostgreSQL
- Maven
- Git e GitHub

## Status
Em desenvolvimento. O CRUD de tarefas já funciona via API REST (POST, GET, PUT e DELETE em `/tarefas`), com validação do título e persistência no PostgreSQL. Próximos passos: usuários e interface.

## Como rodar
1. Ter Java 21 e PostgreSQL instalados e um banco chamado `gerenciador_tarefas`.
2. Criar o arquivo `src/main/resources/application-local.properties` com a linha `spring.datasource.password=SUA_SENHA`.
3. Rodar: `./mvnw spring-boot:run -Dspring-boot.run.profiles=local`
4. Testar: `curl localhost:8080/tarefas`

## Autor
Luiz Pedro (Nyxenn), estudante de Ciência da Computação.
