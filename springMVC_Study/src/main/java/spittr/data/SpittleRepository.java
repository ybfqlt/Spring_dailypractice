package spittr.data;

import spittr.Spittle;

import java.util.List;

/**
 * ClassName    springMVC_Study-SpittleRepository
 * Description
 *
 * @author: ltt
 * @date: 19-4-21 下午10:36
 * @since: JDK 1.8
 */
public interface SpittleRepository {
    List<Spittle> findRecentSpittles();
    List<Spittle> findSpittles(long max, int count);
    Spittle findOne(long id);
    void save(Spittle spittle);
}
