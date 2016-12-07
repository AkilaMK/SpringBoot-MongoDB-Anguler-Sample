use product_manager
db.createUser(
   {
     user: "user",
     pwd: "123",
     roles: [ "readWrite", "dbAdmin" ]
   }
);