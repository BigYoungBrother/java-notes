package com.young.unique.id;

/**
 * 雪花算法
 *
 * @author Young
 * @Date 2021-05-22 17:04
 */
public class SnowflakeIdGenerator {

    /**
     * 开始时间截 (这个用自己业务系统上线的时间)
     */
    private static final long START_TIMESTAMP = 1575365018000L;

    /**
     * 机器id所占的位数
     */
    private static final long WORKER_ID_BITS_LENGTH = 10L;

    /**
     * 支持的最大机器id，结果是31 (这个移位算法可以很快的计算出几位二进制数所能表示的最大十进制数)
     * -1L的机器表示为  0xffffffff
     */
    private static final long MAX_WORKER_ID = -1L ^ (-1L << WORKER_ID_BITS_LENGTH);

    /**
     * 序列在id中占的位数
     */
    private static final long SEQUENCE_BITS_LENGTH = 12L;

    /**
     * 机器ID向左移12位
     */
    private static final long WORKER_ID_SHIFT_LENGTH = SEQUENCE_BITS_LENGTH;

    /**
     * 时间截向左移22位(10+12)
     */
    private static final long TIMESTAMP_LEFT_SHIFT_LENGTH = SEQUENCE_BITS_LENGTH + WORKER_ID_BITS_LENGTH;

    /**
     * 生成序列的掩码，这里为4095 (0b111111111111=0xfff=4095)
     */
    private static final long SEQUENCE_MASK = -1L ^ (-1L << SEQUENCE_BITS_LENGTH);

    /**
     * 工作机器ID(0~1024)
     */
    private long workerId;

    /**
     * 毫秒内序列(0~4095)
     */
    private long sequence = 0L;

    /**
     * 上次生成ID的时间截
     */
    private long lastTimestamp = -1L;


    /**
     * 构造函数
     *
     * @param workerId 工作ID (0~1024)
     */
    public SnowflakeIdGenerator(long workerId) {
        if (workerId > MAX_WORKER_ID || workerId < 0) {
            throw new IllegalArgumentException(String.format("workerId can't be greater than %d or less than 0", MAX_WORKER_ID));
        }
        this.workerId = workerId;
    }

    // ==============================Methods==========================================

    /**
     * 获得下一个ID (该方法是线程安全的)
     *
     * @return SnowflakeId
     */
    public synchronized long nextId() {
        long timestamp = currentTimestampMillis();

        // 时钟回退处理, 时钟回退一般是10ms内
        if (timestamp < lastTimestamp) {
            // 如果当前时间小于上一次ID生成的时间戳，说明系统时钟回退过, 这个时候取上次时间戳作为当前时间
            timestamp = lastTimestamp;
        }

        if (lastTimestamp == timestamp) {
            // 如果是同一时间生成的，则进行毫秒内序列
            sequence = (sequence + 1) & SEQUENCE_MASK;
            // 毫秒内序列溢出
            if (sequence == 0) {
                // 阻塞到下一个毫秒,获得新的时间戳
                timestamp = nextTimestampMillis(lastTimestamp);
            }
        } else {
            //时间戳改变，毫秒内序列重置
            sequence = 0L;
        }
        // 更新上次生成ID的时间截
        lastTimestamp = timestamp;

        //移位并通过或运算拼到一起组成64位的ID
        return ((timestamp - START_TIMESTAMP) << TIMESTAMP_LEFT_SHIFT_LENGTH)
                | (workerId << WORKER_ID_SHIFT_LENGTH)
                | sequence;
    }

    /**
     * 阻塞到下一个毫秒，直到获得新的时间戳
     *
     * @param lastTimestamp 上次生成ID的时间截
     * @return 当前时间戳
     */
    private long nextTimestampMillis(long lastTimestamp) {
        long timestamp = currentTimestampMillis();
        while (timestamp <= lastTimestamp) {
            timestamp = currentTimestampMillis();
        }
        return timestamp;
    }

    /**
     * 返回以毫秒为单位的当前时间
     *
     * @return 当前时间(毫秒)
     */
    private long currentTimestampMillis() {
        return System.currentTimeMillis();
    }

}
