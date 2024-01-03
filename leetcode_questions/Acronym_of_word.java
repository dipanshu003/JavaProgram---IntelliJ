package leetcode_questions;

import java.util.ArrayList;
import java.util.List;

public class Acronym_of_word {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Acronym_of_word a = new Acronym_of_word();
        list.add("alice");
        list.add("bob");
        list.add("charlie");
        String s = "";
        System.out.println(a.isAcronym(list,s));

    }

    public boolean isAcronym(List<String> words, String s) {

        for (String l : words)
        {
            char ch=l.charAt(0);
            s = s + ch;
        }
        if (s.charAt(0) == s.charAt(1))
        {
            return false;
        }
        return true;
    }
}
