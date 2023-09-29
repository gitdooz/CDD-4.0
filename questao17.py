macasCompradas = int(input("Quantas maçãs foram compradas? "))
if macasCompradas < 12:
    precoMaca = float(1.30)
else:
    precoMaca = float(1.00)

compraTotal = macasCompradas * precoMaca
print(f"Sua conta deu R${compraTotal}")
