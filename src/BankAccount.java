public abstract class BankAccount implements Taxable,Transactable{

    protected String name;
    protected int accnum;

    public String getName() {
        return name;
    }

    public int getAccnum() {
        return accnum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccnum(int accnum) {
        this.accnum = accnum;
    }

    public BankAccount (String name, int accnum){
        setAccnum(accnum);
        setName(name);
    }

    public BankAccount(){
        this.name = this.name;
        this.accnum = this.accnum;
    }



    public String toString() {
        return "Name: "+name+ "Account Number: "+accnum;
    }
}
