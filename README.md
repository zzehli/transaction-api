# Transaction API (WIP)
## Dev Environment
To start the API, set up the DB and start the server
## Set up DB: create sql database
start docker container. SSH into the container named `postgresdb`
```
docker container exec -it postgresdb bash
```
use `psql` client to create SQL tables with username `postgres`
```
psql -U postgres --file transactions_db.sql
```

## Start server
Use Intellij to run the java project

## Interact with `psql`
Go directly into psql with username `postgres` from host computer
```
docker container exec -it postgresdb psql -U postgres
```
If already in the docker, start psql with username `postgres`
```
psql -U postgres
```
Next, connect to transaction db:
```
\connect transactiontrackerdb
```
