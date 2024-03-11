# MS Notification

O MS Notification é um microserviço dedicado à recepção e armazenamento de eventos relacionados às ações dos usuários no sistema, como registro, login e utilização dos outros endpoints disponíveis.

## Funcionalidades

- Recebe e armazena eventos relacionados às ações dos usuários no sistema.
- Utiliza um banco de dados MongoDB para armazenamento dos eventos.

## Eventos Suportados

O MS Notification suporta os seguintes eventos:

- **CREATE**: Evento gerado quando um novo usuário é registrado no sistema pelo MS User.
- **LOGIN**: Evento gerado quando um usuário realiza login no sistema pelo MS User.
- **GETBYID**: Evento gerado quando um usuário realiza uma busca especifica de um usuário pelo MS User.
- **UPDATE**: Evento gerado quando um usuário atualiza suas informações no sistema pelo MS User.
- **UPDATE_PASSWORD**: Evento gerado quando um usuário altera sua senha no sistema pelo MS User.

## Documentação de API

Atualmente, o MS Notification não possui. Ele atua principalmente como um consumidor de eventos gerados pelo MS User e os armazena no banco de dados MongoDB para fins de auditoria e histórico.

## Banco de Dados

O MS Notification utiliza exclusivamente um banco de dados MongoDB para armazenar os eventos recebidos do MS User. Isso proporciona uma estrutura flexível e escalável para armazenar e consultar o histórico de eventos relacionados às ações dos usuários no sistema.

## Integração com MS User

O MS Notification está integrado com o MS User, recebendo e processando eventos gerados por ele. Essa integração permite uma visão abrangente das atividades dos usuários no sistema, auxiliando na auditoria, segurança e análise de dados.

## Endpoints em Manutenção

O MS Notification possui os seguintes endpoints:



- **GET - /v1/events/:id**: Permite buscar um evento específico com base no seu ID.
- Manutenção

---
