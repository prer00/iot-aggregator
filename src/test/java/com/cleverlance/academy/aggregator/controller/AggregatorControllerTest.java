package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Owner;
import com.sun.source.tree.IdentifierTree;
import org.apache.el.parser.AstGreaterThan;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AggregatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception {
        this.mockMvc.perform(get("/server").contentType("application/json").content("{\"name\": \"aaa\"}")).andExpect(status().isOk());

        this.mockMvc.perform(get("/server")).andDo(print()).andExpect(status().isOk());

//        AggregatorController controller = new AggregatorController();
//
//        controller.saveServer(new Identification("stanice1", new Address("Hlavni", "3", "Praha"), new Owner("Jan", "Novak")));
//        List<Identification> list = controller.getIdentifications().getBody();
//
//        assertNotNull(list);
//        assertEquals(1,list.size());

    }

}