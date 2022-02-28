class Result 
{
    public static void checkMagazine(List<String> magazine, List<String> note) 
    {
        int flag=0;
        TreeMap<String,Integer> word_cound = new TreeMap<>();
        int i=0;
        for(i=0;i<magazine.size();++i)
        {
            if(!word_cound.containsKey(magazine.get(i)))
            {
                word_cound.put(magazine.get(i),1);
            }
            else
            {
                word_cound.put(magazine.get(i), word_cound.get(magazine.get(i))+1);
            }
        }
        for(i=0;i<note.size();++i)
        {
            if(word_cound.containsKey(note.get(i)) && word_cound.get(note.get(i))>0)
            {
                word_cound.put(note.get(i), word_cound.get(note.get(i))-1);
            }
            else
            {
                flag=1;
                System.out.println("No");
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("Yes");
        }
    }
}
