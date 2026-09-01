# Agenda de Contatos — Roteiro de Desenvolvimento Incremental

Este repositório contém o projeto didático **Agenda de Contatos**, utilizado na disciplina de **Programação Orientada a Objetos (POO)** do **Instituto Federal de Educação, Ciência e Tecnologia do Ceará (IFCE) - campus Maranguape**, sob a orientação do **Dr. Róger Moura Sarmento**.

O objetivo fundamental deste projeto é demonstrar a evolução de um sistema de forma incremental, partindo de estruturas procedurais extremamente simples até a necessidade real e aplicação prática de conceitos avançados de POO.

---

## 🚀 Versão Atual: V.0.0.0

A **V.0.0.0** foca na transição e consolidação da lógica de programação estruturada de maneira linear e simples, preparando o estudante para entender as limitações do paradigma puramente procedural.

### ⚠️ A Principal Limitação
Como o código utiliza variáveis primitivas e isoladas, **a agenda armazena apenas 1 contato por vez**. Caso um novo contato seja adicionado, os dados do contato anterior são sobrescritos na memória.

---

## 🛠️ Evolução do Desenvolvimento (9 Etapas)

O desenvolvimento desta primeira versão foi construído sequencialmente através das seguintes etapas:

1. **Estrutura inicial do programa:** Criação da classe `Principal` e do método de entrada `main()`.
2. **Variáveis para armazenamento:** Definição das Strings de controle (`nome`, `celular`, `email`).
3. **Exibição do menu:** Apresentação visual das 5 opções de controle no terminal.
4. **Leitura com Scanner:** Introdução do `java.util.Scanner` para captura de dados e limpeza de buffer.
5. **Tomada de decisão:** Controle do fluxo do menu através da estrutura `switch-case`.
6. **Inserção de dados:** Implementação da funcionalidade de adicionar contato (sobrescrevendo dados antigos).
7. **Estrutura de Repetição:** Criação do laço `while` para manter o programa rodando até o usuário decidir sair.
8. **Validações com if-else:** Implementação das lógicas de Listar, Procurar (usando `equalsIgnoreCase`) e Excluir.
9. **Testes e Fechamento:** Validação de fluxos excepcionais (ex: buscar sem contatos) e tagueamento no Git.

---

## 💻 Conceitos Praticados nesta Versão

* Classe e Método Inicial (`public static void main`)
* Variáveis e Tipos de Dados (`String`, `int`, `boolean`)
* Entrada de Dados (`Scanner`)
* Estrutura de Condição Múltipla (`switch-case`)
* Estrutura de Repetição Condicional (`while`)
* Controle de Fluxo (`if-else`)
* Manipulação Básica de Strings (`isEmpty()`, `equalsIgnoreCase()`)

---

## 📋 Funcionalidades Operacionais do Menu

1. **Adicionar contato:** Recebe `Nome`, `Celular` e `E-mail` do terminal.
2. **Listar contato:** Mostra as informações do contato salvo ou alerta caso a agenda esteja vazia.
3. **Procurar contato:** Realiza busca textual ignorando maiúsculas/minúsculas.
4. **Excluir contato:** Retorna as variáveis de texto para o estado inicial de string vazia (`""`).
5. **Sair:** Altera o sinalizador boicote do loop e encerra a aplicação com segurança.

---

## 🔮 Próximo Passo: V.0.1.0

Para solucionar o problema limitador de armazenar apenas um único registro, a próxima iteração (**V.0.1.0**) introduzirá o conceito de **Arrays**, permitindo que múltiplos contatos coexistam de forma simultânea na memória do sistema.
