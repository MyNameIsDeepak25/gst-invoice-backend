1️⃣ Goal

Build a basic backend for customer and product management using Spring Boot + MySQL.

2️⃣ Setup

Spring Boot project with Maven

Dependencies:

Spring Web

Spring Data JPA

MySQL Driver

Lombok (optional)

MySQL database: gst_invoice_db

application.properties configured to connect to MySQL.

3️⃣ Database Tables

Created via JPA entities:

Table	Description
customers	Store customer info (name, email, phone, state)
products	Store product info (name, price, GST%)
4️⃣ Implemented APIs
Customer APIs
Method	Endpoint	Description
POST	/api/customers	Add new customer
GET	/api/customers	List all customers
GET	/api/customers/{id}	Get customer by ID
PUT	/api/customers/{id}	Update customer info
DELETE	/api/customers/{id}	Delete customer
Product APIs
Method	Endpoint	Description
POST	/api/products	Add new product
GET	/api/products	List all products
GET	/api/products/{id}	Get product by ID
PUT	/api/products/{id}	Update product info
DELETE	/api/products/{id}	Delete product
5️⃣ Key Points

Used Spring Data JPA for database operations.

Tables auto-created by Spring Boot.

Tested APIs using Postman.

Focused only on backend – no frontend.

Phase 1 is ready to merge into main.
