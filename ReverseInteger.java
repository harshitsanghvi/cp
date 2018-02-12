class ReverseInteger {
    public int reverse(int x) {
        Queue<Integer> q = new LinkedList<Integer>();
        String reverse = "";
        
        if (x == 0)
            return 0;
        
        if (x >= Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
            return 0;
        
        if (x < 0) {
            x = Math.abs(x);
            reverse = "-";
        }
        
        while(x > 0){
            q.add(x % 10);
            x = x/10;
        }
        
        while (!q.isEmpty()){
            String temp = q.remove().toString();
            
            reverse = reverse + temp;
        }
        Integer result;
        try {
            result = Integer.parseInt(reverse);        
        } catch (NumberFormatException e) {
            return 0;
        }
            
        return result;
    }
}
