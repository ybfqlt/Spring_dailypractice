package spittr.config;
/*

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

*/
/**
 * @Author: ltt
 * @Date: 19-4-26 上午11:38
 * @since: JDK 1.8
 *//*


@Configuration
public class DataConfig {

    @Bean
    public DataSource dataSource(){
        return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).addScript("schema.sql").build();
    }

    @Bean
    public JdbcOperations jdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
*/
