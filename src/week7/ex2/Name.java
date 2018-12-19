package week7.ex2;

public class Name {

    public String nickName(String name){

     Integer length = name.length();

     Integer position = length / 2;

     String nickname = name.substring(0, position);

     return nickname;
    }
}
