CREATE TABLE IF NOT EXISTS public.orders (
     order_id SERIAL PRIMARY KEY,
     customer_name VARCHAR(100) NOT NULL,
     product_name VARCHAR(100) NOT NULL,
     quantity INT NOT NULL,
     order_date DATE NOT NULL
 );