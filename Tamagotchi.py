class Tamagotchi:
    def __init__(self, nome, peso, idade):
        self.nome = nome
        self.peso = peso
        self.idade = idade
        self.comendo = False
        self.falando = False
        self.dormindo = False

    def comer(self):
        if self.falando:
            print(f"{self.nome} não pode comer pois está falando.")
        if self.dormindo:
            print(f"{self.nome} não pode comer pois está dormindo.")
        elif self.comendo:
            print(f"{self.nome} já está comendo.")
        else:
            self.comendo = True
            print(f"{self.nome} foi comer.")

    def pararDeComer(self):
        if self.comendo:
            print(f"{self.nome} pare de comer.")
        else:
            print(f"{self.nome} parou de comer.")
            self.comendo = False

    def falar(self):
        if self.comendo:
            print(f"{self.nome} não pode falar pois está comendo.")
        elif self.dormindo:
            print(f"{self.nome} não pode falar pois está dormindo.")
        else:
            print(f"{self.nome} está falando.")
            self.falando = True

    def pararDeFalar(self):
        if self.falando:
            print(f"{self.nome} pare de falar.")
        else:
            print(f"{self.nome} parou de falar.")

    def acordar(self):
        if self.dormindo:
            self.dormindo = False
            print(f"{self.nome} acordou.")
        else:
            print(f"{self.nome} não está dormindo.")

    def dormir(self):
        if self.comendo:
            print(f"{self.nome} não pode dormir pois está comendo.")
        elif self.falando:
            print(f"{self.nome} não pode dormir pois está falando.")
        else:
            self.dormindo = True
            print(f"{self.nome} foi dormir.")

    def parar(self, continuar):
        print("\nFalouuuu!")
        continuar = False
        return continuar
