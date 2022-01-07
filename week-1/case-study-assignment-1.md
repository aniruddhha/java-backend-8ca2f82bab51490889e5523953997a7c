## Case Study : Simple Banking System.
Following features has be implemented
1. Creation of Bank Account (ac_num pk, amount number, ac_hld_nm vc, ac_cre_dt date, status bool ) -> insert
2. Show All Bank Accounts -> select
3. Checking Balance for particular Bank Account -> select with where clause
4. Transferring money from one account to another account -> update
5. Withdraw Money from an Account -> update -> use txn
6. Deposit Money to the account -> update -> use txn
7. Deactivating the account -> update -> use txn
8. ReActivate the account -> update -> use txn

- You should see below menu in the beginning.
  1. Create Account 
  2. Show All Accounts 
  3. Display Balance 
  4. Transfer Money 
  5. Withdraw 
  6. Deposit
  7. Activate Account 
  8. DeActivate Account 
  9. Exit
  
### Hints
- there should be bank account table
- need to write unit test cases
- if you create UML Diagram would be given additional points
- Use of stream api will be recommended
