package com.luculent.web;

import com.luculent.domain.User;
import com.luculent.service.UserServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yue on  2017/3/5 0005.
 */
@Api(value="用户相关的接口")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServer server;
    private Logger logger = Logger.getLogger(UserController.class);
    /**
     * 添加用户
     * @param user 用户对象
     * @since 2016年9月21日21:01:50
     */
    @RequestMapping("/add")
    @ApiOperation(notes="添加用户",value="添加一个用户",httpMethod="POST")

    @ApiImplicitParams({
            @ApiImplicitParam(name="name",paramType="query",dataType="string")
    })
    public String add( User user){
        server.add(user);
        return "hello ";
    }
    /**
     * 查询所有用户
     * @since 2016年9月22日20:32:43
     * @return
     */
    @RequestMapping("/all")
    @ApiOperation(notes="查询所有用户",value="查询所有有，目前只返回数量",httpMethod="GET")
    public String find(){
        logger.error("dfdfd大幅答复");
        return ""+server.findAll().size();
    }
}
