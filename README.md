#
<img src="https://kubernetes.io/images/nav_logo.svg" width="200">
<img src="https://images.prismic.io/www-static/49aa0a09-06d2-4bba-ad20-4bcbe56ac507_logo.png" width="200">  
<img src="https://spring.io/images/spring-logo-9146a4d3298760c2e7e49595184e1975.svg" width="160">  

#


# Kubernetes deployment and micro-services spring boot for DigitalOcean

[![License](https://img.shields.io/badge/License-MIT-silver.svg?style=flat)](https://github.com/clips/pattern/blob/master/LICENSE.txt) 
[![License](https://img.shields.io/badge/Java-15-red.svg?style=flat)](https://github.com/clips/pattern/blob/master/LICENSE.txt) 
[![License](https://img.shields.io/badge/Spring-2.5.0-green.svg?style=flat)](https://github.com/clips/pattern/blob/master/LICENSE.txt) 
[![License](https://img.shields.io/badge/Kubernetes-1.20.2-blue.svg?style=flat)](https://github.com/clips/pattern/blob/master/LICENSE.txt) 
[![License](https://img.shields.io/badge/Swagger-3.0.0-green.svg?style=flat)](https://github.com/clips/pattern/blob/master/LICENSE.txt) 




Start deployment in bash
```sh
$ bash init.sh
```

result: 
```sh

service/app1 configured ✔
deployment.apps/app1 configured ✔
service/app2 configured ✔
deployment.apps/app2 configured ✔
ingress.networking.k8s.io/ingress-resource-backend configured ✔

```

or

```sh
$  kubectl apply -f ./k8s-deployments/deployments  --kubeconfig=./k8s-deployments/config/YOUR_CONFIG.yaml 
```


view pods:

```sh
$  kubectl describe ingress --kubeconfig=./k8s-deployments/config/YOUR_CONFIG.yaml 
```

List backend ingressed: 

```sh

Name:             ingress-resource-backend
Namespace:        default
Address:          45.55.105.172
Default backend:  default-http-backend:80 (...)
Rules:
  Host        Path  Backends
  ----        ----  --------
  *
              /            app1:80 (10.244.0.103:5678)
              /users       app1:80 (10.244.0.103:5678)
              /customers   app2:80 (10.244.0.29:5678)

```

Testing:

```sh
curl --location --request GET 'http://45.55.105.172/users'
```

```json
{
  "_links" : {
    "users" : {
      "href" : "http://45.55.105.172/users{?page,size,sort}",
      "templated" : true
    },
    "profile" : {
      "href" : "http://45.55.105.172/profile"
    }
  }

```


```sh
curl --location --request GET 'http://45.55.105.172/customers'
```


```json
{
  "_links" : {
    "customer_types" : {
      "href" : "http://45.55.105.172/customer_types{?page,size,sort}",
      "templated" : true
    },
    "customers" : {
      "href" : "http://45.55.105.172/customers"
    },
    "profile" : {
      "href" : "http://45.55.105.172/profile"
    }
  }
```


### INFO ###

* Autor: Gabriel Borges - Software architect
* Email: gabrielborges.web@gmail.com
* WhatsApp: +55 (62) 984887715
* Company: COFFEE DIGITAL 


