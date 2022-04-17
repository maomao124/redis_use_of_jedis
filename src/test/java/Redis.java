import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

/**
 * Project name(项目名称)：redis_jedis的使用
 * Package(包名): PACKAGE_NAME
 * Class(类名): Redis
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/17
 * Time(创建时间)： 12:22
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class Redis
{
    /**
     * The Jedis.
     */
    Jedis jedis;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp()
    {
        //创建一个对象
        jedis = new Jedis("127.0.0.1", 6379);
        System.out.println("创建连接");
        //密码
        jedis.auth("123456");
    }

    /**
     * Tear down.
     */
    @AfterEach
    void tearDown()
    {
        System.out.println("关闭连接");
        jedis.close();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1()
    {
        System.out.println(jedis.ping());
    }

    /**
     * Set.
     */
    @Test
    public void set()
    {
        System.out.println(jedis.set("message", "hello world"));
    }

    /**
     * Get.
     */
    @Test
    public void get()
    {
        System.out.println(jedis.get("message"));
    }

}
