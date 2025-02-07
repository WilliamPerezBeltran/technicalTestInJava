
## Part 2: Test Scenarios

### Test Scenario 1: Create a car entry with valid data
**Input:** 
```json
{
    "model": "Honda Civic",
    "year": 2020
}
```

**Expected Output:** 
```json
{
    "id": 1
}
```

### Test Scenario 2: Retrieve car details with valid ID
**Input:** GET /cars/1

**Expected Output:**
```json
{
    "model": "Honda Civic",
    "year": 2020
}
```

### Test Scenario 3: Retrieve car details with invalid ID (non-existent car)
**Input:** GET /cars/999

**Expected Output:** 
HTTP Status: 404 Not Found

### Test Scenario 4: Create car entry with invalid data (missing model)
**Input:** 
```json
{
    "year": 2020
}
```

**Expected Output:** 
HTTP Status: 400 Bad Request

### Test Scenario 5: Create car entry with invalid data (year before 1886)
**Input:** 
```json
{
    "model": "Old Timer",
    "year": 1800
}
```

**Expected Output:** 
HTTP Status: 400 Bad Request (Year must not be less than 1886)
```

