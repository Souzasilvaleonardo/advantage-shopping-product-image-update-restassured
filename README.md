# Projeto de Automação de Testes com RestAssured

## Descrição
Este projeto realiza a automação de testes para a API do Advantage Online Shopping, utilizando RestAssured. Ele abrange testes de API, com foco em garantir a funcionalidade e a integridade do sistema.

## Estrutura do Projeto
A estrutura do projeto foi organizada de forma a facilitar a manutenção e a execução dos testes:

## Instalação e Configuração

### Pré-requisitos
- Maven instalado. Você pode instalá-lo seguindo as instruções no [site oficial do Maven](https://maven.apache.org/install.html).
- JDK 8 ou superior instalado. Você pode instalá-lo seguindo as instruções no [site oficial do Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

### Como Baixar e Configurar
1. Clone este repositório:
    ```bash
    git clone https://github.com/seu-usuario/advantage-shopping-product-image-update-restassured.git
    ```
2. Acesse a pasta do projeto:
    ```bash
    cd advantage-shopping-product-image-update-restassured
    ```
3. Instale as dependências do Maven:
    ```bash
    mvn clean install
    ```

## Executando os Testes

### Executar Testes
Para executar os testes, utilize o seguinte comando:
```bash
mvn test
```
## Testes Implementados

### Testes de API

**1. Testar Atualização de Imagem do Produto:** Atualiza a imagem de um produto na aplicação via API, utilizando o endpoint de upload de imagem.

### Evidência de Testes Bem-Sucedidos

Aqui está uma captura de tela mostrando o teste passando com sucesso:

![test-successful](https://github.com/Souzasilvaleonardo/advantage-shopping-product-image-update-restassured/assets/105978283/d5b0a323-7259-4963-8b0a-09da3ebba18d)

## Justificativa para a Organização das Pastas

A organização das pastas é crucial para a manutenção e escalabilidade do projeto. Mantemos uma estrutura clara que separa:

- dataFactory: Contém classes que geram dados necessários para os testes, facilitando a criação de dados de teste consistentes.

- modulos: Contém os módulos de testes, onde cada módulo é responsável por testar uma funcionalidade específica da API.

- pojo: Contém as classes POJO (Plain Old Java Object) que representam os dados transferidos entre as camadas da aplicação, facilitando o mapeamento de dados JSON para objetos Java.

- resources: Contém recursos adicionais necessários para os testes, como imagens e arquivos de configuração.

## Arquivos no Repositório

- `.idea:` Arquivos de configuração do IntelliJ IDEA.

- `src/test/:` Contém todos os arquivos de teste, incluindo classes Java, POJOs, e recursos.

- `.gitignore:` Arquivos e pastas a serem ignorados pelo Git.

- `pom.xml:` Arquivo de configuração do Maven, incluindo as dependências do projeto.

### Dependências do Maven

```xml
<dependencies>
    <!-- JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.8.0-M1</version>
        <scope>test</scope>
    </dependency>

    <!-- RestAssured -->
    <dependency>
        <groupId>io.rest-assured</groupId>
        <artifactId>rest-assured</artifactId>
        <version>5.3.2</version>
        <scope>test</scope>
    </dependency>

    <!-- Jackson Databind -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.12.3</version>
    </dependency>
</dependencies>
```

### Configuração do Maven

```xml
<properties>
    <maven.compiler.source>8</maven.compiler.source>
    <maven.compiler.target>8</maven.compiler.target>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
</properties>
```

