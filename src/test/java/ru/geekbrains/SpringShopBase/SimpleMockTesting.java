package ru.geekbrains.SpringShopBase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest
@AutoConfigureMockMvc
public class SimpleMockTesting {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void putProductInCart() throws Exception {
        String content = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/cart/{id}", 1L))
                .andReturn().getResponse().getContentAsString();
        System.out.println(content);
    }
}
