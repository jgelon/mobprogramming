# Mob Programming - TA Guild
Mob programming (informally mobbing) is a software development approach where the whole team works on the same thing, at 
the same time, in the same space, and at the same computer. This is similar to pair programming where two people sit at 
the same computer and collaborate on the same code at the same time. With mob programming, the collaboration is extended 
to everyone on the team, while still using a single computer for writing the code and inputting it into the code base.

> The basic concept of mob programming is simple: the entire team works as a team together on one task at the time. 
That is: one team – one (active) keyboard – one screen (projector of course).

_Marcus Hammarberg, Mob programming – Full Team, Full Throttle_

## Theory
### Roles
- Driver is the person at the keyboard. No decisions allowed. 
- Navigators are the people off the keyboard. They are the ones doing the work by using their words to express intent
 the driver turns into action. 
- Designated Navigator is one navigator channeling the group to the driver. This role is often necessary when first
 starting to practice mob programming and dissolves later. 

### Rules
- **Rotate on timer**. Whoever is on the keyboard moves away and makes space for the next one. Timer is in scale of
 minutes. 
- **Yes, and**. Whatever we were doing when we rotated, we continue and improve. We don’t erase previous work. 
- **No decisions on the keyboard**. This is not a group watching one work. Whatever happens at the keyboard is initiated
 from navigators. 
- **Highest level of abstraction**. Navigate on highest level of abstraction driver can consume. Tell your intent as a
 navigator. If more is needed, you see it from the lack of movement at the keyboard. 
- **Bias to action**. Favor doing something and being ready to throw it away over discussing in length between options. 
- **Learning or contributing**. Everyone should be either learning or contributing, perhaps both. 
- **Kindness, consideration and respect**. We’re working closely together and we are all valuable contributors. Make space
 for everyone to learn and contribute
- **Google and external resources are allowed**


## Assignment
- Make a microservice exposing a RESTful API (json)
- Test the API with RestAssured
- Deploy the microservice to a Docker container

### CRUD application
- Design a domain object ‘Pizza’
- POST /pizzas to add a Pizza
- GET /pizzas to retrieve all Pizzas
- GET /pizza/{id} to retrieve a particular Pizza
- PUT /pizza/{id} to update a particular Pizza
- DELETE /pizza/{id} to delete a particular Pizza


- Design a domain object ‘Order’ 
- POST /placedorders to add an order, returns total price
- GET /profit returns selling price, and profit

### RestAssured
Test the application with RestAssured
`given().when().get("/pizzas").then().statusCode(200); `


### Docker
Run the application in Docker

#### Docker Commands
Container creation:
`docker build -t pizzacontainer`

Container start:
`docker run -p8080:8080 pizzacontainer`