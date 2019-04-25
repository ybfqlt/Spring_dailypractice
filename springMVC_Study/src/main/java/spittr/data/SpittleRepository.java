package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * description:这是一个能获取spittle列表的Repository
 *
 */
public interface SpittleRepository {
    List<Spittle> findRecentSpittles();
    /**
     *
     * @param max 返回的Spittle中,Spittle ID属性的最大值
     * @param count 表明要返回多少个Spittle对象
     * @return java.util.List<spittr.Spittle>
     */
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
    void save(Spittle spittle);
}
