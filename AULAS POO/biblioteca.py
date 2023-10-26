class Pessoa:
    def __init__(self, nome, peso, idade):
        self.nome = nome
        self.peso = peso
        self.idade = idade
        self.comendo = False
        self.falando = False
    def comer(self, comida):
        if self.comendo == True:
            print(f"{self.nome} já está comendo.")
        else:
            print(f"{self.nome} foi comer {comida}.")
            self.comendo = True
    def pararDeComer(self, comida):
        if self.comendo == True:
            print(f"{self.nome} pare de comer.")
        else:
            print(f"{self.nome} parou de comer {comida}.")
            self.comendo = False

    def falar(self):
        if self.falando == True:
            print(f"{self.nome} já estava falando")
        else:
            print(f"{self.nome} foi falar.")
            self.comendo = True

    def pararDeFalar(self):
        if self.falando == True:
            print(f"{self.nome} pare de falar.")
        else:
            print(f"{self.nome} parou de falar.")
    def acordar(self):
        print(f"{self.nome} acordou.")

    def dormir(self):
        print(f"{self.nome} foi dormir.")


# O método construtor possui um nome, e este nome é "__init__"
# Criação do objeto em JAVA : "Pessoa p1 = new Pessoa()"
# Criação do objeto em PYTHON : "p1 = Pessoa"
# E o método "self" é um "this" em java, onde, acessa tl atributo de acordo com a classe.