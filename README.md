# testbuana

Syakur Rahman5:10 PM

1. Create service for item data
2. Create service for transaction data

API Usage:

1. Get/Search item
2. For selected item, add item to cart
3. Add more items to cart
4. Remove item from cart
5. Finalize cart (calculcate price)

Optional:

1. Use spring cloud security


## Setup Database

* Run MySQL di docker
    ```bashpro shell script
  sudo docker run --rm \
  --name=buana-db \
  -e MYSQL_DATABASE=buanadb \
  -e MYSQL_USER=buanaapp \
  -e MYSQL_PASSWORD=PNSJkxXvVNDAhePMuExTBuRR \
  -e MYSQL_ROOT_PASSWORD=rahasia \
  -e TZ=Asia/Jakarta \
  -p 6603:3306 \
  -v "$PWD/docker/buana-db/conf.d":/etc/mysql/conf.d \
  -v "$PWD/storage/docker/buanadb-data":/var/lib/mysql \
  mysql
   ```

* Try login with user
  ```shell
  mysql -buanaapp -p -h127.0.0.1 -P6603 
  ```

* Show database
  ```mysql
  SHOW DATABASES; 
  ```
  the output:
  ```shell
  +--------------------+
  | Database           |
  +--------------------+
  | information_schema |
  | buanadb          |
  +--------------------+
  2 rows in set (0,00 sec) 
  ```
