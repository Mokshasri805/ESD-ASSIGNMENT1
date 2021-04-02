class TruthTable
{
 public void halfAdderTable()
    {
        boolean a,b,s,cr;
        int x,y,sum,carry;
        System.out.println(" x | y | c | s ");  System.out.println("---|---|---|---"); // TRUTH TABLE HEADER
        for(x=0;x<2;x++){
            for(y=0;y<2;y++){
                a=(x==0)?false:true;    b=(y==0)?false:true; // INITIALIZING BOOLEAN VALUES IN BINARY FORM
                s=!a&&b||a&&!b;     cr=a&&b; // FULL ADDER SUM AND CARRY CHECK OPERATION
                sum=(s==false)?0:1;     carry=(cr==false)?0:1; // CONVERTING BOOLEAN SUM AND CARRY TO INTEGERS
                System.out.println(" "+x+" | "+y+" | "+carry+" | "+sum); // PRINTING EACH LINE OF TRUTH TABLE
            }
        }
    }
    public static void main(String args[])
    {
        TruthTable obj=new TruthTable();
        System.out.println("\nHalf Adder Truth Table\n");  obj.halfAdderTable();
    }
}