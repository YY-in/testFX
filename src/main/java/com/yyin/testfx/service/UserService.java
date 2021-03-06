package com.yyin.testfx.service;

import com.yyin.testfx.models.User;

/**
 * @Author: YinZhihao
 * @Description: most implement of user service
 * @Date: Created in 22:31 2021/12/9
 */
public interface UserService {

    /**
     * @description 通过用户名验证登录
     * @param user
     * @return 如果返回null，说明登录失败，返回有值，是登录成功
     */
    public User loginByName(User user);

    /**
     * @description: 通过邮箱验证登录
     * @param user
     * @return 如果返回null，说明登录失败，返回有值，是登录成功
     */
    public User loginByEmail(User user);
    /**
     * 检查 用户名是否可用
     * @param username
     * @return 返回true表示用户名已存在，返回false表示用户名可用
     */
    public boolean existsUsername(String username);

    /**
     * @Description: 检查数据库中是否存在拥有这样邮箱的用户
     * @Date: 22:21 2021/12/10
     * @param email
     * @return 存在 true ,不存在 false
      */
    public boolean existUserEmail(String email);
    /**
     * @Description: 检查密码是否合法
     * @Date: 20:36 2021/12/10
     * @param password：输入的密码
     * @return： boolean
     */
    public  boolean checkPassword(String password);
    /**
     * @Description: 检查邮箱是否合法
     * @Date: 20:36 2021/12/10
     * @param email：输入的邮箱
     * @return： boolean
     */
    public boolean checkEmail(String email);

    /**
     * 保存用户登录信息
     * @date: 21:41 2021/12/12
     * @param userName 用户名
     * @param email 邮箱
     * @param password 密码
     * @param img_path 图片本地地址
     * @return 返回-1表示操作失败，其他是sql语句影响的行数
     */
    int saveRegisterInformation(String userName, String email, String password, String img_path);
}
