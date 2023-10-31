class Banco:
    def __init__(self, nome, numero, tipo):
        self.nome = nome
        self.numero = numero
        self.tipo = tipo
        self.status = False
        self.saldo = 0
        self.limite = 0
#mostrar a hora do depósito, saque e outros.
    def ativarConta(self):
        if self.status == False:
            print("-- ATIVANDO CONTA --")
            self.status = True
            print("-- CONTA ATIVADA! --")
        else:
            print("-- CONTA JÁ ATIVA! --")

    def desativarConta(self):
        if self.saldo == 0:
            print("-- DESATIVANDO CONTA --")
            self.status = False
            print("-- CONTA DESATIVADA COM SUCESSO!\n")
        elif self.saldo < 0:
            print("--- CONTA NÃO PODE SER DESATIVADA, HÁ SALDO NEGATIVO! ---")

        else:
            print("--- CONTA NÃO PODE SER DESATIVADO, HÁ SALDO RESTANTE! ---")

    def depositar(self, deposito):
        if self.status == True:
            if self.
            self.saldo += deposito
            print(f"--- SALDO ATUAL ---\n"
                  f"--- R${self.saldo} ---")
        else:
            print("--- CONTA NÃO ESTÁ ATIVADA ---")
    def sacar(self, saque):
        if self.status == True:
            self.saldo -= saque
            print(f"--- SAQUE ACEITO! ---\n"
                  f"--- SALDO ATUAL ---\n"
                  f"--- R${self.saldo} ---")
        else:
            print("--- CONTA NÃO ESTÁ ATIVADA ---")

    def ativarLimite(self, limite):
        self.limite = limite
        print(f"--- LIMITE ATIVADO - R${limite} ---")

    def verificarSaldo(self):
        print(f"--- SALDO ATUAL - R${self.saldo} ---")