# Agenda de Contatos — Versão V.0.3.0 (CRUD Completo)

Este repositório documenta a consolidação das operações essenciais de manipulação de dados do projeto **Agenda de Contatos**, desenvolvido como material prático da disciplina de **Programação Orientada a Objetos (POO)** do **IFCE - campus Maranguape**, sob a orientação do **Dr. Róger Moura Sarmento**.

O foco desta versão é o reaproveitamento das listas dinâmicas (`List` + `ArrayList`) para implementar a operação de atualização de registros, completando o ciclo básico de persistência de dados em memória.

---

## 🚀 O que muda na V.0.3.0?

Dando continuidade à estratégia pedagógica, a arquitetura base do sistema segue centralizada em uma única classe `Principal` e dentro do escopo do método `main()`. A interface no terminal e o fluxo de dados via `Scanner` continuam operando de forma direta.

A grande evolução desta versão é a introdução do método nativo **`.set()`**, que fecha a sequência de aprendizado sobre manipulação de coleções Java.

### 🔄 Alinhamento Conceitual: A Conexão com o CRUD
Com a chegada da funcionalidade de alteração, o projeto passa a espelhar oficialmente as quatro operações fundamentais de um **CRUD**:

* **[C]reate (Criar):** Operação realizada pelo método `.add()` *(visto na V.0.2.0)*
* **[R]ead (Ler):** Operações realizadas pelos métodos `.get()` e `.size()` *(visto na V.0.2.0)*
* **[U]pdate (Atualizar):** Operação introduzida pelo método **`.set()`** *(Novidade da V.0.3.0)*
* **[D]elete (Excluir):** Operação realizada pelo método `.remove()` *(visto na V.0.2.0)*

---

## 🛠️ Cronograma da Evolução (Etapas 18 a 23)

O roteiro estipula a evolução da aplicação através de 6 novas etapas integradas ao cronograma acumulado do projeto:

18. **Nova Opção no Menu:** Inclusão da alternativa `4 - Alterar contato` na interface do terminal. A numeração das opções subsequentes (`Excluir` e `Sair`) foi ajustada no fluxo do `switch-case`.
19. **Localização do Registro:** Implementação da rotina de busca baseada no método `.get()`. O sistema realiza uma varredura linear e armazena a coordenada encontrada na variável de controle `int posicao`.
20. **Captura de Dados:** Criação do bloco condicional (`if (posicao != -1)`) para interrupção do fluxo e coleta das novas strings informadas pelo usuário no console.
21. **Substituição de Valores:** Aplicação prática do método **`lista.set(indice, novoValor)`** de forma sincronizada nas três coleções independentes (`nomes`, `celulares` e `emails`).
22. **Tratamento de Exceção:** Inclusão do bloco `else` para emitir alertas visuais amigáveis caso a busca textual resulte em um contato inexistente.
23. **Fechamento da V.0.3.0:** Atualização dos cabeçalhos do console e geração oficial da Tag de versionamento estável no GitHub.

---

## 📊 Diferença Técnica Fundamental: add() vs. set()

Para fixação em sala de aula, o estudante aprende a diferenciar o comportamento interno de cada instrução na lista:

* **`add(elemento)`:** Expande a estrutura de memória e anexa um novo item ao final da lista.
* **`set(posicao, elemento)`:** Mantém o tamanho atual da lista inalterado e apenas **substitui** o conteúdo contido no índice especificado.
