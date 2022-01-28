import java.util.*;
class Pair
{
    int luck;
    int importance;
    Pair(int l,int i)
    {
        luck=l;
        importance=i;
    }
    public int getluck()
    {
        return luck;
    }
    public int getimp()
    {
        return importance;
    }
} 
public class Pair_type_sort
{
    public static int luckBalance(int k, List<List<Integer>> contests) 
    {
        ArrayList<Pair> sort_contest = new ArrayList<>();
        int i;
        int total_luck=0;
        for(i=0;i<contests.get(0).size();++i)
        {
            sort_contest.add(new Pair(contests.get(0).get(i),contests.get(1).get(i)));
        }
        Collections.sort(sort_contest, Comparator.comparing(Pair::getluck).reversed().thenComparing(Pair::getimp));
        for(i=0;i<sort_contest.size();++i)
        {
            System.out.println(sort_contest.get(i).getluck()+" "+sort_contest.get(i).getimp());
        }
        for(i=0;i<sort_contest.size();++i)
        {
            if(sort_contest.get(i).getimp()==0)
            {
                total_luck+=sort_contest.get(i).getluck();
            }
            else
            {
                if(k>0)
                {
                    total_luck+=sort_contest.get(i).getluck();
                    --k;
                }
                else
                {
                    total_luck-=sort_contest.get(i).getluck();
                }
            }
        }
        return total_luck;
    }

    public static void main(String[] args)
    {
        //contests.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
        List<List<Integer>> contest = new ArrayList<>();
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        s1.add(5);s2.add(1);
        s1.add(4);s2.add(0);
        s1.add(6);s2.add(1);
        s1.add(2);s2.add(1);
        s1.add(8);s2.add(0);
        contest.add(s1);
        contest.add(s2);
        int i;
        // for (i = 0; i < contest.get(0).size(); i++) 
        // {
        //     System.out.println(contest.get(0).get(i)+" "+contest.get(1).get(i));    
        // }
        System.out.println(Pair_type_sort.luckBalance(2, contest));
    }
}
