# Laboratório de Práticas: Missão Java - Parte 4 (Novas Classes no Torneio)

Projeto focado no estudo e aplicação do conceito de **Herança** em Programação Orientada a Objetos (POO) com Java.

---

## 🛠️ Caça aos Erros

Abaixo estão identificados e corrigidos os quatro erros presentes no código inicial proposto no exercício:

| Erro | Correção |
| :--- | :--- |
| **1.** Uso incorreto da palavra-chave de herança (`extend Personagem`). | Alterado para `extends Personagem` (com **s** no final). |
| **2.** O construtor estava com o nome da classe mãe (`Personagem`). | O construtor da subclasse deve se chamar `Mago`. |
| **3.** `super(nome, tipo, nivel, vida);` com número insuficiente de parâmetros. | Ajustado para `super(nome, tipo, nivel, vida, energia);` enviando todos os parâmetros da superclasse. |
| **4.** Atribuição incorreta `mana = mana;` sem diferenciação de escopo. | Alterado para `this.mana = mana;` (ou utilizando o método `setMana(mana)`). |

---

## 📝 Explique em Poucas Palavras

### 1. Qual é a função de `extends`?
A palavra-chave `extends` indica que uma classe é uma subclasse (filha) e herdará todos os atributos e métodos acessíveis de uma superclasse (mãe).

### 2. Por que usamos `super(...)` no construtor de `Mago`?
O comando `super(...)` é utilizado para chamar o construtor da classe mãe (`Personagem`), permitindo inicializar corretamente os atributos herdados (`nome`, `tipo`, `nivel`, `vida` e `energia`) sem duplicar código.

### 3. O que `Mago` recebeu de `Personagem` sem precisar repetir o código?
A classe `Mago` recebeu os atributos (`nome`, `tipo`, `nivel`, `vida`, `energia`) e seus respectivos métodos públicos, como os *getters*, *setters*, `descansar()` e `toString()`.

---

## ✅ Checklist de Entrega

- [x] Personagem utilizada como classe mãe
- [x] Mago declarada com `extends`
- [x] Construtor da filha usando `super`
- [x] Atributo `mana` sem repetir atributos comuns
- [x] Getter e setter de `mana`
- [x] Método `lancarFeitico()`
- [x] Métodos herdados testados
- [x] Classe Guerreiro criada
- [x] Código executado sem erros
