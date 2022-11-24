class add{
    public static void main(String[]args){
        LinkedList<Integer> l1 = new LinkedList<>()
        l1.add(16)
        l1.add(7)
        int c;
        for(int i=0;i<2;i++){
             c += l1.get(i) 
        }
        println("sum is "+ c)
    }
}