# Bank Account Framework
Framework Development Lab
1) Design the class diagram to a banking system with the following Use cases:
• Create a personal account
• Create a Company account (checking or savings)
• Deposit money
• Withdraw money
• Add interest
• Generate a report of accounts
The user interface is that of the first frameworks homework (you can also re-use the UML from that
assignment).
The operations for each action are:
◦ When the add-interest button is pressed, the system adds interest to all accounts in the bank.
◦ When a deposit or withdrawal is done to a company account, the system sends the company an
Email about the transaction.
◦ When a deposit or withdrawal is done to a personal account, and the amount was larger than $500 or the resulting amount is negative, the bank sends the person an Email about the transaction.
◦ Customers can have more than one account. The bank system needs to keep track of the history of deposits and withdrawals.
The class diagram should show all classes, relationships, etc.
Include a sequence diagram for each of the major use cases (above).
2) Design the class diagram for a Credit-Card processing system with the following use cases:
   
  • Create a credit card account
  
  • Deposit money
  
  • Charge the account
  
  • Add interest
  
  • Generate monthly billing report
  
The user interface is that of the first frameworks homework (you can also re-use the UML from that assignment).
Based on those client specified interfaces, you should provide 3 types of credit cards, with different interest rates for each:
    
<img width="534" alt="Screenshot 2024-10-06 at 3 07 30 PM" src="https://github.com/user-attachments/assets/75493f85-6600-4abd-b698-1684b19aa194">

The operations for each action are:
When a card is charged for more than $400, the system sends the cardholder an email about the transaction.
Customers can have more than one credit card (account)
The system needs to keep track of the history of charges and payments. For every payment or charge, the system needs to store the date, name, and amount of the transaction.

Frameworks Project (Lab 1)
◦ The monthly billing report (generated from the monthly report button) should show:
- previous balance: balance from last month
- total charges: total of all charges for this month
- total credits: total of all payments for this month
- new balance = previous balance – total credits + total charges + MI * (previous balance – total credits)
- total due = MP * new balance
◦ When a deposit or withdrawal is done to a company account, the system sends the company an Email about the transaction.
◦ When a deposit or withdrawal is done to a personal account, and the amount was larger than $400 or the resulting amount is negative, the bank sends the person an Email about the transaction.
◦ Customers can have more than one account. The bank system needs to keep track of the history of deposits and withdrawals.
The class diagram should show all classes, relationships, etc.
Include a sequence diagram for each of the major use cases (above).

3) Design a Framework for both of these applications.
The framework should abstract out all of the common operations between these two applications, and others that would be similar in nature. The evaluation criteria for the project will be how well you have captured common parts of the intended application domain(s) in the framework, and it's internal design via patterns.
For the framework design, use the account pattern, the party pattern, and the observer pattern.
We will call the framework the observable party account.

5) Implement the Framework.
Put the code into three packages;
• framework
• banking
• creditcard

7) Implement the Banking Application using the Framework.

8) Implement the Credit Card Application using the Framework.

9) First implement the basic framework, and test for the two applications.

For each sub-system, you should hand-in documentation including:
• the UML design diagrams
• descriptions of the patterns used, and the role that they play in the solution
• A description of the plug points of the framework, and how it could be used for other applications.
• Sequence diagrams for the major use-cases for one of the applications.

**Extra Credit**

10) Add the ability to have general rules associated with various account or transaction objects. Use the rules
pattern discussed in class.
 Cs525: Project 2

Frameworks Project (Lab 1)

There are several other good references, do some net-searching to research it.

9) Migrate the framework from a white-box to a black/gray-box architecture.

a) first add several internal objects which would be typical elements to compose an application

b) Then provide external hook-methods to compose from them

11) Add persistence for the database. You should use a façade pattern to hide the details of the persistence mechanism.

12) Add a third application from the framework. Consider what candidate applications could be a good match. Consider a retail application (e.g. bookstore). If the framework needs significant extensions to do this, consider a second framework, a retail management framework.
    
a) How should you create this from the first framework?
Are they co-frameworks, or does the retail framework encapsulate the billing framework? 12) Add a visual composition method to create applications from the framework. [Very advanced!]
a) Design such an application, it's components, and use cases, and architecture (and patterns used).
b) Implement it.
Cs525: Project 3

Frameworks Project (Lab 1)
 References
 
• For a reference on the rule pattern, see:
http://www.mum.edu/cs_dept/aarsanjani/oopsla2000/Rule Object Pattern Language7 (??) • A Pattern Language for Adaptive and Scalable Business Rule Construction, Ali Arsanjani
Business rules tend to change more frequently than the rest of the business object with which they are associated. These rules are typically implemented within the rule methods of a business object. Rules also refer to other business objects that their encompassing business object associates with; creating a web of implicit and increasingly un-maintainable dependencies. This pattern language provides a set of patterns that address the increasing need for handling scalability, adaptability and complexity.
http://www.cbdiforum.com/downloads/ruleobject.zip

