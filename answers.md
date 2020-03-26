ACT 3
1 ►

public static String flip()
{
    Random rand = new Random();
    int num = rand.nextInt(2);
    String ht = (num == 0) ? "tails" : "heads";
    return ht;
}

2 ►

public static boolean arePermutations(int[] a, int[] b)
{
    boolean sameWithPerm = true;
    boolean sameInLoop = false;

    for (int i = 0; i < a.length; i++)
    {
        sameInLoop = false;
        for (int j = 0; j < b.length; j++)
        {
            if (a[i] == b[j])
            {
                sameInLoop = true;
            }
        }
        if (!sameInLoop)
        {
            sameWithPerm = false;
        }
    }

    return sameWithPerm;
}

3 ►  0 1 1 so... 1234 to 4231 to 4321 to 4321

