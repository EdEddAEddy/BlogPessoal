# Blog Pessoal API REST

## Visão Geral

Este é um projeto de API REST para um Blog Pessoal que permite aos usuários autenticados criar, editar, listar e excluir postagens e temas. Também oferece recursos para autenticação de usuários e geração de tokens JWT. Abaixo, estão os principais recursos e tecnologias utilizadas no projeto.

## Recursos

- Autenticação de Usuários
- Operações de Postagem:
  - Criar uma nova postagem
  - Editar uma postagem existente
  - Listar todas as postagens
  - Buscar postagens por título
  - Excluir uma postagem
- Operações de Tema:
  - Criar um novo tema
  - Editar um tema existente
  - Listar todos os temas
  - Buscar temas por descrição
  - Excluir um tema
- Autenticação e Autorização com JWT

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- JSON Web Tokens (JWT)
- Bcrypt para criptografia de senhas
- Swagger para documentação da API
- Docker para empacotamento da aplicação

## Como Usar

### Pré-requisitos

- Certifique-se de ter o Java 17 instalado na sua máquina.
- Configure um banco de dados PostgreSQL e atualize as informações de configuração no arquivo `application.properties`, se necessário.

### Instalação

1. Clone o repositório:

   ```shell
   git clone git@github.com:EdEddAEddy/BlogPessoal.git
   ```

### Uso
- Certifique-se de que o servidor está em execução.
- Use ferramentas como o Postman ou faça solicitações HTTP para a API nos endpoints correspondentes.
- Consulte a documentação da API (Swagger) para obter detalhes sobre como usar cada recurso, acessando https://blogpessoal-d11u.onrender.com/. **USUARIO: root@root.com** **SENHA: rootroot**

## Endpoints da API
### Autenticação de Usuário
- **POST /usuarios/logar**: Realiza o login do usuário com base nas credenciais fornecidas.
- **POST /usuarios/cadastrar**: Cria um novo usuário no sistema.

### Operações de Postagem
- **GET /postagens**: Lista todas as postagens disponíveis.
- **GET /postagens/{id}**: Obtém detalhes de uma postagem específica.
- **GET /postagens/titulo/{titulo}**: Busca postagens por título.
- **POST /postagens**: Cria uma nova postagem.
- **PUT /postagens**: Edita uma postagem existente.
- **DELETE /postagens/{id}**: Exclui uma postagem.
### Operações de Tema
- **GET /temas**: Lista todos os temas disponíveis.
- **GET /temas/{id}**: Obtém detalhes de um tema específico.
- **GET /temas/descricao/{descricao}**: Busca temas por descrição.
- **POST /temas**: Cria um novo tema.
- **PUT /temas**: Edita um tema existente.
- **DELETE /temas/{id}**: Exclui um tema.

### Documentação da API (Swagger)
Acesse a documentação da API em https://blogpessoal-d11u.onrender.com/. **USUARIO: root@root.com** **SENHA: rootroot**

Este é um resumo do projeto "Blog Pessoal API REST". Certifique-se de ajustar as configurações e dependências de acordo com suas necessidades antes de executar o projeto.
