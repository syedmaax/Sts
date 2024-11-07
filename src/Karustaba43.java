class Karustaba43 {
    public String multiply(String num1, String num2) {
        int [] arr = new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j = num2.length()-1;j>=0;j--){
                int mul = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int x = i+j;
                int y = i+j+1;
                int sum = mul+arr[y];
                arr[x]+=sum/10;
                arr[y]=sum%10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i:arr){
            if(!(sb.isEmpty() &&i==0)){
                sb.append(i);
            }
        }
        return sb.isEmpty() ?"0":sb.toString();
    }
}