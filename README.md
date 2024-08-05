# spring-security-demo
Spring Security 6

Major change in the Spring Security 6 is the removal of WebSecurityConfigurerAdapter class. 
This class was previously used to customize the security configuration. 
In Spring Security 6, we should now define the SecurityFilterChain bean and configure the HTTP security using HttpSecurity DSL.

#### Endpoints:

/login
/public/welcome/{name}
/public/welcome
/user/{name}
/admin