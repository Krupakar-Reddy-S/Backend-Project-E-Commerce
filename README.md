# E-commerce Backend System

## Description
Develop a system to manage an online store's inventory, sales, and user interactions, focusing on creating, updating, retrieving, and deleting information regarding products, customers, and orders.

## Product Inventory Management
### Models Involved
- Product
- Category
- Inventory

### Requirements
- Create a model for Products with fields such as Product ID (Auto Increment), name, description, price, category, and inventory level.
- Implement CRUD operations for Product details as per the cardinality rules between Product, Category, and Inventory.
- Enable filtering and sorting of products based on various parameters like price, category, and popularity.

## Customer Profile Management
### Models Involved
- Customer
- Order

### Requirements
- Design a Customer model with fields like Customer ID, name, email, and registration date.
- Allow customers to update their profile information.
- Implement functionalities for customers to view their order history and track current orders.

## Order Processing
### Models Involved
- Order
- Product
- Customer

### Requirements
- Create an Order model with fields such as Order ID, Customer ID, list of Products, total amount, and order status.
- Implement CRUD operations for managing orders.
- Support features for order confirmation, cancellation, and status updates (e.g., pending, shipped, delivered).

## Project Details
- Implement RESTful API architecture using Spring Boot.
- Integrate MySQL Database.
- Enforce the right cardinality rules between the models.
- Use Hibernate ORM for database interaction to simplify CRUD operations and ensure data integrity.
- Consider adding logging for each CRUD operation to aid in debugging and monitoring the system's usage.

## ENDPOINTS:

### 1. `/products`
- GET: Retrieve all products `/products`
- GET: Retrieve a specific product `/products/{id}`
- POST: Add a new product or update an existing product `/products/{id}`
- DELETE: Remove a product `/products/{id}`
- GET: Retrieve product by category `/products/category/{id}`
- GTE: Retrieve product sorted by price ascending `products?sortByPriceAsc=true`
- GET: Retrieve product sorted by price descending `products?sortByPriceDesc=true`

### 2. `/categories`
- GET: Retrieve all categories `/categories`
- GET: Retrieve a specific category `/categories/{id}`
- POST: Add a new category or update an existing category `/categories/{id}`
- DELETE: Remove a category `/categories/{id}`

### 3. `/inventory`
- GET: Retrieve all inventories `/inventory`
- GET: Retrieve a specific inventory `/inventory/{id}`
- POST: Add a new inventory or update an existing inventory `/inventory/{id}`
- DELETE: Remove an inventory `/inventory/{id}`

### 4. `/inventory-item`
- GET: Retrieve all inventory items `/inventory-item`
- GET: Retrieve a specific inventory item `/inventory-item/{id}`
- POST: Add a new inventory item or update an existing inventory item `/inventory-item/{id}`
- DELETE: Remove an inventory item `/inventory-item/{id}`

### 5. `/customers`
- GET: Retrieve all customers `/customers`
- GET: Retrieve a specific customer `/customers/{id}`
- POST: Add a new customer or update an existing customer `/customers/{id}`
- DELETE: Remove a customer `/customers/{id}`
- GET: Retrieve customer orders `/customers/{id}/orders`

### 6. `/orders`
- GET: Retrieve all orders `/orders`
- GET: Retrieve a specific order `/orders/{id}`
- POST: Add a new order or update an existing order `/orders/{id}`
- DELETE: Remove an order `/orders/{id}`
- GET: Retrieve order status `/orders/{id}/status`
- PUT: Update order status `/orders/{id}/status`

### 7. `/order-items`
- GET: Retrieve all order items `/order-items`
- GET: Retrieve a specific order item `/order-items/{id}`
- POST: Add a new order item or update an existing order item `/order-items/{id}`
- DELETE: Remove an order item `/order-items/{id}`

