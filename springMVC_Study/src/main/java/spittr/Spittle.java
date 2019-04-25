package spittr;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longitude;
    public Spittle(String message,Date time){
        this(message,time,null,null);
    }
    /**
     * description:构造器
     *
     * @param message 消息内容
     * @param time 时间戳
     * @param longitude Spittle发布对应的经纬度
     * @param latitude 同上
     * @return
     */
    public Spittle(String message,Date time,Double longitude,Double latitude){
        this.id=null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }
    public long getId(){
        return id;
    }
    public String getMessage(){
        return message;
    }
    public Date getTime(){
        return time;
    }
    public Double getLongitude(){
        return longitude;
    }
    public Double getLatitude(){
        return latitude;
    }
    @Override
    public boolean equals(Object that){
        return EqualsBuilder.reflectionEquals(this,that,"id","time");
    }
    @Override
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }
}
