Spring Boot – Day 11: 
Deep Dive into DispatcherServlet & Spring Core Annotations 🔍⚙️

Today was all about unlocking the internal working of Spring Boot and Spring MVC — going beyond coding and understanding what actually powers the framework from the inside.

🧠 What I Learned:

🔹 DispatcherServlet – The Front Controller of Spring MVC
I explored how the DispatcherServlet acts as the central hub that intercepts every HTTP request and delegates it to the right component:

Finds the appropriate controller using HandlerMapping

Invokes controller logic and receives ModelAndView

Passes view name to the ViewResolver

Finally, renders the response back to the browser

Understanding this request lifecycle gave me deeper clarity on how Spring handles web requests behind the scenes — it’s structured, optimized, and scalable.

🔹 Mastered Spring Stereotype Annotations
I learned the purpose and use of:

@Controller

@RestController

@Service

@Repository

@Component

@Configuration

While many of these internally work similarly (registering classes as beans), they exist to bring clarity, structure, and intention to the code — making large-scale development more maintainable and understandable.

🔹 Efficient Bean Management with @Configuration + @Bean

Learned how to manually define beans using @Bean inside a @Configuration class

These beans are created eagerly at application startup, leading to faster execution compared to lazy object creation

Ideal for defining and reusing objects method-wise or class-wise across the application
