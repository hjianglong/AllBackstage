package com.rx.allbackstage.controller;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.rx.allbackstage.Service.IOilPaintingService;
import com.rx.allbackstage.entity.Result;
import com.rx.allbackstage.entity.yhp.dto.*;
import com.rx.allbackstage.entity.yhp.entiey.*;
import com.rx.allbackstage.entity.yhp.vo.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/OilPainting")
@Api(tags = "03.油画屏接口 - yhp")
public class YhpController {

    @Autowired
    private IOilPaintingService oilPaintingService;

    public YhpController() {
        log.debug("创建控制器对象：YhpController");
    }

    @ApiOperation("获取搜索的图片")
    @ApiOperationSupport(order = 2)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageindex", value = "pageindex", required = true, dataType = "int"),
            @ApiImplicitParam(name = "pageindex", value = "pageindex", required = true, dataType = "int")
    })
    @GetMapping("/GetALLPub/{pageIndex}&{pageSize}")
    public Result<List<Yhpoilpainting>> searchImage(int pageindex, int pagesize) {
        return oilPaintingService.searchImage(pageindex, pagesize);
    }


    @ApiOperation("获取指定机器的数据")
    @ApiOperationSupport(order = 3)
    @ApiImplicitParam(name = "mid", value = "mid", required = true, dataType = "String")
    @GetMapping("/GetALLWithMID/{mid}")
    public Result<List<YhpOilPanintingmid>> SpecifiedMachineData(@PathVariable String mid) {
        log.debug("开始处理【获取指定机器的数据】的请求，参数:{}", mid);
        return oilPaintingService.SpecifiedMachineData(mid);
    }

    @ApiOperation("获取公共库的指定数据")
    @ApiOperationSupport(order = 4)
    @ApiImplicitParam(name = "cid", value = "cid", required = true, dataType = "String")
    @GetMapping("/GetPubByID/{cid}")
    public Result<List<Yhpoilpainting>> specifiedData(@PathVariable String cid) {
        log.debug("开始处理【获取公共库的指定数据】的请求，参数:{}", cid);
        return oilPaintingService.specifiedData(cid);
    }

    @ApiOperation("获取自定义库的指定数据")
    @ApiOperationSupport(order = 5)
    @ApiImplicitParam(name = "cid", value = "cid", required = true, dataType = "String")
    @GetMapping("/GetMIDByID/{cid}")
    public Result<List<YhpOilPanintingmid>> customLibrary(@PathVariable String cid) {
        log.debug("开始处理【获取自定义库的指定数据】的请求，参数:{}", cid);
        return oilPaintingService.customLibrary(cid);

    }

    @ApiOperation("删除指定机器的资源")
    @ApiOperationSupport(order = 6)
    @ApiImplicitParam(name = "ids", value = "ids", required = true, dataType = "long")
    @GetMapping("/GetMIDByIDIds/{ids}")
    public Result<Integer> GetMIDByID(@PathVariable Long ids) {
        log.debug("开始处理【根据id删除相册】的请求，参数：{}", ids);
        return oilPaintingService.GetMIDByID(ids);
    }

    @ApiOperation("获取ocr资源指定数据")
    @ApiOperationSupport(order = 7)
    @ApiImplicitParam(name = "cid", value = "cid", required = true, dataType = "String")
    @GetMapping("/GetOCRByID/{cid}")
    public Result<List<YhpOilPanintingmid>> GetOCRByID(@PathVariable String cid) {
        log.debug("开始处理【获取ocr资源指定数据】的请求，参数:{}", cid);
        return oilPaintingService.GetOCRByID(cid);
    }

    @ApiOperation("添加油画屏公共资源")
    @ApiOperationSupport(order = 8)
    @PostMapping("/PostNewPub")
    public Result<Integer> PostNewPub(YhpoilpaintingNewPub yhpoilpaintingNewPub) {
        log.debug("开始处理【添加油画屏公共资源】的请求，参数：{}", yhpoilpaintingNewPub);
        return oilPaintingService.PostNewPub(yhpoilpaintingNewPub);
    }

    @ApiOperation("添加油画屏公共资源2")
    @ApiOperationSupport(order = 9)
    @PostMapping("/PostNewPub2")
    public Result<Integer> PostNewPub2(YhpoilpaintingNewPub2 yhpoilpaintingNewPub2) {
        log.debug("开始处理【添加油画屏公共资源2】的请求，参数：{}", yhpoilpaintingNewPub2);
        return oilPaintingService.PostNewPub2(yhpoilpaintingNewPub2);
    }

    @ApiOperation("添加油画屏指定机器资源")
    @ApiOperationSupport(order = 10)
    @PostMapping("/PostNewWithMID")
    public Result<Integer> PostNewWithMID(YhpOilPanintingmid yhpOilPanintingmid) {
        log.debug("开始处理【添加油画屏指定机器资源】的请求，参数：{}", yhpOilPanintingmid);
        return oilPaintingService.PostNewWithMID(yhpOilPanintingmid);
    }

    @ApiOperation("给OCR油画添加关键字")
    @ApiOperationSupport(order = 11)
    @PostMapping("/PostOCRKeys")
    public Result<Integer> PostOCRKeys(Long cid, String keys) {
        log.debug("开始处理【给OCR油画添加关键字】的请求，参数ID：{}，新数据：{}", cid, keys);
        return oilPaintingService.PostOCRKeys(cid, keys);
    }

    @ApiOperation("获取所有机器")
    @ApiOperationSupport(order = 12)
    @GetMapping("/GetAllOilMid")
    public Result<List<Yhpaimin>> list() {
        log.debug("开始处理【获取所有机器】的请求，无参数");
        return oilPaintingService.list();
    }

    @ApiOperation("删除公共油画")
    @ApiOperationSupport(order = 13)
    @ApiImplicitParam(name = "ids", value = "ids", required = true, dataType = "long")
    @GetMapping("/GetByIDIds/{ids}")
    public Result<Integer> GetByID(@PathVariable Long[] ids) {
        log.debug("开始处理【删除公共油画】的请求，参数：{}", ids);
        return oilPaintingService.GetByID(ids);
    }

    @ApiOperation("获取指定公共背景")
    @ApiOperationSupport(order = 14)
    @ApiImplicitParam(name = "cid", value = "cid", required = true, dataType = "String")
    @GetMapping("/GetBKByID/{cid}")
    public Result<String> GetBKByID(@PathVariable Long cid) {
        log.debug("开始处理【获取指定公共背景】的请求，参数:{}", cid);
        return oilPaintingService.GetBKByID(cid);
    }

    @ApiOperation("获取全部公共背景")
    @ApiOperationSupport(order = 15)
    @GetMapping("/GetBKAll")
    public Result<List<Yhpoilpaintingbk>> GetBKAll() {
        log.debug("开始处理【获取全部公共背景】的请求，无参数");
        return oilPaintingService.GetBKAll();
    }

    @ApiOperation("添加公共背景图")
    @ApiOperationSupport(order = 16)
    @PostMapping("/PostBK")
    public Result<Integer> PostBK(YhpoilpaintingbkNewbk yhpoilpaintingbkNewbk) {
        log.debug("开始处理【添加公共背景图】的请求，参数：{}", yhpoilpaintingbkNewbk);
        return oilPaintingService.PostBK(yhpoilpaintingbkNewbk);
    }

    @ApiOperation("删除公共背景图")
    @ApiOperationSupport(order = 17)
    @ApiImplicitParam(name = "ids", value = "ids", required = true, dataType = "long")
    @GetMapping("/GetBkIds={ids}")
    public Result<Integer> GetBk(@PathVariable Long[] ids) {
        log.debug("开始处理【根据id删除相册】的请求，参数：{}", ids);
        return oilPaintingService.GetBk(ids);
    }

    @ApiOperation("获取指定公共背景")
    @ApiOperationSupport(order = 18)
    @ApiImplicitParam(name = "cid", value = "cid", required = true, dataType = "String")
    @GetMapping("/GetBKMidByID/{cid}")
    public Result<String> GetBKMidByID(@PathVariable Long cid) {
        log.debug("开始处理【获取指定公共背景】的请求，参数:{}", cid);
        return oilPaintingService.GetBKMidByID(cid);
    }

    @ApiOperation("获取指定机器全部自定义背景")
    @ApiOperationSupport(order = 19)
    @GetMapping("/GetBKMIDAllMid/{mid}")
    public Result<List<YhpoilpaintingbkmidVO>> GetBKMIDAll(@PathVariable String mid) {
        log.debug("开始处理【获取指定机器全部自定义背景】的请求，参数:{}", mid);
        return oilPaintingService.GetBKMIDAll(mid);
    }

    @ApiOperation("添加自定义背景图")
    @ApiOperationSupport(order = 20)
    @PostMapping("/PostBKMID")
    public Result<Integer> PostBKMID(YhpoilpaintingNewbkmin yhpoilpaintingbkmidNewbkmin) {
        log.debug("开始处理【添加自定义背景图】的请求，参数：{}", yhpoilpaintingbkmidNewbkmin);
        return oilPaintingService.PostBKMID(yhpoilpaintingbkmidNewbkmin);
    }

    @ApiOperation("删除自定义背景图")
    @ApiOperationSupport(order = 21)
    @ApiImplicitParam(name = "ids", value = "ids", required = true, dataType = "long")
    @GetMapping("/GetBkMIDIids/{ids}")
    public Result<Integer> GetBkMID(@PathVariable Long[] ids) {
        log.debug("开始处理【根据id删除相册】的请求，参数：{}", ids);
        return oilPaintingService.GetBkMID(ids);
    }

    @ApiOperation("添加关键字和它对应的图片")
    @ApiOperationSupport(order = 22)
    @PostMapping("/PostKeyImg")
    public Result<Integer> PostKeyImg(YhpoilpaintingNewkeyimg yhpoilpaintingNewkeyimg) {
        log.debug("开始处理【添加关键字和它对应的图片】的请求，参数：{}", yhpoilpaintingNewkeyimg);
        return oilPaintingService.PostKeyImg(yhpoilpaintingNewkeyimg);
    }

    @ApiOperation("获取所有的关键字和对应的数据")
    @ApiOperationSupport(order = 23)
    @GetMapping("/GetAllKeyImg")
    public Result<List<Yhpoilpaintingkeyimg>> GetAllKeyImg() {
        log.debug("开始处理【获取指定机器全部自定义背景】的请求，无参数");
        return oilPaintingService.GetAllKeyImg();
    }

    @ApiOperation("获取所有的关键字和对应的数据")
    @ApiOperationSupport(order = 24)
    @GetMapping("/GetAllKeyImgByKeysKeys/{keys}")
    public Result<List<YhpoilpaintingkeyimgVO>> GetAllKeyImgByKeys(@PathVariable String keys) {
        log.debug("开始处理【获取指定机器全部自定义背景】的请求，参数:{}", keys);
        return oilPaintingService.GetAllKeyImgByKeys(keys);
    }

    @ApiOperation("删除关键字和对应的数据")
    @ApiOperationSupport(order = 25)
    @ApiImplicitParam(name = "ids", value = "ids", required = true, dataType = "long")
    @GetMapping("/GetKeyImgByIDIds/{ids}")
    public Result<Integer> GetKeyImgByID(@PathVariable Long[] ids) {
        log.debug("开始处理【删除关键字和对应的数据】的请求，参数：{}", ids);
        return oilPaintingService.GetKeyImgByID(ids);
    }

    @ApiOperation("上传视频文件")
    @ApiOperationSupport(order = 26)
    @PostMapping("/PostVideo")
    public Result<String> upload(MultipartFile uploadFile, HttpServletRequest request) {
        /*
         定义文件的存储路径,如下，是在linux和mac上定义的文件路径
        /private/var/folders/8x/4zvnbqmj1w33cqmzrpygzbth0000gn/T/tomcat-docbase.5206733816001100271.8080/uploadFile
         */
        String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
        File dir = new File(realPath);
        if (!dir.isDirectory()) {//文件目录不存在，就创建一个
            dir.mkdirs();
        }
        try {
            String filename = uploadFile.getOriginalFilename();
            //服务端保存的文件对象
            File fileServer = new File(dir, filename);
            System.out.println("file文件真实路径:" + fileServer.getAbsolutePath());
            //2，实现上传
            uploadFile.transferTo(fileServer);
            String filePath = request.getScheme() + "://" +
                    request.getServerName() + ":"
                    + request.getServerPort()
                    + "/uploadFile/" + filename;
            //3，返回可供访问的网络路径
            return new Result<>(true,"上传视频文件",filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Result<>(false,"服务异常");
    }

    @ApiOperation("获取主题列表")
    @ApiOperationSupport(order = 27)
    @GetMapping("/GetTheme")
    public Result<List<YhpoilpaintingthemeVO>> GetTheme() {
        log.debug("开始处理【获取主题列表】的请求，无参数");
        return oilPaintingService.GetTheme();
    }

    @ApiOperation("获取主题列表(分页）")
    @ApiOperationSupport(order = 28)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageindex", value = "pageindex", required = true, dataType = "int"),
            @ApiImplicitParam(name = "pagesize", value = "pagesize", required = true, dataType = "int")
    })
    @GetMapping("/GetThemeWithPage/{pageIndex}&{pageSize}")
    public Result<List<YhpoilpaintingthemeVO>> GetThemeWithPage(int pageindex, int pagesize){
        return oilPaintingService.GetThemeWithPage(pageindex,pagesize);
    }

    @ApiOperation("删除主题")
    @ApiOperationSupport(order = 29)
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "long")
    @GetMapping("/GetthemeDel/{id}")
    public Result<Integer> GetthemeDel(@PathVariable Long id){
        log.debug("开始处理【根据id删除相册】的请求，参数：{}", id);
        return oilPaintingService.GetthemeDel(id);
    }

    @ApiOperation("添加主题")
    @ApiOperationSupport(order = 30)
    @PostMapping("/Postthemeadd")
    public Result<Integer> Postthemeadd(YhpoilpaintingNewtheme yhpoilpaintingNewtheme){
        log.debug("开始处理【添加油画屏公共资源】的请求，参数：{}", yhpoilpaintingNewtheme);
        return oilPaintingService.Postthemeadd(yhpoilpaintingNewtheme);
    }

    @ApiOperation("修改主题")
    @ApiOperationSupport(order = 31)
    @PostMapping("/PostthemeChange")
    public Result<Integer> PostthemeChange(Long id,String themeName,Long themeType,String keywords,Long fenleiid,String moshi,String qiehuanshijian){
        log.debug("开始处理【修改主题】的请求，参数：{},{},{},{},{],{}",  id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
        return oilPaintingService.PostthemeChange( id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
    }

    @ApiOperation("获取主题素材及详细")
    @ApiOperationSupport(order = 32)
    @PostMapping("/GetThemePicCid/{cid}")
    public Result<List<YhpoilpaintingGetthemepicVO>> GetThemePic(@PathVariable String cid){
        log.debug("开始处理【添加油画屏公共资源】的请求，参数：{}",cid);
        return oilPaintingService.GetThemePic(cid);
    }

    @ApiOperation("获取设备的主题")
    @ApiOperationSupport(order = 33)
    @PostMapping("/GetEquipTheme")
    public Result<List<YhpaiminoilpaintingthemeVO>> GetEquipTheme(){
        log.debug("开始处理【添加油画屏公共资源】的请求，无参数");
        return oilPaintingService.GetEquipTheme();
    }

    @ApiOperation("修改油画屏主题")
    @ApiOperationSupport(order = 34)
    @PostMapping("/PostoilThemeChange")
    public Result<Integer> PostoilThemeChange(String mid, Long themeid){
        log.debug("开始处理【修改油画屏主题】的请求，参数MID：{}，新数据：{}",mid,themeid);
        return oilPaintingService.PostoilThemeChange(mid, themeid);
    }

    @ApiOperation("修改所有油画屏主题")
    @ApiOperationSupport(order = 35)
    @PostMapping("/PostAlloilTheme")
    public Result<Integer> PostAlloilTheme(Long themeid){
        log.debug("开始处理【修改所有油画屏主题】的业务，参数:{}",themeid);
        return oilPaintingService.PostAlloilTheme(themeid);
    }




    @ApiOperation("修改主题下关联图片关键词")
    @ApiOperationSupport(order = 38)
    @PostMapping("/PostThemePicKeyword")
    public Result<Integer> PostThemePicKeyword(Long theme_id, Long pic_id, String keyword){
        log.debug("开始处理【修改主题下关联图片关键词】的业务，参数:{},{},{}",theme_id,pic_id,keyword);
        return oilPaintingService.PostThemePicKeyword(theme_id, pic_id, keyword);
    }

    @ApiOperation("油画屏添加用户上传素材")
    @ApiOperationSupport(order = 39)
    @PostMapping("/PostUserMaterials")
    public Result<Integer> PostUserMaterials(YhpoilpaintingNewupload yhpoilpaintingNewupload){
        log.debug("开始处理【修改主题下关联图片关键词】的业务，参数:{}",yhpoilpaintingNewupload);
        return oilPaintingService.PostUserMaterials(yhpoilpaintingNewupload);
    }

    @ApiOperation("获取所有油画屏用户上传素材数据")
    @ApiOperationSupport(order = 40)
    @PostMapping("/GetUserMaterialsUsername/{username}&{checkstatus}&{asc}&{pageIndex}&{pageSize}")
    public  Result<List<Yhpoilpaintingupload>> GetUserMaterials(@PathVariable Long pageIndex, @PathVariable Long pageSize){
        log.debug("开始处理【获取所有油画屏用户上传素材数据】的业务，参数:{},{}",pageIndex,pageSize);
        return oilPaintingService.GetUserMaterials(pageIndex,pageSize);
    }

    @ApiOperation("修改油画屏用户上传素材数据审核状态")
    @ApiOperationSupport(order = 41)
    @PostMapping("/PostUserMaterialsCheck")
    public Result<Integer> PostUserMaterialsCheck(Long cid,Long checkstatus){
        log.debug("开始处理【修改油画屏用户上传素材数据审核状态】的业务，参数:{},{}",cid,checkstatus);
        return oilPaintingService.PostUserMaterialsCheck(cid,checkstatus);
    }

    @ApiOperation("删除油画屏用户上传素材数据")
    @ApiOperationSupport(order = 42)
    @GetMapping("/DeleteUserMaterialsCid/{cid}")
    public Result<Integer> DeleteUserMaterials(@PathVariable Long cid){
        log.debug("开始处理【删除油画屏用户上传素材数据】的业务，参数:{}",cid);
        return oilPaintingService.DeleteUserMaterials(cid);
    }

    @ApiOperation("修改主题")
    @ApiOperationSupport(order = 43)
    @GetMapping("/Get")
    public Result<Integer> Get(Long id,String themeName,Long themeType,String keywords,Long fenleiid,String moshi,String qiehuanshijian){
        log.debug("开始处理【修改主题】的请求，参数：{},{},{},{},{],{}",  id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
        return oilPaintingService.Get( id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
    }

    @ApiOperation("获取油画屏设置")
    @ApiOperationSupport(order = 44)
    @GetMapping("/GetOilpaintingSet")
    public Result<List<Yhpoilpaintingtimes>> GetOilpaintingSet() {
        log.debug("开始处理【获取油画屏设置】的业务，无参数");
        return oilPaintingService.GetOilpaintingSet();
    }

    @ApiOperation("修改油画屏设置")
    @ApiOperationSupport(order = 45)
    @PostMapping("/PostOilpaintingSet")
    public Result<Integer> PostOilpaintingSet(Yhpoilpaintingtimes yhpoilpaintingtimes) {
        log.debug("开始处理【修改油画屏设置】的业务，参数:{}",yhpoilpaintingtimes);
        return oilPaintingService.PostOilpaintingSet(yhpoilpaintingtimes);
    }

    @ApiOperation("油画屏添加分类")
    @ApiOperationSupport(order = 46)
    @PostMapping("/PostFenlei")
    public Result<Integer> PostFenlei(Yhpoilpaintingfenlei yhpoilpaintingfenlei) {
        log.debug("开始处理【修改油画屏设置】的业务，参数:{}",yhpoilpaintingfenlei);
        return oilPaintingService.PostFenlei(yhpoilpaintingfenlei);
    }

    @ApiOperation("获取所有分类")
    @ApiOperationSupport(order = 47)
    @GetMapping("/GetFenleiPageIndex/{pageindex}&{pagesize}")
    public Result<List<Yhpoilpaintingfenlei>> GetFenlei(@PathVariable Long pageindex, @PathVariable Long pagesize) {
        log.debug("开始处理【获取所有分类】的业务，参数:{},{}",pageindex,pagesize);
        return oilPaintingService.GetFenlei(pageindex,pagesize);
    }

    @ApiOperation("获取指定分类信息")
    @ApiOperationSupport(order = 48)
    @GetMapping("/GetFenleiByIDFenleiID/{fenleiID}")
    public Result<List<Yhpoilpaintingfenlei>> GetFenleiByID(@PathVariable Long fenleiID) {
        log.debug("开始处理【获取指定分类信息】的业务，参数:{}",fenleiID);
        return oilPaintingService.GetFenleiByID(fenleiID);
    }

    @ApiOperation("修改分类信息")
    @ApiOperationSupport(order = 49)
    @PostMapping("/UpdateFenleiAllField")
    public Result<Integer> UpdateFenleiAllField(Yhpoilpaintingfenlei yhpoilpaintingfenlei) {
        log.debug("开始处理【修改分类信息】的业务，参数:{}",yhpoilpaintingfenlei);
        return oilPaintingService.UpdateFenleiAllField(yhpoilpaintingfenlei);
    }

    @ApiOperation("删除分类")
    @ApiOperationSupport(order = 50)
    @GetMapping("/DeleteFenleiFenleiID/{fenleiID}")
    public Result<Integer> DeleteFenlei(@PathVariable Long fenleiID){
        log.debug("开始处理【删除分类】的业务，参数:{}",fenleiID);
        return oilPaintingService.DeleteFenlei(fenleiID);
    }

    @ApiOperation("分类绑定主题")
    @ApiOperationSupport(order = 51)
    @GetMapping("/FenleiBindingZhuti")
    public Result<Integer> FenleiBindingZhuti(Long fenleiID, Long zhutiID){
        log.debug("开始处理【分类绑定主题】的业务，参数:{},{]",fenleiID,zhutiID);
        return oilPaintingService.FenleiBindingZhuti(fenleiID,zhutiID);
    }


    @ApiOperation("获取指定分类下的主题")
    @ApiOperationSupport(order = 52)
    @GetMapping("/GetZhutiOfFenleiFenleiID/{fenleiID}&{pageIndex}&{pageSize}")
    public Result<List<Yhpoilpaintingtheme>> GetZhutiOfFenlei(@PathVariable Long fenleiID, @PathVariable Long pageIndex,@PathVariable Long pageSize){
        log.debug("开始处理【删除分类】的业务，参数:{},{},{]",fenleiID,pageIndex,pageSize);
        return oilPaintingService.GetZhutiOfFenlei(fenleiID,pageIndex,pageSize);
    }




}
