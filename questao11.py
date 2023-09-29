idadeAnos = int(input("Idade em anos: "))
idadeMeses = int(input("Quantos meses para seu aniversário? "))
idadeDias = int(input("Quantos dias para seu aniversário? "))

conversao = idadeAnos * 365 + idadeMeses * 12 + idadeDias
print(f"Sua idade em dias é {conversao}")