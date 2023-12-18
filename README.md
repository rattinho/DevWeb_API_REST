# DevWeb_API_REST
A documentação da API está disponível em ./API_DOCUMENTATION/index.html

## Instalação:

### Passo 1: Configurar conexão da aplicação ao Banco de dados
No arquivo application.properties em /apirest/src/resources, altere a linha a seguir, apontando para o banco de dados Postgres desejado ("db" como a seguir é o default para utilização com Docker)
```sh
    spring.datasource.url=jdbc:postgresql://db:5432/postgres
```

Após isso, caso necessário, poderá também alterar os dados de login do banco de dados:
```sh
    # Usuário do banco de dados
    spring.datasource.username=admin

    # Senha do banco de dados
    spring.datasource.password=admin
```

#### Observação: 
Caso não seja utilizado via Docker, certifique-se que as tabelas do banco de dados estão montadas de acordo com a aplicação. Junto a raiz do projeto, há um script .sql com o esquema das tabelas.

### Passo 2: Empacotar Aplicação
Acesse o diretorio /apirest
```sh
    cd apirest
```
Execute a linha de comando a seguir:
```sh
    ./mvnw package -DskipTests  
```
Espere concluir o build da aplicação


### Passo 3: Inicializar o Docker
No diretorio / da aplicação, execute a linha a seguir:
```sh
    docker-compose up --build -d
```

### Finalizada a Instalação!
Já sera possível utilizar a API Rest para testes!






### Integrantes do trabalho:
#### Felipe Guimarães Ratto, Leonardo Menezes, Sabrina Pimentel Suzuki, Ugo Rangel Gemesio, João Victor de Albuquerque Pletsch
