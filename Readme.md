This is an basic example of a service
dummy-person-crud-domain
which is registered at the
'eureka-server'
and proxied by the
zuul-proxy-server

You can run as much instances of the service as you want.
All are randomly used. If you turn of one instance, this one instance
will produce errors because eureka will not directly throw away this instance.


