import java.util.*;

public class B2_Encode_Decode_String {

	public static String encode(List<String> strs) {
        StringBuffer res = new StringBuffer();
        for(String s : strs){
            int n = s.length();
            res = res.append(n+"#"+s);
        }
        String sol = new String(res);
//        System.out.println(sol);
        return sol;
    }

    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        // System.out.println(str+" "+str.length());
        // if(str.length()==2){System.out.println("hell"); return new ArrayList<>(Arrays.asList(""));}
        
        StringBuffer lenStr = new StringBuffer();
        int i=0; 
        int len=-1;

        while(i < str.length()){
            if(len!=-1){
                StringBuffer tmp=new StringBuffer();
                int j=0;
                for(j=i;j<(i+len);j++){
                    tmp.append(str.charAt(j));
                }
                res.add(new String(tmp));
                len=-1;
                lenStr.setLength(0);
                i=j;
                continue;
            }
            if(Character.isDigit(str.charAt(i))){
                lenStr.append(str.charAt(i));
            }
            if(str.charAt(i)=='#' && lenStr.length()!=0){
                len = Integer.parseInt(lenStr.toString());
                if(len==0){
                    res.add("");
                    len=-1;
                    lenStr.setLength(0);
                }
//                System.out.println(str+" ,(i,len) : "+i+" ,"+len+" ");
            }
            i++;
        }
        return res;
    }
    
    
	public static void main(String[] args) {
		
		List<String> arr = new ArrayList<>(Arrays.asList("neet","","  ","code","love","","you"));
		String encodeString = encode(arr);
		System.out.println(encodeString+" "+decode(encodeString));

	}

}
