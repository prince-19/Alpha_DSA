// Get ith bit
// Set ith bit

// NOTE: Indexing will start form 0 


public class Get_ith_Bit{

    // to get i th  bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0; 
        }else{
            return 1;
        }
    }

    // to set i th bit 
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // to clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    // update ith bit with the given new bit
    public static int updateIthbit(int n, int i, int newBit){
       /*can be used*/
        // if(newBit == 0){
        //    return clearIthBit(n, newBit);
        // } else{
        //     return setIthBit(n, newBit);
        // }

        /*if it is told that we shoudl make without using the setIthBit funciton */
        n = clearIthBit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    //Clear last "i" bits
    public static int clearLastIbits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));

        System.out.println(setIthBit(13, 2));

        System.out.println(clearIthBit(10, 1));

        System.out.println(clearLastIbits(15, 2));
    }
}