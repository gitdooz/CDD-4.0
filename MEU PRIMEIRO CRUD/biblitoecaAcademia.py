from BancoDeDados import *

def inserirAluno():
    nome = input('DIGITE O NOME DO ALUNO: ')
    cpf = input('DIGITE O CPF DO ALUNO: ')
    telefone = input('DIGITE O TELEFONE DO ALUNO: ')
    endereco = input('DIGITE O ENDERECO DO ALUNO: ')
    email = input('DIGITE O EMAIL DO ALUNO: ')
    return nome, cpf, telefone, endereco, email

def deletarAluno(matricula):
    mtrcl = matricula
    deletar_aluno = 'delete from alunos where matricula = (%s);'
    cursor.execute(deletar_aluno, mtrcl)

def mostrarDadosAluno():
    comando = 'select * from alunos'
    return comando

def inserirFuncionario():
    nome = input('DIGITE O NOME DO FUNCIONÁRIO: ')
    id_funcionario = input('DIGITE O ID DO FUNCIONÁRIO: ')
    cpf = input('DIGITE O CPF DO FUNCIONÁRIO: ')
    departamento = int(input('DIGITE O DEPARTAMENTO DO FUNCIONÁRIO: '))
    return nome, id_funcionario, cpf, departamento

def deletarFuncionario(id_funcionario):
    id = id_funcionario
    deletar_funcionario = 'delete from funcionarios where id_funcionario = (%s);'
    cursor.execute(deletar_funcionario, id)

def mostrarDadosFuncionario():
    comando = 'select * from funcionarios'
    return comando

def inserirModalidade():
    id_mod = int(input('DIGITE O ID DA MODALIDADE: '))
    nome = input('DIGITE O NOME DO FUNCIONÁRIO: ')
    return id_mod, nome

def deletarModalidade(id_mod):
    id_M = id_mod
    deletar_modalidade = 'delete from modalidades where id_mod = (%s);'
    cursor.execute(deletar_modalidade, id_M)

def mostrarDadosModalidade():
    comando = 'select * from modalidades'
    return comando

def inserirPersonal():
    nome = input('DIGITE O NOME DO PERSONAL: ')
    cpf = input('DIGITE O CPF DO PERSONAL: ')
    cref = input('DIGITE O CREF DO PERSONAL: ')
    telefone = input('DIGITE O TELEFONE DO PERSONAL: ')
    email = input('DIGITE O EMAIL DO PERSONAL: ')
    return nome, cpf, cref, telefone, email

def deletarPersonal(cpf):
    cpf_personal = cpf
    deletar_personal = 'delete from personal where cpf = (%s);'
    cursor.execute(deletar_personal, cpf_personal)

def mostrarDadosPersonal():
    comando = 'select * from personal'
    return comando
