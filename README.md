# memorizer-backend
This is the backend of Memorizer


## To run the application 
1. First create .env file in root of your project with below values
    ```SPRING_DATASOURCE_URL=your_url```
    ```SPRING_USERNAME=your_username```
    ```SPRING_PASSWORD=your_password```
2. Then run the below command to make these value as environment values, 
    ```export $(cat .env | xargs)```