package com.yang.factory;

/**
 * @Description: FactoryBean放入到容器中会被容器调用getObject()生成一个对象放入到容器中 name为myFactoryBean（当前类的容器中的name）
 * 而真正的MyFactoryBean的name为"&myFactoryBean"(&+当前类的容器中的name)
 * 例如SqlSessionFactoryBean就实现了FactoryBean，如果把SqlSessionFactoryBean配置到容器中只需简单的设置DataSource就可以内部完成复杂的配置，用于简化配置
 * @Author: tona.sun
 * @Date: 2019/12/23 10:29
 */
/*@Component
public class MyFactoryBean implements FactoryBean<IUserDao> {
    IUserDao userDao;

    @Override
    public IUserDao getObject() throws Exception {
        *//*if (userDao == null) {
            userDao = new UserDaoImpl();
        }*//*
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return IUserDao.class;
    }
}*/
