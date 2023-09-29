quantEleitores = int(input("Insira a quantidade total de eleitores: "))
votosBrancos = int(input("Insira a quantidade de votos brancos: "))
votosNulos = int(input("Insira a quantidade de votos nulos: "))
votosValidos = int(input("Insira a quantidade de votos válidos: "))

porcentVotosBrancos = (votosBrancos/quantEleitores) * 100
porcentVotosNulos = (votosNulos/quantEleitores) * 100
porcentVotosValidos = (votosValidos/quantEleitores) * 100

print(f"Porcentagem de votos brancos: {porcentVotosBrancos:.2f}% de {quantEleitores} eleitores\nPorcentagem de votos nulos: {porcentVotosNulos:.2f} de {quantEleitores} eleitores%\nPorcentagem de votos válidos: {porcentVotosValidos:.2f}% de {quantEleitores} eleitores")
