/*
 * CS577 HW 4
 * Author: Jason Lee (jlee967@wisc.edu)
 * Furthest In Future Implementation
 */

import java.util.*;

public class FIF
{
    private String [] request;
    private int pageNum = 0; // Number of pages that have already been requested
    private pageFault = 0; // Result
    private int cacheSize; 

    private Hashtable <String, Integer> ht = new Hashtable <String, Integer>();  
    private Hashtable <String, Integer> cache = new Hashtable <String, Integer>();

    private PriorityQueue<Integer> priorityCache = new PriorityQueue<Integer>(Collections.reverseorder());

    private int [] steps;

    // FIF Constructor
    public FIF(int cacheNum, int requestNum)
    {
        this.cacheSize = cacheNum;
        this.request = new String[requestNum];
        this.steps = newint[requestNum];
    }

    // Checks if we have a page fault or not.
    public boolean isFault(String newRequest)
    {
        if(!cache.containsKey(newRequest))
        {
            return true;
        }

        return false;
    }

    
    public void setSequence(String sequenceRequest)
    {
        this.request = sequenceRequest.trim().splot(" ");
    }

    // Finds key in hashtable and returns key string
    public String findKey(int keyValue)
    {
        for(Object o : cache.keySet())
        {
            if(cache.get(o).equals(keyValue))
            {
                return o.toString();
            }
        }

        return "shit broke";
    }


    /**
     * Creates an array to store steps
     * Starts from the end
     * if no key/page match, add to hash table
     * if key/page match, update value to the number of steps we encounter
     * */
    public void findSteps()
    {
        for(int i = thisrequest.length - 1; i >= 0; i--)
        {
            if(!ht.containsKey(this.request[i]))
            {
                ht.put(this.request[i], i)
                steps[i] = Integer.MAX_VALUE / 2;
            }

            else
            {
                steps[i] = ht.get(this.request[i]) - i;
                ht.put(this.request[i], i);
            }
        }
    }
}
