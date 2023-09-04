import java.util.List;

public class Scramble {
    public static String scrambleWord(String input){
        String output = "";
        if(input.length() < 2) return input;
        for(int i = 0; i < input.length()-1; i++){
            if(input.charAt(i) == 'A' && input.charAt(i + 1) != 'A'){
                output = output + input.charAt(i+1);
                output = output + input.charAt(i);
                i++;
            }
            else output += input.charAt(i);
            if(i == input.length()-2){
                output += input.charAt(i+1);
            }
        }
        return output;
    }

    public static List<String> scrambleOrRemove(List<String> input){
        for(int i = 0; i < input.size(); i++){
            if(!scrambleWord(input.get(i)).equals(input.get(i))){
                input.set(i, scrambleWord(input.get(i)));
            }
            else {
                input.remove(i);
                i--;
            }
        }
        return input;
    }
}