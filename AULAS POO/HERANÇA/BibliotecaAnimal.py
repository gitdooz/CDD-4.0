class Animal:
    def __init__(self, nome, cor):
        self.nome = nome
        self.cor = cor

    def comer(self):
        print(f"{self.nome} foi comer...")

    def emitirSom(self):
        print(f"{self.nome} está fazendo barulho...")


class Gato(Animal):
    def __init__(self, nome, cor):
        super().__init__(nome, cor)

    def emitirSom(self):
        print(f"{self.nome} está miando...")


class Cachorro(Animal):
    def __init__(self, nome, cor):
        super().__init__(nome, cor)
        self.nome = nome
        self.cor = cor

    def emitirSom(self):
        print(f"{self.nome} está latindo...")


class Coelho(Animal):
    def __init__(self, nome, cor):
        super().__init__(nome, cor)
        self.nome = nome
        self.cor = cor

    def emitirSom(self):
        print(f"{self.nome} está piando...")


class Vaca(Animal):
    def __init__(self, nome, cor):
        super().__init__(nome, cor)
        self.nome = nome
        self.cor = cor

    def emitirSom(self):
        print(f"{self.nome} está fazendo moooooo...")