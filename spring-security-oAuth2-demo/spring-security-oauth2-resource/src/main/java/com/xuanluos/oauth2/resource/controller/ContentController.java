package com.xuanluos.oauth2.resource.controller;

import com.xuanluos.oauth2.resource.domain.TbContent;
import com.xuanluos.oauth2.resource.dto.ResponseResult;
import com.xuanluos.oauth2.resource.service.TbContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuanLuos
 * @date 2019/4/29 11:53
 */
@RestController
public class ContentController {

    @Autowired
    private TbContentService contentService;

    @GetMapping("/")
    public ResponseResult<List<TbContent>> selectAll(){
        return new ResponseResult(HttpStatus.OK.value(),HttpStatus.OK.toString(),contentService.selectAll());
    }
}
