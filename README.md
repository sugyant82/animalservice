# animalservice  
(This is an original work done by Sugyant Chettri as part of singtel coding assignment on 27-July-2021)

There are two parts to this application 

1) A Standalone Java Main class for running the solution to the prescribed questions.
2) A full featured spring boot RESTful Web service for quering the animal endpoints.

**SETTING UP THE APPLICATION**

1) Clone the project to your local directory.
2) Open the Eclipse IDE
3) Import Maven Project and select the animalservice folder
4) Make sure Java 11 dependencies and spring boot dependencies are availabe through the network

<img width="768" alt="Screenshot 2021-07-27 at 9 13 58 PM" src="https://user-images.githubusercontent.com/49311090/127159836-e934d89d-a737-4dc7-80ee-c9306766cb7c.png">


**I. RUNNING STANDALONE APPLICATION**

1) Right Click on the Java Class "**com.singtel.animalservice.standalone_program.standaloneSolution.java**" and Click on "**Run As a Java Application**"

<img width="867" alt="Screenshot 2021-07-27 at 9 18 36 PM" src="https://user-images.githubusercontent.com/49311090/127160505-0709ed8d-d3bf-4bee-be76-124ff0a35f4f.png">

2) The Output should be shown as below-

<img width="603" alt="Screenshot 2021-07-27 at 9 21 18 PM" src="https://user-images.githubusercontent.com/49311090/127160861-2a851144-1f5c-4509-8012-246cd2d95a8e.png">


**II. RUNNING AS A SPRING BOOT RESTful Service**

1) Right Click on "**com.singtel.animalservice.AnimalserviceApplication.java"** and Click on "**Run As a Java Application**"

<img width="842" alt="Screenshot 2021-07-27 at 9 23 31 PM" src="https://user-images.githubusercontent.com/49311090/127161371-2ea53e5f-d45f-4b21-91d5-16682dbd1f03.png">

2) Below Output should show in the console once the Spring Boot REST service is successfully started

<img width="1241" alt="Screenshot 2021-07-27 at 9 25 44 PM" src="https://user-images.githubusercontent.com/49311090/127161591-b9834319-7fbb-47da-8116-bcc1c7881543.png">

3) Now Open up Postman Console , or we browser and query the animals using this service as below

**List of All Animals**
http://localhost:8080/animals

<img width="1139" alt="Screenshot 2021-07-27 at 9 27 02 PM" src="https://user-images.githubusercontent.com/49311090/127162612-6ce85ab2-6a9d-4225-9f86-74bcd2dc22cf.png">

**A NORMAL DUCK**

http://localhost:8080/animals/duck

<img width="564" alt="Screenshot 2021-07-27 at 9 27 19 PM" src="https://user-images.githubusercontent.com/49311090/127162646-24f0cbb2-425b-43b4-97b9-e740e17cbd85.png">


**PARROT LIVING WITH A DOG**
http://localhost:8080/animals/parrot/dog

<img width="506" alt="Screenshot 2021-07-27 at 9 28 11 PM" src="https://user-images.githubusercontent.com/49311090/127162719-3f6cc047-f09d-4f25-b212-1256f47b6c73.png">


**PARROT LIVING WITH ROOSTER**
http://localhost:8080/animals/parrot/rooster

<img width="549" alt="Screenshot 2021-07-27 at 9 28 27 PM" src="https://user-images.githubusercontent.com/49311090/127162800-3522e655-baff-40db-bd88-efd4da1ff69d.png">


**NORMAL BUTTERFLY**
http://localhost:8080/animals/butterfly

<img width="592" alt="Screenshot 2021-07-27 at 9 28 54 PM" src="https://user-images.githubusercontent.com/49311090/127162859-6d754a35-3c1b-49c2-bfa6-d04c3e672f5c.png">


**BUTTERFLY MORPHED AS A CATERPILLAR**
http://localhost:8080/animals/butterfly/caterpillar

<img width="558" alt="Screenshot 2021-07-27 at 9 29 23 PM" src="https://user-images.githubusercontent.com/49311090/127162968-2d1fe32e-3ea8-4982-af0c-b0fcf54b6b46.png">


**A NORMAL ROOSTER**
http://localhost:8080/animals/rooster

<img width="453" alt="Screenshot 2021-07-27 at 9 27 49 PM" src="https://user-images.githubusercontent.com/49311090/127163002-c10c836b-29b9-4caa-ac04-6bb59dd41f2d.png">



**A FRENCH SPEAKING ROOSTER**
http://localhost:8080/animals/rooster/French

<img width="542" alt="Screenshot 2021-07-27 at 9 31 12 PM" src="https://user-images.githubusercontent.com/49311090/127163100-01e7f300-cfdd-4cff-b778-90cc5d816c45.png">


**A RUSSIAN SPEAKING ROOSTER**
http://localhost:8080/animals/rooster/Russian

<img width="582" alt="Screenshot 2021-07-27 at 9 31 35 PM" src="https://user-images.githubusercontent.com/49311090/127163147-37a8f30c-3d9d-4266-a198-1105fbf1943c.png">

Additionally you can change the request to following languages and the sing attribute should respond accordingly
"English","Danish","Dutch","Finnish","French","German","Greek","Hebrew","Hungarian","Italian","Japanese","Portuguese","Russian","Swedish","Turkish","Urdu"









