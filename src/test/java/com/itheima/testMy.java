package com.itheima;

/*
  author cxz
*/

import com.itheima.dao.IUseDao;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/*
  author cxz
*/
public class  testMy{
    public static void main(String[] args) throws Exception{
        InputStream in = Resources.getResourceAsStream( "SqlMapConfig.xml" );
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);
        SqlSession session=factory.openSession();

         IUseDao userDao = session.getMapper( IUseDao.class );

        List<User> users=userDao.findAll();

        for (User user:users){
            System.out.println(user);
        }
        session.close();
        in.close();
    }
}

