# Dev Environment

## create sql database
start docker container. SSH into the container named `postgresdb`
```
docker container exec -it postgresdb bash
```
use `psql` client to create SQL tables with username `postgres`
```
psql -U postgres --file transactions_db.sql
```

## start server