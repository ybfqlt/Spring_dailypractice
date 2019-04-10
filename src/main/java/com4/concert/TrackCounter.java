package com4.concert;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

public class TrackCounter {
    private Map<Integer,Integer> trackCounts = new HashMap<Integer,Integer>();
    @Pointcut("execution(* CompactDisc.playTrack(int))"+"&& args(trackNumber)")//args()定制join-point去匹配那些参数为指定类型的方法的执行动作
    public void trackPlayed(int trackNumber){}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCount = getPlayCount(trackNumber);
        trackCounts.put(trackNumber,currentCount+1);
    }
    public int getPlayCount(int trackNumber){
        return trackCounts.containsKey(trackNumber)?trackCounts.get(trackNumber):0;
    }
}
