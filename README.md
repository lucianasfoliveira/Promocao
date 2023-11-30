# Microserviço de Promoção

## Visão Geral do Projeto

### Descrição Breve
O microserviço de promoção é um componente essencial de um sistema distribuído voltado para a gestão de promoções de pacotes. Ele se comunica via REST API para consulta de informações de promoção associadas a um pacote.

### Arquitetura
O projeto é baseado em uma arquitetura de microsserviços, integrando-se de maneira assíncrona com outros serviços. Sua principal funcionalidade é oferecer informações sobre promoções para pacotes por meio de requisições REST.

## Configuração do Ambiente de Desenvolvimento

### Requisitos
- Java 17
- Maven
- Banco de Dados H2 (ou PostgreSQL)

### Instruções de Configuração
1. Clone o repositório.
2. Configure as dependências e o ambiente Java.
3. Configure o banco de dados conforme necessário.

## Funcionalidades

### 1. Criar Promoção
Método: POST

Endpoint: /promocao

Descrição: Cria uma nova promoção com base nos dados fornecidos.

Request Body: PromocaoRequest

Response: PromocaoResponse

### 2. Listar Promoções
Método: GET

Endpoint: /promocao

Descrição: Lista todas as promoções disponíveis.

Response: Lista de PromocaoResponse

### 3. Obter Promoção por Pacote ID
Método: GET

Endpoint: /promocao/{PacoteId}

Descrição: Obtém informações de promoção para um pacote específico.

Path Variable: PacoteId (Identificador do pacote)

Response: Porcentagem de desconto (Integer) para o pacote especificado ou 0 se não tiver em promoção.

## Contribuição

- Beatriz Berto
- Bruna Torres
- Fernanda Soares
- Jessica Alves
- Jessica Lima
- Luciana Oliveira
