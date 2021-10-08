# API Automation Using RestAssured

[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)

This Maven Project contains example code for learning API Automation Testing using TestNG + Java with RestAssured Library.

This project is based on ***[Reqres - A freely available REST API.](https://reqres.in)***

***The Project has following capabilities :-***

**(i)** Java - Maven - TestNG - REST Assured.

**(ii)** *Hamcrest Matchers Library.*

**(iii)** *Google Gson Java library* (to serialize Java objects to JSON & deserialize JSON to Java objects).

**(iv)** *Jackson Java Library* (used at some places serializing & deserializing purpose)

**(v)** *MySql ConnectorJ :* For fetching test data from MySql Database & using that data into test cases using *TestNG @DataProvider* Annotation.

**(vi)** *Apache Log4j2 API* for generating log files.


<br />

***Below are the HTTP Methods that are automated in this project :-***

- **[HTTP GET Call](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/java/httpMethods/GetMethod.java)** 
- **[HTTP POST Call](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/java/httpMethods/PostMethod.java)**
- **[HTTP PUT Call](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/java/httpMethods/PutMethod.java)** 
- **[HTTP PATCH Call](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/java/httpMethods/PatchMethod.java)**
- **[HTTP DELETE Call](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/java/httpMethods/DeleteMethod.java)**
- **[POJO JSON Utility](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/java/utils/PojoJsonUtil.java)** ---------->> Converts POJO to JSON & Vice-versa.
- **[SQL Utility](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/java/utils/SqlUtil.java)** ---------->> Contains method that fetches test data from MySQL DataBase & converts it into Object Array and another method that executes various updation queries into MySQL DataBase.

<br />

## Run Locally

### Method 1: Run from Eclipse/IntelliJ IDE

- Clone the project

```bash
  git clone https://github.com/akshat-raj09/API_Automation_Using_REST_Assured
```

- Go to the project directory

```bash
  cd API_Testing_Rest_Assured
```

- Open Eclipse/IntelliJ IDE. Import the project into Eclipse/IntelliJ IDE & search for [testng.xml](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/resources/testng.xml).

- Right Click on [testng.xml](https://github.com/akshat-raj09/API_Automation_Using_REST_Assured/blob/master/API_Testing_Rest_Assured/src/main/resources/testng.xml) ------> Run As ------> TestNG.

### Method 2: Run from Command Line (Maven should be installed)

- Clone the project

```bash
  git clone https://github.com/akshat-raj09/API_Automation_Using_REST_Assured
```

- Go to the project directory

```bash
  cd API_Testing_Rest_Assured
```

- Run this Maven command

```bash
  mvn clean test
```

<br />

## Contributing

Contributions are always welcome!

Please adhere to this project's `code of conduct`.

<br />

## Authors

- [@Akshat](https://www.github.com/akshat-raj09)

<br />

# Hi, I'm Akshat! 👋


## 🚀 About Me
I'm a QA Engineer & interested in building automation frameworks & learning new tools related to automation............


## 🔗 Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/akshat009)


## 🛠 Skills
Java, Selenium, TestNG, SQL, Git, Maven, Apache POI, TDD, Jenkins, JIRA, Docker, Jmeter, Postman, RestAssured, SonarQube, Linux, SiKuli, TagUI, Robot Framework...........


## Feedback
If you have any feedback, please reach out to me at akshat.rajvaidya09@gmail.com
