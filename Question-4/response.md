
# Question 4

## Code Review Feedback

I would reject this pull request due to multiple security and code quality issues. First, there is a major security risk in logging sensitive data, as the code logs both the username and password in plain text. This should be removed entirely, and only the username should be logged if necessary. Additionally, the password is being compared using !=, which is incorrect since passwords should be securely hashed and compared using a function like BCrypt.checkpw().

From a code quality perspective, there are spelling errors in method and variable names, such as checkCredendials() instead of checkCredentials(), which can reduce code readability. Moreover, there is a potential NullPointerException if get_login_form_input() returns null, which should be handled properly before accessing properties. Exception handling is also inconsistent, as error messages for invalid credentials expose whether the username exists or not, which could be exploited by attackers. A more secure approach would be to return a generic error message like "Invalid username or password".

To address these issues, the PR should be rejected until proper security measures are implemented, such as using BCrypt for password storage, fixing exception handling, and improving method and variable naming. Sensitive logging should be removed entirely to protect user data.


### Decision: **Reject**

### Issues and Suggested Fixes:

1. **Security Issue: Logging Sensitive Information**  
   - The method logs the user's password in plain text, which is a serious security vulnerability.  
   - **Fix:** Remove logging of credentials or replace it with masked information (`LOGGER.info("User {} logged in", credentials.username);`).  

2. **Incorrect Password Comparison**  
   - The password is being compared using `!=`, which may lead to security issues if passwords are stored securely (e.g., hashed).  
   - **Fix:** Use a secure method like `BCrypt.checkpw(credentials.password, user.getPasswordHash())`.  

3. **Incorrect Exception Handling and Spelling Errors**  
   - The method throws `LoginFailedException` but does not handle it properly. Also, `"Invalid username"` and `"Invalid Password"` messages are inconsistent in format.  
   - **Fix:** Use proper spelling (`"Invalid username"` instead of `"invalid username"`) and consider returning error responses instead of throwing exceptions directly.  

4. **Incorrect Method Name and Variable Name**  
   - The method name `checkCredendials()` is misspelled; it should be `checkCredentials()`.  
   - The variable `credendials` is also misspelled; it should be `credentials`.  

5. **Potential NullPointerException**  
   - If `get_login_form_input()` returns `null`, accessing `credentials.username` will throw a `NullPointerException`.  
   - **Fix:** Add a null check before using `credentials`.  

### Summary:
- **Reject** the pull request due to security risks and code quality issues.  
- Recommend fixes for logging, password handling, exception handling, and spelling errors.  
