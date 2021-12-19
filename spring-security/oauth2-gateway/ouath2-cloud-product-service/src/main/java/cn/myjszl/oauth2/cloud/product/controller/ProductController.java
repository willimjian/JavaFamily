package cn.myjszl.oauth2.cloud.product.controller;

import cn.myjszl.oauth2.cloud.auth.common.model.ResultMsg;
import cn.myjszl.oauth2.cloud.auth.common.model.product.Product;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

@RestController
@RequestMapping("/product")
public class ProductController {

    @PostMapping("/listByOrderId")
    public ResultMsg listByOrderId(@RequestParam(value = "orderId") Long orderId) {
        List<Product> list = LongStream.of(1L, 2L, 3L).mapToObj(p -> Product.builder().id(p).name("码猿技术专栏").money(10000L).build()).collect(Collectors.toList());
        return new ResultMsg(200,"请求成功",list);
    }

}
