package com.howie.shirojwt.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yuanhaoyue swithaoy@gmail.com
 * @Description JWT 工具类
 * @Date 2018-04-07
 * @Time 22:48
 */
public class JWTUtil {
    // 过期时间 24 小时
    private static final long EXPIRE_TIME = 60 * 24 * 60 * 1000;
    // 密钥
    private static final String SECRET = "SHIRO+JWT";

    /**
     * 生成 token, 5min后过期
     *
     * @param username 用户名
     * @return 加密的token
     */
    public static String createToken(String username) {
        try {
            Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            // 附带username信息
            return JWT.create()
                    .withClaim("username", username)
                    //到期时间
                    .withExpiresAt(date)
                    //创建一个新的JWT，并使用给定的算法进行标记
                    .sign(algorithm);
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    /**
     * 校验 token 是否正确
     *
     * @param token    密钥
     * @param username 用户名
     * @return 是否正确
     */
    public static boolean verify(String token, String username) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);
            //在token中附带了username信息
            JWTVerifier verifier = JWT.require(algorithm)
                    .withClaim("username", username)
                    .build();
            //验证 token
            verifier.verify(token);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    /**
     * 获得token中的信息，无需secret解密也能获得
     *
     * @return token中包含的用户名
     */
    public static String getUsername(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("username").asString();
        } catch (JWTDecodeException e) {
            return null;
        }
    }
}
STATUS | wrapper  | 2018/10/19 09:06:59 | --> Wrapper Started as Daemon
STATUS | wrapper  | 2018/10/19 09:07:00 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:07:00 | JVM exited while loading the application.
INFO   | jvm 1    | 2018/10/19 09:07:00 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 1    | 2018/10/19 09:07:00 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 1    | 2018/10/19 09:07:00 | #
INFO   | jvm 1    | 2018/10/19 09:07:00 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 1    | 2018/10/19 09:07:00 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 1    | 2018/10/19 09:07:00 | # An error report file with more information is saved as:
INFO   | jvm 1    | 2018/10/19 09:07:00 | # /usr/local/mycat/hs_err_pid2766.log
STATUS | wrapper  | 2018/10/19 09:07:04 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:07:04 | JVM exited while loading the application.
INFO   | jvm 2    | 2018/10/19 09:07:04 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 2    | 2018/10/19 09:07:04 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 2    | 2018/10/19 09:07:04 | #
INFO   | jvm 2    | 2018/10/19 09:07:04 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 2    | 2018/10/19 09:07:04 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 2    | 2018/10/19 09:07:04 | # An error report file with more information is saved as:
INFO   | jvm 2    | 2018/10/19 09:07:04 | # /usr/local/mycat/hs_err_pid2768.log
STATUS | wrapper  | 2018/10/19 09:07:08 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:07:08 | JVM exited while loading the application.
INFO   | jvm 3    | 2018/10/19 09:07:08 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 3    | 2018/10/19 09:07:08 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 3    | 2018/10/19 09:07:08 | #
INFO   | jvm 3    | 2018/10/19 09:07:08 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 3    | 2018/10/19 09:07:08 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 3    | 2018/10/19 09:07:08 | # An error report file with more information is saved as:
INFO   | jvm 3    | 2018/10/19 09:07:08 | # /usr/local/mycat/hs_err_pid2770.log
STATUS | wrapper  | 2018/10/19 09:07:12 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:07:12 | JVM exited while loading the application.
INFO   | jvm 4    | 2018/10/19 09:07:12 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 4    | 2018/10/19 09:07:12 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 4    | 2018/10/19 09:07:12 | #
INFO   | jvm 4    | 2018/10/19 09:07:12 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 4    | 2018/10/19 09:07:12 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 4    | 2018/10/19 09:07:12 | # An error report file with more information is saved as:
INFO   | jvm 4    | 2018/10/19 09:07:12 | # /usr/local/mycat/hs_err_pid2772.log
STATUS | wrapper  | 2018/10/19 09:07:16 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:07:16 | JVM exited while loading the application.
INFO   | jvm 5    | 2018/10/19 09:07:16 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 5    | 2018/10/19 09:07:16 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 5    | 2018/10/19 09:07:16 | #
INFO   | jvm 5    | 2018/10/19 09:07:16 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 5    | 2018/10/19 09:07:16 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 5    | 2018/10/19 09:07:16 | # An error report file with more information is saved as:
INFO   | jvm 5    | 2018/10/19 09:07:16 | # /usr/local/mycat/hs_err_pid2774.log
FATAL  | wrapper  | 2018/10/19 09:07:16 | There were 5 failed launches in a row, each lasting less than 300 seconds.  Giving up.
FATAL  | wrapper  | 2018/10/19 09:07:16 |   There may be a configuration problem: please check the logs.
STATUS | wrapper  | 2018/10/19 09:07:16 | <-- Wrapper Stopped
STATUS | wrapper  | 2018/10/19 09:10:02 | --> Wrapper Started as Daemon
STATUS | wrapper  | 2018/10/19 09:10:02 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:10:02 | JVM exited while loading the application.
INFO   | jvm 1    | 2018/10/19 09:10:02 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 1    | 2018/10/19 09:10:02 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 1    | 2018/10/19 09:10:02 | #
INFO   | jvm 1    | 2018/10/19 09:10:02 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 1    | 2018/10/19 09:10:02 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 1    | 2018/10/19 09:10:02 | # An error report file with more information is saved as:
INFO   | jvm 1    | 2018/10/19 09:10:02 | # /usr/local/mycat/hs_err_pid2857.log
STATUS | wrapper  | 2018/10/19 09:10:06 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:10:06 | JVM exited while loading the application.
INFO   | jvm 2    | 2018/10/19 09:10:06 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 2    | 2018/10/19 09:10:06 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 2    | 2018/10/19 09:10:06 | #
INFO   | jvm 2    | 2018/10/19 09:10:06 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 2    | 2018/10/19 09:10:06 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 2    | 2018/10/19 09:10:06 | # An error report file with more information is saved as:
INFO   | jvm 2    | 2018/10/19 09:10:06 | # /usr/local/mycat/hs_err_pid2859.log
STATUS | wrapper  | 2018/10/19 09:10:10 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:10:10 | JVM exited while loading the application.
INFO   | jvm 3    | 2018/10/19 09:10:10 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 3    | 2018/10/19 09:10:10 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 3    | 2018/10/19 09:10:10 | #
INFO   | jvm 3    | 2018/10/19 09:10:10 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 3    | 2018/10/19 09:10:10 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 3    | 2018/10/19 09:10:10 | # An error report file with more information is saved as:
INFO   | jvm 3    | 2018/10/19 09:10:10 | # /usr/local/mycat/hs_err_pid2861.log
STATUS | wrapper  | 2018/10/19 09:10:14 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:10:14 | JVM exited while loading the application.
INFO   | jvm 4    | 2018/10/19 09:10:14 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 4    | 2018/10/19 09:10:14 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 4    | 2018/10/19 09:10:14 | #
INFO   | jvm 4    | 2018/10/19 09:10:14 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 4    | 2018/10/19 09:10:14 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 4    | 2018/10/19 09:10:14 | # An error report file with more information is saved as:
INFO   | jvm 4    | 2018/10/19 09:10:14 | # /usr/local/mycat/hs_err_pid2863.log
STATUS | wrapper  | 2018/10/19 09:10:18 | Launching a JVM...
ERROR  | wrapper  | 2018/10/19 09:10:18 | JVM exited while loading the application.
INFO   | jvm 5    | 2018/10/19 09:10:18 | Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=64M; support was removed in 8.0
INFO   | jvm 5    | 2018/10/19 09:10:18 | Java HotSpot(TM) 64-Bit Server VM warning: INFO: os::commit_memory(0x0000000715550000, 715849728, 0) failed; error='Cannot allocate memory' (errno=12)
INFO   | jvm 5    | 2018/10/19 09:10:18 | #
INFO   | jvm 5    | 2018/10/19 09:10:18 | # There is insufficient memory for the Java Runtime Environment to continue.
INFO   | jvm 5    | 2018/10/19 09:10:18 | # Native memory allocation (mmap) failed to map 715849728 bytes for committing reserved memory.
INFO   | jvm 5    | 2018/10/19 09:10:18 | # An error report file with more information is saved as:
INFO   | jvm 5    | 2018/10/19 09:10:18 | # /usr/local/mycat/hs_err_pid2865.log
FATAL  | wrapper  | 2018/10/19 09:10:18 | There were 5 failed launches in a row, each lasting less than 300 seconds.  Giving up.
FATAL  | wrapper  | 2018/10/19 09:10:18 |   There may be a configuration problem: please check the logs.
STATUS | wrapper  | 2018/10/19 09:10:19 | <-- Wrapper Stopped

