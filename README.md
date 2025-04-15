# 📝 To-Do List App

A simple and clean **To-Do List** application built with **Spring Boot**, **Thymeleaf**, and **Spring Data JPA**. This app allows you to manage tasks efficiently with basic **CRUD** functionalities.

---

## ✨ Features

- ➕ Add new tasks
- ✏️ Edit existing tasks
- ✅ Mark tasks as complete/incomplete
- 🗑️ Delete tasks
- 🌐 Clean and responsive UI using **Thymeleaf**
- 🛢️ MySQL Database for persistent storage

---

## 🚀 Tech Stack

- ☕ Java 17+
- ⚙️ Spring Boot
- 💾 Spring Data JPA
- 🖼️ Thymeleaf
- 🐬 MySQL Database
- 📦 Maven

---

## 📷 Screenshot

![Screenshot 2025-04-14 175727](https://github.com/user-attachments/assets/3c93a008-4f25-4731-bbc3-97dd7908ae30)

---

## 📁 Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/todo/
│   │       ├── controller/           # Handles HTTP requests
│   │       ├── models/               # Entity classes
│   │       ├── repository/           # Spring Data JPA interfaces
│   │       ├── services/             # (Optional) Business logic
│   │       └── TodoAppApplication.java
│   └── resources/
│       ├── templates/                # Thymeleaf HTML templates
│       │   └── tasks.html
│       ├── static/                   # Static files (CSS, JS)
│       └── application.properties    # App configuration
```
---

##  🚀 Getting Started

1. Clone the Repository
```
git clone https://github.com/your-username/todo-app.git
cd todo-app
```

2. Configure MySQL Database
Ensure that MySQL is running on your local machine and create the database:
```
CREATE DATABASE tododb;
```

3. Update application.properties
In your src/main/resources/application.properties, add the following configuration:
```
spring.datasource.url=jdbc:mysql://localhost:3306/tododb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

4. Add MySQL Connector to pom.xml
Add the following MySQL dependency to your pom.xml file to enable connection to the MySQL database:
```
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <scope>runtime</scope>
</dependency>
```

5. Run the App
To run the application, use the following Maven command:
```
mvn spring-boot:run
Now, visit the app at http://localhost:8080.
```
---

##  📄 LICENSE
MIT License

Copyright (c) 2025 Ronak Rathod

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell      
copies of the Software, and to permit persons to whom the Software is          
furnished to do so, subject to the following conditions:                       

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.                                

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR     
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,       
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE    
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER         
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  
SOFTWARE.

---

##  🤝 Contributing
Contributions are always welcome! Feel free to fork the project, make your changes, and submit a pull request.

---

##  🙋‍♂️ Author
Ronak Rathod
