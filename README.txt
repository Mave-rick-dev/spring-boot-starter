git log: Initial commit
Flow:
- localhost:8080/hello/
- initial endpoint: /hello
- second endpoint(get): /
Implementation:
- SpringBootStarterApplication.java


git log: Implements MVC pattern
Flow:
- Controller redirects to the corresponding Service
- Service, an Interface defines the abstract action
- Implementation of the action is defined in ServiceImpl
- ServiceImpl executes the action required i.e. printing greetingTxt+name