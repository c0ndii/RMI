from zeep import Client


wsdl_url = 'http://localhost:8080/Zad1/HelloWorldImplService?WSDL'
client = Client(wsdl=wsdl_url)
response = client.service.getHelloWorldAsString("Python Client")

print("Service response:\n", response)
products = client.service.getProducts()
print("Products:")
for p in products:
    print(f"- {p['name']} | {p['description']} | {p['price']} pln")
