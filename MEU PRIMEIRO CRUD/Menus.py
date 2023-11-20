from bibliotecaAcademia import *
from BancoDeDados import *
import os

continuar = True
while continuar:
    print('-----------  MENU -----------\n'
          '   > 1 - CADASTRAR ALUNO <\n'
          '   > 2 - CADASTRAR FUNCIONÁRIO <\n'
          '   > 3 - CADASTRAR MODALIDADE <\n'
          '   > 4 - CADASTRAR PERSONAL <\n')
    primeiro_menu = int(input('O que deseja fazer?\n'
                              'DIGITE AQUI: '))
    os.system('cls')
    if primeiro_menu == 1:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DO ALUNO <\n'
              '   > 2 - DELETAR ALUNO <\n'
              '   > 3 - MOSTRAR DADOS <\n')
        opcao_aluno = int(input('O que deseja fazer?\n'
                                'DIGITE AQUI: '))
        os.system('cls')
        if opcao_aluno == 1:
            inserirAluno()
            print('\nINFORMAÇÕES DO ALUNO\n')
            nome = input('Nome: ')
            cpf = input('CPF: ')
            telefone = input('Telefone: ')
            email = input('Email: ')
            endereco = input('Endereço: ')

            inserirAluno(nome, cpf, telefone, email, endereco)
        elif opcao_aluno == 2:
            print('----------- DESLIGAMENTO DE ALUNO -----------')
            matricula = int(input('Digite a matrícula do aluno: '))
            deletarAluno(matricula)
        else:
            print('\n----------- TABELA ALUNOS -----------')
            mostrarDadosAluno()

    if primeiro_menu == 2:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DO FUNCIONARIO <\n'
              '   > 2 - DELETAR FUNCIONARIO <\n'
              '   > 3 - MOSTRAR DADOS DO FUNCIONARIO <\n')
        opcao_funcionario = int(input('O que deseja fazer?\n'
                                      'DIGITE AQUI: '))
        if opcao_funcionario == 1:
            print('----------- INFORMAÇÕES DO FUNCIONÁRIO -----------')
            nome = input('Nome:')
            cpf_funcionario = input('CPF: ')
            departamento = int(input('Departamento: '))
            salario = float(input('Salário: '))
            inserirFuncionario(nome, cpf_funcionario, departamento,salario)
        elif opcao_funcionario == 2:
            print('\n----------- DESLIGAMENTO DE FUNCIONÁRIO -----------')
            id_funcionario = int(input('Digite ID do funcionário: '))
            deletarFuncionario(id_funcionario)
        else:
            print('----------- TABELA FUNCIONÁRIOS -----------')
            mostrarDadosFuncionario()

    if primeiro_menu == 3:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DA MODALIDADE <\n'
              '   > 2 - DELETAR MODALIDADE <\n'
              '   > 3 - MOSTRAR DADOS DA MODALIDADE <\n')
        opcao_modalidade = int(input('O que deseja fazer?\n'
                                     'DIGITE AQUI: '))

        if opcao_modalidade == 1:
            print('----------- INFORMAÇÕES DA MODALIDADE -----------')
            nome = input('Nome: ')
            inserirModalidade(nome)
        elif opcao_modalidade == 2:
            id_mod = int(input('Digite a matrícula do aluno: '))
            deletarModalidade(id_mod)
        else:
            print("----------- MODALIDADES -----------")
            mostrarDadosModalidade()
    if primeiro_menu == 4:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DO PERSONAL <\n'
              '   > 2 - DELETAR PERSONAL <\n'
              '   > 3 - MOSTRAR DADOS DO PERSONAL <\n')
        opcao_personal = int(input('O que deseja fazer?\n'
                                   'DIGITE AQUI: '))
        if opcao_personal == 1:
            print('----------- INFORMAÇÕES DO PERSONAL -----------')
            cpf = input('CPF: ')
            cref = input('CREF: ')
            nome = input('Nome: ')
            telefone = input('Telefone: ')
            email = input('Email: ')
            inserirPersonal(cpf, cref, nome, telefone, email)
        elif opcao_personal == 2:
            print('----------- DELETAR PERSONAL -----------')
            cpf = int(input('Digite a matrícula do aluno: '))
            deletarPersonal(cpf)
        else:
            print('----------- TABELA PERSONAL -----------')
            mostrarDadosPersonal()
        continuar = input('Deseja continuar? ')
