package com.rx.allbackstage.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.rx.allbackstage.Service.IAisgxxsgService;
import com.rx.allbackstage.entity.Result;
import com.rx.allbackstage.entity.aisg.dto.TaibookcasenewDTO;
import com.rx.allbackstage.entity.aisg.dto.TaibookcaserequestautoDTO;
import com.rx.allbackstage.entity.aisg.dto.TaibookcaserequestuserDTO;
import com.rx.allbackstage.entity.aisg.entity.Taibookcasenew;
import com.rx.allbackstage.entity.aisg.entity.Taibookcaserequestuser;
import com.rx.allbackstage.entity.aisg.vo.TaibookcaseVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/api/Bookcase")
@Api(tags = "02.新上架书柜模块 - xssg")
public class XssgController {

    @Autowired
    IAisgxxsgService aisgxxsgService;

    public XssgController() {
        log.debug("创建控制器对象：XssgController");
    }


    @ApiOperation("获取新上架书柜图书表")
    @ApiOperationSupport(order = 1)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "bookclass", value = "bookclass", required = true, dataType = "int"),
            @ApiImplicitParam(name = "mid", value = "mid", required = true, dataType = "int")
    })
    @GetMapping("/GetNewByMidBookClass/{bookclass}&{mid}")
    public Result<List<Taibookcasenew>> GetNewByMid(@PathVariable String mid,@PathVariable String bookclass) {
        log.debug("开始处理【获取新上架书柜图书表】的请求，参数:{}",mid);
        return aisgxxsgService.GetNewByMid(mid,bookclass);
    }

    @ApiOperation("获取新上架书柜图书表2")
    @ApiOperationSupport(order = 2)
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "Long")
    @GetMapping("/GetNewByID/{id}")
    public Result<List<Taibookcasenew>> GetNewByID(@PathVariable Long id) {
        log.debug("开始处理【获取新上架书柜图书表】的请求，参数:{}",id);
        return aisgxxsgService.GetNewByID(id);
    }

    @ApiOperation("添加新上架书柜图书表")
    @ApiOperationSupport(order = 3)
    @PostMapping("/PostNew")
    public Result<Integer> PostNew(TaibookcasenewDTO taibookcasenewDTO) {
        log.debug("开始处理【添加新上架书柜图书表】的请求，参数:{}",taibookcasenewDTO);
        return aisgxxsgService.PostNew(taibookcasenewDTO);
    }

    @ApiOperation("删除全部新上架书柜图书表")
    @ApiOperationSupport(order = 4)
    @GetMapping("/GetNew")
    public Result<Integer> GetNew() {
        log.debug("开始处理【删除全部新上架书柜图书表】的请求，无参数");
        return aisgxxsgService.GetNew();
    }

    @ApiOperation("删除指定新上架书柜图书表")
    @ApiOperationSupport(order = 5)
    @GetMapping("/GetdelNewByIDIds={ids}")
    public Result<Integer> GetdelNewByID(@PathVariable Long ids) {
        log.debug("开始处理【删除指定新上架书柜图书表】的请求，无参数");
        return aisgxxsgService.GetdelNewByID(ids);
    }

    @ApiOperation("用户申请购买图书")
    @ApiOperationSupport(order = 6)
    @PostMapping("/PostBuyFromUser")
    public Result<Integer> PostBuyFromUser(TaibookcaserequestuserDTO taibookcaserequestuserDTO) {
        log.debug("开始处理【用户申请购买图书】的请求，无参数");
        return aisgxxsgService.PostBuyFromUser(taibookcaserequestuserDTO);
    }

    @ApiOperation("用户申请购买图书(ID数组参数)")
    @ApiOperationSupport(order = 7)
    @PostMapping("/PostBuyFromUserWhithID")
    public Result<Integer> PostBuyFromUserWhithID(Long id) {
        log.debug("开始处理【用户申请购买图书(ID数组参数)】的请求，参数:{}",id);
        return aisgxxsgService.PostBuyFromUserWhithID(id);
    }

    @ApiOperation("用户申购图书上架到新上架书柜")
    @ApiOperationSupport(order = 8)
    @PostMapping("/PostBuyToOnShelf")
    public Result<Integer> PostBuyToOnShelf(Long cid, String mid) {
        log.debug("开始处理【用户申购图书上架到新上架书柜】的业务，参数:{},{}",cid,mid);
        return aisgxxsgService.PostBuyToOnShelf(cid,mid);
    }

    @ApiOperation("自动申购图书上架到新上架书柜")
    @ApiOperationSupport(order = 9)
    @PostMapping("/PostBuyToOnShelfAuto")
    public Result<Integer> PostBuyToOnShelfAuto(Long cid, String mid) {
        log.debug("开始处理【用户申购图书上架到新上架书柜】的业务，参数:{},{}",cid,mid);
        return aisgxxsgService.PostBuyToOnShelfAuto(cid,mid);
    }

    @ApiOperation("删除全部的用户申购")
    @ApiOperationSupport(order = 10)
    @GetMapping("/GetBuyFromUser")
    public Result<Integer> GetBuyFromUser() {
        log.debug("开始处理【删除全部的自动申购】的业务，无参数");
        return aisgxxsgService.GetBuyFromUser();
    }

    @ApiOperation("删除指定的自动申购")
    @ApiOperationSupport(order = 11)
    @GetMapping("/GetBuyByIDIds/{id}&{buytype}")
    public Result<Integer> GetBuyByID(@PathVariable Long id, @PathVariable int buytype) {
        log.debug("开始处理【删除全部的自动申购】的业务，参数:{},{}",id,buytype);
        return aisgxxsgService.GetBuyByID(id, buytype);
    }

    @ApiOperation("自动申请购买图书")
    @ApiOperationSupport(order = 12)
    @PostMapping("/PostBuyFromAuto")
    public Result<Integer> PostBuyFromAuto(TaibookcaserequestautoDTO taibookcaserequestautoDTO){
        log.debug("开始处理【自动申请购买图书】的业务，参数:{}",taibookcaserequestautoDTO);
        return aisgxxsgService.PostBuyFromAuto(taibookcaserequestautoDTO);
    }

    @ApiOperation("删除全部的自动申购")
    @ApiOperationSupport(order = 13)
    @GetMapping("/GetDelBuyFromAuto")
    public Result<Integer> GetDelBuyFromAuto() {
        log.debug("开始处理【删除全部的自动申购】的业务，无参数");
        return aisgxxsgService.GetDelBuyFromAuto();
    }

    @ApiOperation("获取书柜申请购买图书表")
    @ApiOperationSupport(order = 14)
    @GetMapping("/GetBuyEqtype/{eqtype}")
    public Result<List<Taibookcaserequestuser>> GetBuy(@PathVariable int eqtype) {
        log.debug("开始处理【获取书柜申请购买图书表】的业务，参数:{}",eqtype);
        return aisgxxsgService.GetBuy(eqtype);
    }

    @ApiOperation("获取书柜申请购买图书表")
    @ApiOperationSupport(order = 15)
    @GetMapping("/GetdelBuyByID/{id}&{eqtype}")
    public Result<List<Taibookcaserequestuser>> GetdelBuyByID(@PathVariable Long id, @PathVariable int eqtype) {
        log.debug("开始处理【获取书柜申请购买图书表】的业务，参数:{},{}",id,eqtype);
        return aisgxxsgService.GetdelBuyByID(id, eqtype);
    }

    @ApiOperation("搜索书柜图书表")
    @ApiOperationSupport(order = 16)
    @GetMapping("/PostSearchByMid")
    public Result<List<TaibookcaseVO>> PostSearchByMid0(String bookName, String mid, int searchType) {
        log.debug("开始处理【搜索书柜图书表】的业务，参数:{},{},{}",bookName,mid,searchType);
        return aisgxxsgService.PostSearchByMid(bookName,mid,searchType);
    }


























}
