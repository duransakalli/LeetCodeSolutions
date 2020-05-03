import java.util.ArrayList;
import java.util.List;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList<Character>();
        
        for(char c : magazine.toCharArray())
        	list.add(c);

        for(char c : ransomNote.toCharArray()) {
        	if(list.contains(c))
        		list.remove(list.indexOf(c));
        	else
        		return false;
        }
        return true;
    }
}
