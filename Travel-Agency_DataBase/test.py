import mysql.connector
from faker import Faker
import random

# Replace these with your actual database credentials
db_config = {
    'user': 'root',
    'password': '',
    'host': 'localhost',
    'database': 'travel_agency'
}

# Connect to the database
db_connection = mysql.connector.connect(**db_config)
cursor = db_connection.cursor()

# Number of records you want to insert
num_records = 20000

fake = Faker()

# Generate and insert random data
for _ in range(num_records):
    first_name = fake.first_name()
    last_name = fake.last_name()
    deposit = random.randint(50, 200)

    # SQL query to insert data
    insert_query = "INSERT INTO reservation_offers (res_name, res_lastname, deposit, offer_id) VALUES (%s, %s, %s, 3)"
    values = (first_name, last_name, deposit)

    cursor.execute(insert_query, values)
    db_connection.commit()

print(f"{num_records} records inserted.")

# Close the database connection
cursor.close()
db_connection.close()