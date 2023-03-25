package com.rx.allbackstage.Service;

import com.rx.allbackstage.entity.Result;
import com.rx.allbackstage.entity.yhp.dto.*;
import com.rx.allbackstage.entity.yhp.entiey.*;
import com.rx.allbackstage.entity.yhp.vo.*;
import io.swagger.models.auth.In;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Transactional
public interface IOilPaintingService {

    /**
     * 获取搜索的图片
     * @param pageindex 页号
     * @param pagesize 页大小
     * @return
     */
    Result<List<Yhpoilpainting>> searchImage(int pageindex, int pagesize);

    /**
     * 获取指定机器的数据
     * @param mid
     * @return
     */
    Result<List<YhpOilPanintingmid>> SpecifiedMachineData(String mid);

    /**
     * 获取公共库的指定数据
     * @return
     */
    Result<List<Yhpoilpainting>> specifiedData(String cid);

    /**
     * 获取自定义库的指定数据
     */
    Result<List<YhpOilPanintingmid>> customLibrary(String cid);

    /**
     * 删除指定机器的资源
     * @param ids
     * @return
     */
    Result<Integer> GetMIDByID(Long ids);

    /**
     * 获取ocr资源指定数据
     * @param cid
     * @return
     */
    Result<List<YhpOilPanintingmid>> GetOCRByID(String cid);

    /**
     * 添加油画屏公共资源
     * @param yhpoilpaintingNewPub
     * @return
     */
    Result<Integer> PostNewPub(YhpoilpaintingNewPub yhpoilpaintingNewPub);

    /**
     * 添加油画屏公共资源2
     */
    Result<Integer> PostNewPub2(YhpoilpaintingNewPub2 yhpoilpaintingNewPub2);

    /**
     * 添加油画屏指定机器资源
     * @param yhpOilPanintingmid
     * @return
     */
    Result<Integer> PostNewWithMID(YhpOilPanintingmid yhpOilPanintingmid);

    /**
     * 给OCR油画添加关键字
     * @param cid keys
     * @param keys
     * @return
     */
    Result<Integer> PostOCRKeys(Long cid , String keys);

    /**
     * 获取所有机器
     * @return
     */
    Result<List<Yhpaimin>> list();

    /**
     *
     * 删除公共油画
     * @param ids
     * @return
     */
    Result<Integer> GetByID(Long[] ids);

    /**
     * 获取指定公共背景
     * @param cid
     * @return
     */
    Result<String> GetBKByID(Long cid);

    /**
     * 获取全部公共背景
     * @return
     */
    Result<List<Yhpoilpaintingbk>> GetBKAll();

    /**
     * 添加公共背景图
     * @param
     */
    Result<Integer> PostBK(YhpoilpaintingbkNewbk yhpoilpaintingbkNewbk);

    /**
     * 删除公共背景图
     * @param ids
     * @return
     */
    Result<Integer> GetBk(Long[] ids);

    /**
     * 获取指定自定义背景
     * @param cid
     * @return
     */
    Result<String> GetBKMidByID(Long cid);

    /**
     * 获取指定机器全部自定义背景
     * @return
     */
    Result<List<YhpoilpaintingbkmidVO>> GetBKMIDAll(String mid);

    /**
     * 添加自定义背景图
     * @param yhpoilpaintingbkmidNewbkmin
     */
    Result<Integer> PostBKMID(YhpoilpaintingNewbkmin yhpoilpaintingbkmidNewbkmin);

    /**
     * 删除自定义背景图
     * @param ids
     */
    Result<Integer> GetBkMID(Long[] ids);

    /**
     * 添加关键字和它对应的图片
     * @param yhpoilpaintingNewkeyimg
     */
    Result<Integer> PostKeyImg(YhpoilpaintingNewkeyimg yhpoilpaintingNewkeyimg);

    /**
     * 获取所有的关键字和对应的数据
     * @return
     */
    Result<List<Yhpoilpaintingkeyimg>> GetAllKeyImg();

    /**
     * 获取所有的关键字和对应的数据
     * @param keys
     * @return
     */
    Result<List<YhpoilpaintingkeyimgVO>> GetAllKeyImgByKeys(String keys);

    /**
     * 删除关键字和对应的数据
     * @param ids
     */
    Result<Integer> GetKeyImgByID(Long[] ids);



    /**
     * 获取主题列表
     * @return
     */
    Result<List<YhpoilpaintingthemeVO>> GetTheme();

