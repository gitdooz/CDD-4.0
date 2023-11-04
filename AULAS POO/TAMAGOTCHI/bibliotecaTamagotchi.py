from Tamagotchi import *

idade = 1
peso = 2.5
continuar = True
print("º.- TAMAGOTCHI -.º")
nome = input("Qual é nome do seu bichinho? ")
bichinho = Tamagotchi(nome, peso, idade)

while continuar:
    print("\n_1.Comer_\n_2.Parar de comer_\n_3.Dormir_\n_4.Acordar_\n_5.Falar_\n_6.Parar de falar_\n_7.Sair_")
    opcao = input(f"\nO que {nome} vai fazer? ")
    if opcao in '1234567':
        if opcao == '1':
            bichinho.comer()

        if opcao == '2':
            print('comeu')
            bichinho.pararDeComer()

        if opcao == '3':
            bichinho.dormir()

        if opcao == '4':
            bichinho.acordar()

        if opcao == '5':
            bichinho.falar()

        if opcao == '6':
            bichinho.pararDeFalar()

        if opcao == '7':
            continuar = bichinho.parar(continuar)
    else:
        print("Opção inválida.")
        opcao = input("\nO que {} vai fazer? ")
