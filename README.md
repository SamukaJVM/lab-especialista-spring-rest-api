Especialista Spring REST (AlgaWorks)
====================================

Repositório destinado ao estudo e implementação do projeto laboratório **EspecialistaSpring REST**. O objetivo é dominar o desenvolvimento de APIs RESTful utilizando o ecossistema Spring, integrando boas práticas de design, persistência de dados, testes e automação CI/CD.

🚀 Tecnologias e Ferramentas
----------------------------

*   **Java 17+**
    
*   **Spring Boot 3.x**
    
*   **Spring Data JPA / Hibernate**
    
*   **MySQL**
    
*   **Flyway** (Migration)
    
*   **JUnit 5 / AssertJ / REST Assured** (Testes)
    
*   **ModelMapper** (DTOs)
    
*   **Docker & Docker Compose**
    
*   **Jenkins** (CI/CD Pipeline)
    

📚 Conteúdo Programático
------------------------

### 01\. Fundamentos e Spring Framework

*   **Injeção de Dependências:** Domínio do IoC Container, beans, @Component, @Configuration e desambiguação com @Primary e @Qualifier.
    
*   **Configuração Externa:** Uso de application.properties, variáveis de ambiente e **Spring Profiles** para diferentes contextos (Dev, Test, Prod).
    

### 02\. Persistência de Dados com JPA e Hibernate

*   **Mapeamento Objeto-Relacional:** Entidades, IDs com auto-incremento e relacionamentos (@ManyToOne, @OneToMany, @ManyToMany).
    
*   **Domain-Driven Design (DDD):** Conceitos de Agregados e o padrão Repository.
    
*   **Spring Data JPA:** Query methods, consultas customizadas com @Query, Criteria API e implementação do padrão **Specifications**.
    

### 03\. Design de APIs RESTful

*   **HTTP:** Métodos (GET, POST, PUT, DELETE, PATCH) e códigos de status.
    
*   **Content Negotiation:** Suporte a JSON e XML.
    
*   **Tratamento de Erros:** Implementação da **RFC 7807 (Problem Details)** para erros padronizados.
    
*   **Validações:** Bean Validation (Hibernate Validator) com constraints customizadas.
    

### 04\. Técnicas Avançadas e Boas Práticas

*   **DTO Pattern:** Isolamento do modelo de domínio com representações de entrada e saída.
    
*   **Testes de API:** Testes de integração robustos utilizando banco de dados de testes e **REST Assured**.
    
*   **Versionamento:** Estratégias de versionamento por URI e Media Type.
    
*   **HATEOAS:** Implementação de Hypermedia (HAL) para navegação dinâmica na API.
    
*   **Documentação:** Uso de **OpenAPI/Swagger** (SpringDoc/SpringFox) para documentação interativa.
    

### 05\. Infraestrutura e Operações

*   **Pool de Conexões:** Configuração do HikariCP.
    
*   **E-mails Transacionais:** Envio de e-mails com Spring Mail, FreeMarker e integração com Amazon SES/SendGrid.
    
*   **Armazenamento de Arquivos:** Upload local e integração com **Amazon S3**.
    
*   **Logging:** Gestão de logs com Logback, SLF4J e integração com serviços cloud (Loggly).


### 06\. Segurança Avançada com OAuth2 e JWT

*   **Arquitetura Stateless:** Transição de Stateful para Stateless utilizando **JWT (JSON Web Tokens)**.

*   **Criptografia e Assinatura:** Implementação de assinaturas com chaves simétricas (HMAC SHA-256) e assimétricas (**RSA com Keytool e JWKS**).

*   **Controle de Acesso Granular:** \* Uso de **Claims customizadas** no payload do token.

    *   Restrição de acesso com @PreAuthorize, @PostAuthorize e SpEL.

    *   Gestão de **Escopos** e **Granted Authorities**.

*   **Infraestrutura de Autenticação:** Armazenamento de tokens e sessões no **Redis** e persistência de clientes OAuth2 em banco de dados SQL.

*   **HATEOAS Dinâmico:** Geração de links condicionais baseados nas permissões do usuário autenticado.


### 07\. Docker e Orquestração de Microserviços

*   **Containerização:** Criação de imagens otimizadas via **Dockerfile** e integração direta com o **Maven**.

*   **Networking e Persistência:** Configuração de redes internas e volumes para MySQL e Redis.

*   **Docker Compose:** Orquestração de múltiplos serviços (API, DB, Cache, Proxy).

*   **Escalabilidade e Proxy Reverso:**

    *   Configuração de **Nginx** como Load Balancer.

    *   Entendimento de DNS Round Robin.

    *   Resolução de problemas de sessão em ambiente distribuído com **Spring Session Data Redis**.

*   **Resiliência:** Controle de inicialização de serviços com scripts de wait-for-it.


### 08\. Persistência, Design e Boas Práticas (Resumo)

*   **JPA/Hibernate:** Mapeamentos complexos, Criteria API e DDD (Aggregates/Repositories).

*   **Design de API:** RFC 7807 para erros, DTO Pattern e Versionamento (URI/Media Type).

*   **Testes:** Integração com JUnit 5, AssertJ e REST Assured em banco de dados isolado.    

🛠️ Como Executar o Projeto
---------------------------

### Pré-requisitos

*   Java 17
    
*   Docker & Docker Compose
    
*   Maven