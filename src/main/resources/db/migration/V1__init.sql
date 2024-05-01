CREATE TABLE category
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    title         VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    CONSTRAINT pk_category PRIMARY KEY (id)
);

CREATE TABLE customer
(
    id                BIGINT AUTO_INCREMENT NOT NULL,
    name              VARCHAR(255) NULL,
    email             VARCHAR(255) NULL,
    registration_date datetime NULL,
    CONSTRAINT pk_customer PRIMARY KEY (id)
);

CREATE TABLE inventory
(
    id              BIGINT AUTO_INCREMENT NOT NULL,
    inventory_level VARCHAR(255) NULL,
    CONSTRAINT pk_inventory PRIMARY KEY (id)
);

CREATE TABLE inventory_item
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    product_id   BIGINT NULL,
    inventory_id BIGINT NULL,
    quantity     INT NOT NULL,
    CONSTRAINT pk_inventoryitem PRIMARY KEY (id)
);

CREATE TABLE `order`
(
    id           BIGINT AUTO_INCREMENT NOT NULL,
    customer_id  BIGINT NULL,
    order_status VARCHAR(255) NULL,
    CONSTRAINT pk_order PRIMARY KEY (id)
);

CREATE TABLE order_item
(
    id         BIGINT AUTO_INCREMENT NOT NULL,
    product_id BIGINT NULL,
    order_id   BIGINT NULL,
    quantity   INT NOT NULL,
    CONSTRAINT pk_orderitem PRIMARY KEY (id)
);

CREATE TABLE product
(
    id            BIGINT AUTO_INCREMENT NOT NULL,
    category_id   BIGINT NULL,
    inventory_id  BIGINT NULL,
    name          VARCHAR(255) NULL,
    `description` VARCHAR(255) NULL,
    price DOUBLE NULL,
    rating        SMALLINT NULL,
    CONSTRAINT pk_product PRIMARY KEY (id)
);

ALTER TABLE inventory_item
    ADD CONSTRAINT FK_INVENTORYITEM_ON_INVENTORY FOREIGN KEY (inventory_id) REFERENCES inventory (id);

ALTER TABLE inventory_item
    ADD CONSTRAINT FK_INVENTORYITEM_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE order_item
    ADD CONSTRAINT FK_ORDERITEM_ON_ORDER FOREIGN KEY (order_id) REFERENCES `order` (id);

ALTER TABLE order_item
    ADD CONSTRAINT FK_ORDERITEM_ON_PRODUCT FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE `order`
    ADD CONSTRAINT FK_ORDER_ON_CUSTOMER FOREIGN KEY (customer_id) REFERENCES customer (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_CATEGORY FOREIGN KEY (category_id) REFERENCES category (id);

ALTER TABLE product
    ADD CONSTRAINT FK_PRODUCT_ON_INVENTORY FOREIGN KEY (inventory_id) REFERENCES inventory (id);