
-- 
CREATE TABLE product 
(
    product_id INT PRIMARY KEY ,
    product_name VARCHAR(50) ,
    product_price INT ,
    product_quantity INT 
);

-- 

INSERT INTO product(product_id , product_name , product_price , product_quantity )
VALUES 
(1 , "P1" , 100 , 15),
(2 , "P2" , 10 , 150),
(3 , "P3" , 120 , 151),
(4 , "P4" , 200 , 150),
(5 , "P5" , 30 , 30),
(6 , "P6" , 10 , 12),
(7 , "P7" , 10 , 13),
(8 , "P8" , 100 , 15),
(9 , "P9" , 1000 , 1),
(10 , "P10" , 900 , 2);


-- 
SELECT * FROM product;

-- 
DELETE product WHERE product_quantity < 3 ;