import mysql.connector

banco = mysql.connector.connect(
    host="localhost",
    user="root",
    password="302302",
    database="academiaturmad")

cursor = banco.cursor()
pesquisa = 'select * from alunos;'
cursor.execute(pesquisa)
resultado = cursor.fetchall()

for x in resultado:
    print(x)

banco.commit()
#userid = meucursor.lastrowid
#print(userid)
cursor.close()
banco.close()

