public class moreMore
{
    public static void main(String[] args)
    {
        System.out.println(moreMore("rundm"));
        System.out.println(moreMore("thweekendaplus"));
        System.out.println(moreMore("aplusxyzaplus"));
        System.out.println(moreMore("apluaplus"));
        System.out.println(moreMore("pigs#apluscompsci#food"));
        System.out.println(moreMore("##catgiraffeapluscompsci"));
        System.out.println(moreMore("apluscatsanddogsaplus###"));
        System.out.println(moreMore("##"));
        System.out.println(moreMore("aplusdog#13337#pigaplusprogram"));
        System.out.println(moreMore("code#H00P#code1234"));
        System.out.println(moreMore("##wowgira77##eplus"));
        System.out.println(moreMore("catsandaplusdogsaplus###"));
        System.out.println(moreMore("7"));
    }
    
    public static String moreMore(String word)
    {
        if(word.indexOf("aplus") < 0 && word.length()%2 == 1)
        {
            return "a";
        }
        else if(word.indexOf("aplus") >= 0 && word.length()%2 == 0)
        {
            return "plus";
        }
        else if(word.indexOf("aplus") == 0 && word.lastIndexOf("aplus") == word.length()-5)
        {
            return "comp";
        }
        return "sci";
    }
}
