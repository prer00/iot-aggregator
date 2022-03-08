package com.cleverlance.academy.aggregator.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest
@AutoConfigureMockMvc
class AggregatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception {
        this.mockMvc.perform(post("/server").contentType("application/json").content("{\"name\": \"aaa\"}")).andExpect(status().isOk());

        this.mockMvc.perform(get("/server")).andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("aaa"));


    }

}