Server(192.168.1.107) start with cmd in server_victim/build.txt

Client(192.168.1.12) start with cmd in client_attacker/run.txt

1. Client -> Server
2. Server find Payload class from codebase address sent by Client
3. Server load Payload class and run the static code, which start clac.exe
4. Server return Payload to Client, Client run Payload and start calc.exe also