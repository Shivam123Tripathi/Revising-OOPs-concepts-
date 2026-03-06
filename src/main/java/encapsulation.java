//Encapsulation -> hiding data using private,expose it via getters/setters.
//This protects internal state.
//For example in ATM Machine you can't do account.balance = 1000000
//Bank hides balance variable so instead they givee functions:-
//deposit(),  withdraw(), checkBalance()



    class BankAccount{
        private double balance;//nobody can access it directly variable is  private:: only allowed through methods.

        public void deposit(double amount){
            if(amount > 0) balance += amount;
        }
        public double getBalance(){
            return balance;
        }

        public class Main{
            public static void main(String[] args) {
                BankAccount acc = new BankAccount();

                acc.deposit(500);

                System.out.println(acc.getBalance());
            }
        }
    }

