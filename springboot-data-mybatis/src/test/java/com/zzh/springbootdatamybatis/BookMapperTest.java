package com.zzh.springbootdatamybatis;

import com.zzh.springbootdatamybatis.dao.BookMapper;
import com.zzh.springbootdatamybatis.pojo.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class BookMapperTest {

    @Autowired
    private BookMapper bookMapper;

   /* @Test
    public void testSelectAll() {
        List<Book> bookList = bookMapper.selectAll();
        Assert.assertNotNull(bookList);
        bookList.forEach((book) -> System.out.println(book));
    }*/


    @Test
    public void testSelectByAuthro() {
        List<Book> bookList = bookMapper.selectByAuthor("金庸");
        Assert.assertNotNull(bookList);
        bookList.forEach((book) -> System.err.println(book));
    }

    @Test
    public void testSelectByPrimaryKey() {
        Book book = bookMapper.selectByPrimaryKey(2);
        Assert.assertNotNull(book);
        System.out.println(book);
    }

    public void testDeleteByPrimaryKey() {
        int primaryKey = bookMapper.deleteByPrimaryKey(8);
        Assert.assertNotEquals(0, primaryKey);
        System.out.println(primaryKey);
    }

}