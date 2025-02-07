
# Question

## What additional information do you need before you begin coding this?

Since the implementation will be in Java using Spring Boot, I need the following additional information before I begin:

### Database and schema details
- What database will be used (PostgreSQL, MySQL, SQLite, store procedure.)?
- Will the id field be auto-incremental (with @GeneratedValue(strategy = GenerationType.IDENTITY)) or will a UUID be used?
- Will there be any additional fields in the Car entity other than model, year, and id?
- Are there any restrictions required, such as year not being less than 1886?

### Project Setup
- Will Spring Data JPA with Hibernate or manual SQL queries be used?
- Should Swagger/OpenAPI be configured for endpoint documentation?
- What API versioning will be used (e.g. /api/v1/cars)?

### Validations and error handling
- Should validation annotations like @NotBlank, @Size, @Min, @Max be applied on the Car entity?
- How will errors be handled if the id does not exist in the database? (Example: returning a 404 Not Found).
- Is authentication/authorization required for these endpoints (e.g. JWT, OAuth2)?
- Should access to the API be restricted to authenticated users only?
- If authentication is required, which method should be used (JWT, OAuth2, Basic Auth, API Keys)?
- Should different user roles have different permissions (e.g., admin can create cars, users can only retrieve them)?
- If OAuth2 is used, which provider will be integrated (Google, Okta, Auth0, Keycloak)?
- Should rate limiting or IP-based restrictions be implemented to prevent abuse?