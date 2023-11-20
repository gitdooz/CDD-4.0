import mysql.connector
banco = mysql.connector.connect(
    host='localhost',
    user='root',
    password ='134340',
    database='academiadaberlinda'
    )
cursor = banco.cursor()
