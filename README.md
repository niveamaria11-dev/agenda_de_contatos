# Agenda de Contatos — Versão V.0.2.0 (List + ArrayList)

Este repositório documenta a migração do projeto **Agenda de Contatos** do modelo estático de Arrays para a estrutura elástica de Coleções do Java (`java.util`). O projeto integra o material prático da disciplina de **Programação Orientada a Objetos (POO)** do **IFCE - campus Maranguape**, sob a tutela do **Dr. Róger Moura Sarmento**.

O foco exclusivo desta versão é demonstrar a conveniência, a simplicidade e a eficiência das **Coleções Dinâmicas** frente às limitações de tamanho fixo impostas pelos vetores tradicionais.

---

## 🚀 O que muda na V.0.2.0?

Para garantir uma comparação direta (linha por linha), toda a arquitetura estrutural da agenda foi mantida: uma única classe `Principal`, código concentrado no método `main()`, menu com `switch-case` e laço de repetição `while(continuar)`.

A grande evolução está na substituição total dos antigos arrays (`String[]`) por listas:
```java
List<String> nomes = new ArrayList<>();
List<String> celulares = new ArrayList<>();
List<String> emails = new ArrayList<>();
```

### 🏆 As Grandes Vantagens Práticas
1. **Fim da Capacidade Fixa:** A agenda não precisa mais de um tamanho definido previamente (como a `capacidade = 5` da versão anterior). Ela cresce infinitamente conforme novos contatos são inseridos.
2. **Exclusão Automatizada:** O gerenciamento manual de memória deixa de existir. O próprio Java reorganiza os índices internos na remoção, eliminando o algoritmo complexo de deslocamento de elementos à esquerda.

---

## 🛠️ Detalhamento das Novas Operações Praticadas

Com a transição para `ArrayList`, o gerenciamento da agenda passou a utilizar quatro métodos nativos fundamentais da biblioteca padrão do Java:

* **`add(elemento)` (Adicionar):** Insere automaticamente o dado ao final da lista. Não requer indicação de colchetes ou controle manual de qual posição está livre.
* **`size()` (Tamanho):** Retorna a quantidade exata de elementos reais atualmente armazenados. Substitui as checagens manuais de limite de memória.
* **`get(índice)` (Acesso):** Recupera o dado contido em uma coordenada específica. Substitui a sintaxe tradicional de arrays (`nomes[i]` vira `nomes.get(i)`).
* **`remove(índice)` (Remover):** Exclui o registro da posição informada e colapsa a lista dinamicamente, eliminando "buracos" nulos na memória.

---

## 🔄 Comparativo Direto de Código: Vetores vs. Coleções

A tabela abaixo ilustra didaticamente como o algoritmo foi simplificado sem perder a sincronização de índices entre as listas de nomes, celulares e emails:

| Operação | V.0.1.0 — Array Estático | V.0.2.0 — ArrayList Dinâmico |
| :--- | :--- | :--- |
| **Limitação do Loop** | `i < cont` | `i < nomes.size()` |
| **Leitura / Acesso** | `nomes[i]` | `nomes.get(i)` |
| **Gravação / Escrita** | `nomes[cont] = sc.nextLine();` | `nomes.add(sc.nextLine());` |
| **Algoritmo de Exclusão** | `for(int i = idx; i < cont-1; i++) { nomes[i] = nomes[i+1]; }` | `nomes.remove(indiceExcluir);` |

---

## 🧠 Aprendizado Pedagógico

O desenvolvimento desta versão prova que **mudar a estrutura de armazenamento não significa jogar fora a lógica de negócios já construída**. O algoritmo básico de busca linear (`equalsIgnoreCase`), as variáveis sinalizadoras (`boolean encontrado`) e a estrutura de repetição continuam funcionando perfeitamente, provando o valor da refatoração de código.
