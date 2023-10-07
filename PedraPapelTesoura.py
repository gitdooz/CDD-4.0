cont = "s"
pontos1 = 0
pontos2 = 0
while cont == "s":
    for rodadas in range(3):
        oponente1 = input("Opção do primeiro oponente: ")
        oponente2 = input("Opção do segundo oponente: ")

        if oponente1 == "pedra" and oponente2 == "tesoura":
            print("Pedra quebra tesoura. Oponente 1 vence!")
            pontos1 += 1
        elif oponente1 == "papel" and oponente2 == "pedra":
            print("Papel envolve pedra. Oponente 1 vence!")
            pontos1 += 1
        elif oponente1 == "tesoura" and oponente2 == "papel":
            print("Tesoura corta papel. Oponente 1 vence!")
            pontos1 += 1
        elif oponente2 == "pedra" and oponente1 == "tesoura":
            print("Pedra quebra tesoura. Oponente 2 vence!")
            pontos2 += 1
        elif oponente2 == "papel" and oponente1 == "pedra":
            print("Papel envolve pedra. Oponente 2 vence!")
            pontos2 += 1
        elif oponente2 == "tesoura" and oponente1 == "papel":
            print("Tesoura corta papel. Oponente 2 vence!")
            pontos2 += 1
        else:
            print("Empate!")
            pontos1 += 1
            pontos2 += 1
    print(f"Jogador 1 tem {pontos1} e Jogador 2 tem {pontos2}.")
    cont = input("Deseja continuar tentando? ")
else:
    print("Jogo finalizado.")