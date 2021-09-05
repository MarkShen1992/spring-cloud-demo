# spring-cloud-demo
This project is a demo project which introduces how to use spring cloud. First of all, this project can achieve service discovery via Eureka. What’s more, you can read this article to understand the principle of Eureka.

Next, I am going to introduce how to do that. Before that, I will introduce the role of the current system. There are 3 roles, eureka-server, provider service and consumer service.

Eureka provides the service register and discovery functions. Provider service can register service name and service endpoint info to eureka. Meanwhile, consumer service also registers service name and service endpoint info to eureka. In this project, consumer service will call the provider service, but this call is not direct. Because consumer service doesn’t know the endpoint info of provider service. At this moment, provider service needs to register related info including service name and service endpoint info to the eureka server first. And then the consumer service gets the endpoint of provider service info from the eureka server rather than configure from the service configuration file. It’s a very good way.

### Reference
- https://www.studytonight.com/post/service-discovery-using-eureka-in-spring-microservices
- https://github.com/Netflix/eureka/wiki/Eureka-at-a-glance