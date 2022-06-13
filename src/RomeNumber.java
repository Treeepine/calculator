 enum RomeNumber {
    I(1), V(5), X(10), L(50), C(100), D(500), M(1000);
    private int value;
    RomeNumber(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }

     public String getEnumByString(int code){
         for(RomeNumber e : RomeNumber.values()){
             if(e.getValue() == code){
                 return e.name();
            }
        }

         return null;
     }
}