• Rule Object: A Pattern Language for Pluggable and Adaptive Business Rule Construction, Pattern Languages of Programming 2000
http://jerry.cs.uiuc.edu/~plop/plop2k/proceedings/Arsanjani/Arsanjani.pdf

• Analysis, Design, and Implementation of Distributed Java Business Frameworks Using Domain Patterns, Proceedings of Tools '99 (IEEE Computer Society Press1999), pp. 490-500
http://www.computer.org/proceedings/tools/0278/02780490abs.htm

• Other Ali references: http://www.mum.edu/cs_dept/aarsanjani/aarsanjani_ref.html
     Cs525: Project 4

13) Add the ability to have general rules associated with various account or transaction objects. Use the rules
pattern discussed in class.

a) add a rule for CCards: if a purchase is more than twice the average amount of other purchases, send a
fraud alert letter to the customer.

b) add a bank rule: Individual bank clients must keep a balance of at least $400, or else pay a monthly fee or $10. (auto-deduct from their account.)

15) Add a third application to your framework, it should be an online bookstore. The requirements are:
    
a) You should have three categories of products, books and videotapes.
b) Customers can pay by creditCard, or online (PayPal).
c) You should track the number of successful sales to each customer, and have a category of premium customer (more than 10 purchases).
d) Premium customers get a 10% discount on all books.

## Outcome

<img width="751" alt="Screenshot 2024-10-06 at 3 20 47 PM" src="https://github.com/user-attachments/assets/24ff6ebf-b648-4e6c-92d6-65c7ef15a8d5">

### Coding High Level Design

<img width="662" alt="image" src="https://github.com/user-attachments/assets/071ecbb1-2182-48ae-b642-4edbc541f26d">

### Class Diagram

<img width="755" alt="image" src="https://github.com/user-attachments/assets/9da7fcbc-44a3-4235-b0ab-da896c00f06f">

### Class Diagram - Core Framework

<img width="368" alt="image" src="https://github.com/user-attachments/assets/f80fbabc-e49e-46ce-b80c-19f41a12bac8">

### Class Diagram - Data persistent

<img width="578" alt="image" src="https://github.com/user-attachments/assets/9f075a97-4aff-427b-a39c-ff8c319377c7">

### Class Diagram - Banking system

<img width="408" alt="image" src="https://github.com/user-attachments/assets/c372e4d4-a7fc-48f8-8e69-b8f83bad777a">

### Class Diagram - Credit Card system

<img width="579" alt="image" src="https://github.com/user-attachments/assets/0d56f103-7977-4935-bf22-41131adeb3c4">

### Sequence Diagram - Create banking account 

<img width="961" alt="image" src="https://github.com/user-attachments/assets/96cc39e6-7ec6-47c7-bd05-5b1d73db3541">

### Sequence Diagram - Deposit use case 

<img width="962" alt="image" src="https://github.com/user-attachments/assets/b6fe0c45-7140-4593-9f86-9530c429049d">

### Sequence Diagram - Withdraw use case 

<img width="961" alt="image" src="https://github.com/user-attachments/assets/c805e528-10e4-4eba-b7c5-8f67cf857e36">

### Sequence Diagram - Add Interest use case 

<img width="960" alt="image" src="https://github.com/user-attachments/assets/ef998a46-e1c4-47d6-a96a-3eb66c589fc8">


<img width="440" alt="Screenshot 2024-10-06 at 3 31 42 PM" src="https://github.com/user-attachments/assets/029443cb-71d5-4509-8aa1-3d7bf0591d5d">

### Command Pattern

<img width="800" alt="image" src="https://github.com/user-attachments/assets/1669d0c8-d4bb-4ab8-ac10-8a44f7006dc9">

### Rules Pattern

<img width="914" alt="image" src="https://github.com/user-attachments/assets/6cfa2df5-6295-4843-bd0a-8d9956af2b77">

### Singleton Pattern

![image](https://github.com/user-attachments/assets/3c9513f1-d52a-40af-85dd-47333a2592b3)

### Strategy Pattern

<img width="703" alt="image" src="https://github.com/user-attachments/assets/c6f5d974-f7a6-4814-a8aa-2d2c9312a5db">

### Abstract Factory Pattern

<img width="555" alt="image" src="https://github.com/user-attachments/assets/7dfc4497-daec-42a0-af7a-66a7b0399bc6">

### Observer Pattern

<img width="766" alt="image" src="https://github.com/user-attachments/assets/2271bf36-0464-458e-9a69-d1dec28b8981">

### Facade Pattern

<img width="719" alt="image" src="https://github.com/user-attachments/assets/b1887395-9e67-4225-8f2b-1dd167656b3f">







