# HyperReach 💻🤖
![logo.png](documentacao%2Ffotos%2Flogo.png)

# Sumário
[Introdução](#introdução)  
[Como rodar a aplicação](#como-rodar-a-aplicação)  
[Diagramas](#diagramas)  
[Link do Video](#link-do-video)

# Introdução

## Objetivo do Projeto

Estamos desenvolvendo uma solução inovadora de inteligência artificial voltada para a hiperpersonalização de campanhas de marketing, com o intuito de transformar a comunicação entre empresas e seus clientes. Nossa proposta é utilizar a coleta e análise detalhada de dados para alcançar dois objetivos principais:

### 1. Segmentação de Empresas

A solução implementa modelos avançados de aprendizado de máquina, como Árvores de Decisão e K-Means Clustering, para agrupar empresas com base em características e comportamentos semelhantes. Isso possibilita a criação de campanhas altamente personalizadas, direcionadas às necessidades específicas de cada grupo.

### 2. Análise de Feedback e Identificação de Gastos

Utilizando técnicas como Redes Neurais Recorrentes (RNNs) e análise de séries temporais, nossa solução analisa feedbacks e interações dos clientes para identificar padrões de comportamento e preferências, além de mapear tendências de gastos das empresas.

## Benefícios

Essas funcionalidades visam não apenas melhorar a eficácia das campanhas de marketing, mas também aumentar as taxas de conversão e aprimorar a experiência do cliente. O sistema será composto por:

- **Back-end**: Desenvolvido em Java para processamento e análise de dados, mas tambem usando ThymeLeaf para deixar a aplicação FullStack.
- **Front-end**: Aplicação mobile em React Native e Kotlin, proporcionando uma interação intuitiva e uma visualização dinâmica das campanhas personalizadas.

## Diferenciais

Esta solução preenche uma lacuna no mercado ao integrar análise de dados com personalização em larga escala, prometendo revolucionar a comunicação entre empresas e clientes. Com um público-alvo bem definido e a adoção de tecnologias modernas, nosso projeto não só atende aos objetivos propostos, mas também se compromete a aprimorar continuamente a experiência do cliente e a eficácia das campanhas de marketing.

# Como rodar a aplicação

## Instruções para Rodar a Aplicação
### 1. Executar a Aplicação
- Navegue até o diretório: SRC > MAIN > JAVA > BR.COM.FIAP.CHALLENGE3
- Execute a aplicação através da classe `Challenge3Application`.
### 2. Acessar a Aplicação Web
- Abra o seu navegador e digite a seguinte URL:
- http://localhost:8080/empresas
### 3. Configurações Necessárias
- Certifique-se de configurar o arquivo `application.properties` com as informações do seu banco de dados e o token do Spring AI.
### 4. Rodar a Mensageria
- Para iniciar o RabbitMQ, abra o Prompt de Comando (CMD) como administrador.
- Execute o seguinte comando (certifique-se de que o Docker Desktop está aberto e instalado):   
```docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management```


# Diagramas

## Diagrama UML
![model.png](documentacao%2Fdiagrama-classes%2Fmodel.png)

## Diagrama de Arquitetura
![arquitetura.png](documentacao%2Fdiagrama-classes%2Farquitetura.png)

# Link do Video
[https://www.youtube.com/watch?v=V7Ntv5wPsF0](https://www.youtube.com/watch?v=Wb2HLcZJjNk)
