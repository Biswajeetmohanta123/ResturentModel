<center>
<h1> Restaurant Model SYSTEM </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a Restaurant Model system built using Spring Boot with Java.

---

## Framework Used

- Spring Boot

---

## Language Used

- Java

---

## Data Model

The Restaurant model is defined in the Restaurant class, which has the following attributes:

```
restaurantId : unique identifier for each restaurant
restaurantName : name of the restaurant
address : address of the restaurant
number : number of the restaurant
specialty : specialty of the restaurant
total_staff : it define total number of staff in the restaurant
```

---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-

</br>
<b> Add Restaurant </b>

- PostMapping: /addrestaurant

```
This endpoint makes a call to method in restaurantService class which is connected to database. In database we add a new user given through API.
```

- GetMapping: /getAllRestaurant

```
This endpoint makes a call to method in restaurantService class which retrieves data of all restaurant from database. This data is sent to controller which is then sent through the API to client.
```

- GetMapping: "getrestaurant/{restaurantId}"

```
This endpoint returns data of specific restaurant based on restaurantId through API
```

- PutMapping

```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we update a restaurant by restaurantId given through API.
```

- DeleteMapping

```
This endpoint makes a call to method in RestaurantService class which is connected to database. In database we delete a restaurant by restaurantId given through API.
```

---

## Data structure Used

- ArrayList

```
We have used ArrayList data structure as a database to implement CRUD Operations
```

---

## Project Summary

The RestaurantModel System is a Spring Boot project written in Java that enables basic functionality for managing Restaurant. This project is built using the Spring Boot framework, which is a popular open-source framework for building production-ready applications. The project uses ArrayList as the data structure to store and manage Restaurant data.

The project includes four main components, the RestaurantController, the RestaurantService, the ResturantRapo, and the Restaurant class. The RestaurantController class receives requests from the restaurant interface layer and delegates them to the RestaurantService. The RestaurantService processes the request and retrieves or updates data from the ResturantRapo. The ResturantRapo uses an ArrayList data structure to store and manage Restaurant data, and the Rasturant class defines the restaurant data model.