    /**
     * 获取主题列表(分页）
     * @return
     */
    Result<List<YhpoilpaintingthemeVO>> GetThemeWithPage(int pageindex,int pagesize);

    /**
     * 删除主题
     * @param id
     * @return
     */
    Result<Integer> GetthemeDel(Long id);

    /**
     * 添加主题
     * @param yhpoilpaintingNewtheme
     * @return
     */
    Result<Integer> Postthemeadd(YhpoilpaintingNewtheme yhpoilpaintingNewtheme);

    /**
     * 修改主题
     * @param id
     * @param themeName
     * @param themeType
     * @param keywords
     * @param fenleiid
     * @param moshi
     * @param qiehuanshijian
     * @return
     */
    Result<Integer> PostthemeChange(Long id,String themeName,Long themeType,String keywords,Long fenleiid,String moshi,String qiehuanshijian);

    /**
     * 获取主题素材及详细
     * @param cid
     * @return
     */
    Result<List<YhpoilpaintingGetthemepicVO>> GetThemePic(String cid);

    /**
     * 获取设备的主题
     * @return
     */
    Result<List<YhpaiminoilpaintingthemeVO>> GetEquipTheme();

    /**
     * 修改油画屏主题
     * @param mid
     * @param themeid
     * @return
     */
    Result<Integer> PostoilThemeChange(String mid , Long themeid);

    /**
     * 修改所有油画屏主题
     * @param themeid
     * @return
     */
    Result<Integer> PostAlloilTheme(Long themeid);


    /**
     * 修改主题下关联图片关键词
     * @param theme_id
     * @param pic_id
     * @param keyword
     * @return
     */
    Result<Integer> PostThemePicKeyword(Long theme_id , Long pic_id , String keyword);

    /**
     * 油画屏添加用户上传素材
     * @param yhpoilpaintingNewupload
     * @return
     */
    Result<Integer> PostUserMaterials(YhpoilpaintingNewupload yhpoilpaintingNewupload);

    /**
     *获取所有油画屏用户上传素材数据
     */
    Result<List<Yhpoilpaintingupload>> GetUserMaterials(Long pageIndex,Long pageSize);

    /**
     * 修改油画屏用户上传素材数据审核状态
     * @param cid
     * @param checkstatus
     * @return
     */
    Result<Integer> PostUserMaterialsCheck(Long cid , Long checkstatus);

    /**
     * 删除油画屏用户上传素材数据
     * @param cid
     * @return
     */
    Result<Integer>  DeleteUserMaterials(Long cid);

    /**
     *修改主题
     * @return
     */
    Result<Integer> Get(Long id,String themeName,Long themeType,String keywords,Long fenleiid,String moshi,String qiehuanshijian);

    /**
     * 获取油画屏设置
     * @return
     */
    Result<List<Yhpoilpaintingtimes>> GetOilpaintingSet();

    /**
     * 修改油画屏设置
     * @param yhpoilpaintingtimes
     * @return
     */
    Result<Integer> PostOilpaintingSet(Yhpoilpaintingtimes yhpoilpaintingtimes);

    /**
     * 油画屏添加分类
     * @param yhpoilpaintingfenlei
     * @return
     */
    Result<Integer> PostFenlei(Yhpoilpaintingfenlei yhpoilpaintingfenlei);

    /**
     * 获取所有分类
     * @param pageindex
     * @param pagesize
     * @return
     */
    Result<List<Yhpoilpaintingfenlei>> GetFenlei(Long pageindex,Long pagesize);

    /**
     * 获取指定分类信息
     * @param fenleiID
     * @return
     */
    Result<List<Yhpoilpaintingfenlei>> GetFenleiByID(Long fenleiID);

    /**
     * 修改分类信息
     * @param yhpoilpaintingfenlei
     * @return
     */
    Result<Integer> UpdateFenleiAllField(Yhpoilpaintingfenlei yhpoilpaintingfenlei);

    /**
     * 删除分类
     * @param fenleiID
     * @return
     */
    Result<Integer> DeleteFenlei(Long fenleiID);

    /**
     * 分类绑定主题
     * @param fenleiID
     * @param zhutiID
     * @return
     */
    Result<Integer> FenleiBindingZhuti(Long fenleiID,Long zhutiID);

    /**
     * 获取指定分类下的主题
     * @param fenleiID
     * @param pageIndex
     * @param pageSize
     * @return
     */
    Result<List<Yhpoilpaintingtheme>> GetZhutiOfFenlei(Long fenleiID, Long pageIndex, Long pageSize);

}
