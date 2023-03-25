package com.rx.allbackstage.mapper;

import com.rx.allbackstage.entity.yhp.entiey.*;
import com.rx.allbackstage.entity.yhp.vo.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OilPaintingMapper {

    /**
     * 获取搜索的图片
     * @param pageindex 页号
     * @param pagesize 页大小
     * @return
     */
    List<Yhpoilpainting> searchImage(int pageindex,int pagesize);
    String searchImagecount();

    /**
     * 获取指定机器的数据
     * @param mid
     * @return
     */
    List<YhpOilPanintingmid> SpecifiedMachineData(String mid);

    /**
     * 获取公共库的指定数据
     * @return
     */
    List<Yhpoilpainting> specifiedData(String cid);

    /**
     * 获取自定义库的指定数据
     */
    List<YhpOilPanintingmid> customLibrary(String cid);

    /**
     * 删除指定机器的资源
     * @param ids
     * @return
     */
    int GetMIDByID(Long ids);

    /**
     * 获取ocr资源指定数据
     * @param cid
     * @return
     */
    List<YhpOilPanintingmid> GetOCRByID(String cid);

    /**
     * 添加油画屏公共资源
     * @param yhpoilpainting
     * @return
     */
    int PostNewPub(Yhpoilpainting yhpoilpainting);

    /**
     * 添加油画屏公共资源2
     * @param yhpoilpainting
     * @return
     */
    int PostNewPub2(Yhpoilpainting yhpoilpainting);

    /**
     * 添加油画屏指定机器资源
     * @param yhpOilPanintingmid
     * @return
     */
    int PostNewWithMID(YhpOilPanintingmid yhpOilPanintingmid);

    /**
     * 给OCR油画添加关键字
     * @param
     * @return
     */
    int PostOCRKeys(Long cid , String keys);


    /**
     * 获取所有机器
     * @return
     */
    List<Yhpaimin> list();

    /**
     *
     * 删除公共油画
     * @param ids
     * @return
     */
    int GetByID(Long[] ids);

    /**
     * 获取指定公共背景
     * @param cid
     * @return
     */
    String GetBKByID(Long cid);

    /**
     * 获取全部公共背景
     * @return
     */
    List<Yhpoilpaintingbk> GetBKAll();

    /**
     * 添加公共背景图
     * @param
     * @return
     */
    int PostBK(Yhpoilpaintingbk yhpoilpaintingbk);

    /**
     * 删除公共背景图
     * @param ids
     * @return
     */
    int GetBk(Long[] ids);

    /**
     * 获取指定自定义背景
     * @param cid
     * @return
     */
    String GetBKMidByID(Long cid);

    /**
     * 获取指定机器全部自定义背景
     * @return
     */
    List<YhpoilpaintingbkmidVO> GetBKMIDAll(String mid);

    /**
     * 添加自定义背景图
     * @param yhpoilpaintingbkmid
     * @return
     */
    int PostBKMID(Yhpoilpaintingbkmid yhpoilpaintingbkmid);

    /**
     * 删除自定义背景图
     * @param ids
     * @return
     */
    int GetBkMID(Long[] ids);

    /**
     * 添加关键字和它对应的图片
     * @param yhpoilpaintingkeyimg
     * @return
     */
    int PostKeyImg(Yhpoilpaintingkeyimg yhpoilpaintingkeyimg);
    int getObjectkey(String keyword);

    /**
     * 获取所有的关键字和对应的数据
     * @return
     */
    List<Yhpoilpaintingkeyimg> GetAllKeyImg();

    /**
     * 获取所有的关键字和对应的数据
     * @param keys
     * @return
     */
    List<YhpoilpaintingkeyimgVO> GetAllKeyImgByKeys(String keys);

    /**
     * 删除关键字和对应的数据
     * @param ids
     * @return
     */
    int GetKeyImgByID(Long[] ids);

    /**
     * 获取主题列表
     * @return
     */
    List<YhpoilpaintingthemeVO> GetTheme();

    /**
     * 获取主题列表(分页）
     * @return
     */
    List<YhpoilpaintingthemeVO> GetThemeWithPage(int pageindex,int pagesize);
    String GetThemeWithPagecount();

    /**
     * 删除主题
     * @param id
     * @return
     */
    int GetthemeDel(Long id);
    int GetThemeid(Long themeid);

    /**
     * 添加主题
     * @param yhpoilpaintingtheme
     * @return
     */
    int Postthemeadd(Yhpoilpaintingtheme yhpoilpaintingtheme);

    /**
     * 修改主题
     * @return
     */
    int PostthemeChange(Long id,String themeName,Long themeType,String keywords,Long fenleiid,String moshi,String qiehuanshijian);
    int postthemepicChange(Long id,String keywords);

    /**
     * 获取主题素材及详细
     * @param cid
     * @return
     */
    List<YhpoilpaintingGetthemepicVO> GetThemePic(String cid);

    /**
     * 获取设备的主题
     * @return
     */
    List<YhpaiminoilpaintingthemeVO> GetEquipTheme();

    /**
     * 修改油画屏主题
     * @param mid
     * @param themeid
     * @return
     */
    int PostoilThemeChange(String mid , Long themeid);

    /**
     * 修改所有油画屏主题
     * @param themeid
     * @return
     */
    int PostAlloilTheme(Long themeid);

    /**
     * 修改主题下关联图片关键词
     * @param theme_id
     * @param pic_id
     * @param keyword
     * @return
     */
    int PostThemePicKeyword(Long theme_id , Long pic_id , String keyword);

    /**
     * 油画屏添加用户上传素材
     * @param yhpoilpaintingupload
     * @return
     */
    int PostUserMaterials(Yhpoilpaintingupload yhpoilpaintingupload);

    /**
     *获取所有油画屏用户上传素材数据
     *
     */
    List<Yhpoilpaintingupload> GetUserMaterials(Long pageIndex,Long pageSize);
    String GetUserMaterialscount();

    /**
     * 修改油画屏用户上传素材数据审核状态
     * @param cid
     * @param checkstatus
     * @return
     */
    int PostUserMaterialsCheck(Long cid , Long checkstatus);
    int Postzizeng(Long cid);

    /**
     * 删除油画屏用户上传素材数据
     * @param cid
     * @return
     */
    int DeleteUserMaterials(Long cid);

    /**
     * 修改主题
     * @return
     */
    int Get(Long id,String themeName,Long themeType,String keywords,Long fenleiid,String moshi,String qiehuanshijian);
    int GetPic(Long id,String keywords);

    /**
     * 获取油画屏设置
     * @return
     */
    List<Yhpoilpaintingtimes> GetOilpaintingSet();

    /**
     * 修改油画屏设置
     * @param yhpoilpaintingtimes
     * @return
     */
    int PostOilpaintingSet(Yhpoilpaintingtimes yhpoilpaintingtimes);

    /**
     * 油画屏添加分类
     * @param yhpoilpaintingfenlei
     * @return
     */
    int PostFenlei(Yhpoilpaintingfenlei yhpoilpaintingfenlei);

    /**
     * 获取所有分类
     * @param pageindex
     * @param pagesize
     * @return
     */
    List<Yhpoilpaintingfenlei> GetFenlei(Long pageindex,Long pagesize);
    String GetFenleicount();

    /**
     * 获取指定分类信息
     * @param fenleiID
     * @return
     */
    List<Yhpoilpaintingfenlei> GetFenleiByID(Long fenleiID);

    /**
     * 修改分类信息
     * @param yhpoilpaintingfenlei
     * @return
     */
    int UpdateFenleiAllField(Yhpoilpaintingfenlei yhpoilpaintingfenlei);

    /**
     * 删除分类
     * @param fenleiID
     * @return
     */
    int DeleteFenlei(Long fenleiID);

    /**
     * 分类绑定主题
     * @param fenleiID
     * @param zhutiID
     * @return
     */
    int FenleiBindingZhuti(Long fenleiID,Long zhutiID);

    /**
     * 获取指定分类下的主题
     * @param fenleiID
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<Yhpoilpaintingtheme> GetZhutiOfFenlei(Long fenleiID, Long pageIndex, Long pageSize);

}
