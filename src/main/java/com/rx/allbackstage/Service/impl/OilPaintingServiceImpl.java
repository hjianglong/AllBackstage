package com.rx.allbackstage.Service.impl;

import com.rx.allbackstage.Service.IOilPaintingService;
import com.rx.allbackstage.entity.Result;
import com.rx.allbackstage.entity.yhp.dto.*;
import com.rx.allbackstage.entity.yhp.entiey.*;
import com.rx.allbackstage.entity.yhp.vo.*;
import com.rx.allbackstage.mapper.OilPaintingMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class OilPaintingServiceImpl implements IOilPaintingService {

    @Autowired
    OilPaintingMapper oilPaintingMapper;

    @Override
    public Result<List<Yhpoilpainting>> searchImage(int pageindex, int pagesize) {
        try {
            log.debug("开始处理【获取搜索的图片】的业务，参数:{},{}",pageindex,pagesize);
            List<Yhpoilpainting> list = oilPaintingMapper.searchImage(pageindex,pagesize);
            String counta = oilPaintingMapper.searchImagecount();
            if (list == null) {
                return new Result<>(false,"获取搜索的图片失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取搜索的图片成功：{}",list,counta);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpOilPanintingmid>> SpecifiedMachineData(String mid) {
        try {
            log.debug("开始处理【获取指定机器的数据】的业务，参数:{},",mid);
            List<YhpOilPanintingmid> list = oilPaintingMapper.SpecifiedMachineData(mid);
            if (list == null) {
                return new Result<>(false,"获取指定机器的数据，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取指定机器的数据成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpainting>> specifiedData(String cid) {
        try {
            log.debug("开始处理【获取公共库的指定数据】的业务，参数:{},",cid);
            List<Yhpoilpainting> list = oilPaintingMapper.specifiedData(cid);
            if (list == null) {
                return new Result<>(false,"获取公共库的指定数据失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取公共库的指定数据成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpOilPanintingmid>> customLibrary(String cid) {
        try {
            log.debug("开始处理【获取自定义库的指定数据】的业务，参数:{},",cid);
            List<YhpOilPanintingmid> list = oilPaintingMapper.customLibrary(cid);
            if (list == null) {
                return new Result<>(false,"获取自定义库的指定数据失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取自定义库的指定数据成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> GetMIDByID(Long ids) {
        try {
            log.debug("开始处理【删除指定机器的资源】的业务，参数:{},",ids);
            int rows = oilPaintingMapper.GetMIDByID(ids);
            if (rows != 1) {
                return new Result<>(false,"删除指定机器的资源失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"删除指定机器的资源成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpOilPanintingmid>> GetOCRByID(String cid) {
        try {
            log.debug("开始处理【获取ocr资源指定数据】的业务，参数:{},",cid);
            List<YhpOilPanintingmid> list = oilPaintingMapper.GetOCRByID(cid);
            if (list == null) {
                return new Result<>(false,"获取ocr资源指定数据失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取ocr资源指定数据成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostNewPub(YhpoilpaintingNewPub yhpoilpaintingNewPub) {
        try {
            log.debug("开始处理【添加油画屏公共资源】的业务，参数：{}", yhpoilpaintingNewPub);
            Yhpoilpainting yhpoilpainting = new Yhpoilpainting();
            BeanUtils.copyProperties(yhpoilpaintingNewPub,yhpoilpainting);
            log.debug("添加油画屏公共资源：{}", yhpoilpainting);
            int rows = oilPaintingMapper.PostNewPub(yhpoilpainting);
            if (rows != 1) {
                return new Result<>(false,"添加油画屏公共资源失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取ocr资源指定数据成功");
            }
        }  catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }



    @Override
    public Result<Integer> PostNewPub2(YhpoilpaintingNewPub2 yhpoilpaintingNewPub2) {
        try {
            log.debug("开始处理【添加油画屏公共资源2】的业务，参数：{}", yhpoilpaintingNewPub2);
            Yhpoilpainting yhpoilpainting = new Yhpoilpainting();
            BeanUtils.copyProperties(yhpoilpaintingNewPub2,yhpoilpainting);
            log.debug("添加油画屏公共资源2：{}", yhpoilpainting);
            int rows = oilPaintingMapper.PostNewPub2(yhpoilpainting);
            if (rows != 1) {
                return new Result<>(false,"添加油画屏公共资源2失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取ocr资源指定数据2成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostNewWithMID(YhpOilPanintingmid yhpOilPanintingmid) {
        try {
            log.debug("开始处理【添加油画屏指定机器资源】的业务，参数：{}", yhpOilPanintingmid);
            int rows = oilPaintingMapper.PostNewWithMID(yhpOilPanintingmid);
            if (rows != 1) {
                return new Result<>(false,"添加油画屏指定机器资源失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"添加油画屏指定机器资源成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostOCRKeys(Long cid, String keys) {
        try {
            log.debug("开始处理【给OCR油画添加关键字】的业务，参数ID：{}，新数据：{}", cid, keys);
            int rows = oilPaintingMapper.PostOCRKeys(cid,keys);
            if (rows != 1) {
                return new Result<>(false,"给OCR油画添加关键字失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"给OCR油画添加关键字成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpaimin>> list() {
        try {
            log.debug("开始处理【获取所有机器】的业务，无参数");
            List<Yhpaimin> list = oilPaintingMapper.list();
            Iterator<Yhpaimin> iterator = list.iterator();
            while (iterator.hasNext()) {
                Yhpaimin yhpaimin = iterator.next();
            }
            return new Result<>(true,"获取所有机器成功",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> GetByID(Long[] ids) {
        try {
            log.debug("开始处理【删除公共油画】的业务，参数:{},",ids);
            int rows = oilPaintingMapper.GetByID(ids);
            if (rows != 1) {
                return new Result<>(false,"删除公共油画失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"删除公共油画成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<String> GetBKByID(Long cid) {
        try {
            log.debug("开始处理【获取指定公共背景】的业务，参数:{},",cid);
            String list= oilPaintingMapper.GetBKByID(cid);
            if (list == null) {
                return new Result<>(false,"获取指定公共背景失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取指定公共背景成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpaintingbk>> GetBKAll() {
        try {
            log.debug("开始处理【获取全部公共背景】的业务，无参数");
            List<Yhpoilpaintingbk> list = oilPaintingMapper.GetBKAll();
            Iterator<Yhpoilpaintingbk> iterator = list.iterator();
            while (iterator.hasNext()) {
                Yhpoilpaintingbk yhpaimin = iterator.next();
            }
            return new Result<>(true,"获取全部公共背景",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostBK(YhpoilpaintingbkNewbk yhpoilpaintingbkNewbk) {
        try {
            log.debug("开始处理【添加公共背景图】的业务，参数：{}", yhpoilpaintingbkNewbk);
            Yhpoilpaintingbk yhpoilpaintingbk = new Yhpoilpaintingbk();
            BeanUtils.copyProperties(yhpoilpaintingbkNewbk,yhpoilpaintingbk);
            log.debug("添加公共背景图：{}", yhpoilpaintingbk);
            int rows = oilPaintingMapper.PostBK(yhpoilpaintingbk);
            if (rows != 1) {
                return new Result<>(false,"添加公共背景图失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"添加公共背景图成功");
            }
        }catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> GetBk(Long[] ids) {
        try {
            log.debug("开始处理【删除公共背景图】的业务，参数:{},",ids);
            int rows = oilPaintingMapper.GetBk(ids);
            if (rows != 1) {
                return new Result<>(false,"删除公共背景图失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"删除公共背景图成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<String> GetBKMidByID(Long cid) {
        try {
            log.debug("开始处理【获取指定自定义背景】的业务，参数:{},",cid);
            String list= oilPaintingMapper.GetBKMidByID(cid);
            if (list == null) {
                return new Result<>(false,"获取指定自定义背景失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取指定自定义背景成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpoilpaintingbkmidVO>> GetBKMIDAll(String mid) {
        try {
            log.debug("开始处理【获取指定机器全部自定义背景】的业务，参数:{}",mid);
            List<YhpoilpaintingbkmidVO> list = oilPaintingMapper.GetBKMIDAll(mid);
            Iterator<YhpoilpaintingbkmidVO> iterator = list.iterator();
            while (iterator.hasNext()) {
                YhpoilpaintingbkmidVO yhpoilpaintingbkmidVO = iterator.next();
            }
            return new Result<>(true,"获取指定机器全部自定义背景成功",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostBKMID(YhpoilpaintingNewbkmin yhpoilpaintingbkmidNewbkmin) {
        try {
            log.debug("开始处理【添加自定义背景图】的业务，参数：{}", yhpoilpaintingbkmidNewbkmin);
            Yhpoilpaintingbkmid yhpoilpaintingbkmid = new Yhpoilpaintingbkmid();
            BeanUtils.copyProperties(yhpoilpaintingbkmidNewbkmin,yhpoilpaintingbkmid);
            log.debug("添加自定义背景图：{}", yhpoilpaintingbkmid);
            int rows = oilPaintingMapper.PostBKMID(yhpoilpaintingbkmid);
            if (rows != 1) {
                return new Result<>(false,"添加自定义背景图失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"添加自定义背景图成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> GetBkMID(Long[] ids) {
        try {
            log.debug("开始处理【删除自定义背景图】的业务，参数:{},",ids);
            int rows = oilPaintingMapper.GetBkMID(ids);
            if (rows != 1) {
                return new Result<>(false,"删除自定义背景图失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"删除自定义背景图成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostKeyImg(YhpoilpaintingNewkeyimg yhpoilpaintingNewkeyimg) {
        try {
            log.debug("开始处理【添加关键字和它对应的图片】的业务，参数：{}", yhpoilpaintingNewkeyimg);
            Yhpoilpaintingkeyimg yhpoilpaintingkeyimg = new Yhpoilpaintingkeyimg();
            BeanUtils.copyProperties(yhpoilpaintingNewkeyimg,yhpoilpaintingkeyimg);
            log.debug("添加关键字和它对应的图片：{}", yhpoilpaintingkeyimg);
            String keyword = yhpoilpaintingNewkeyimg.getObjectkey();
            int rows = oilPaintingMapper.PostKeyImg(yhpoilpaintingkeyimg);
            int rowss = oilPaintingMapper.getObjectkey(keyword);
            if (rows != 1) {
                return new Result<>(false,"添加关键字和它对应的图片失败，尝试访问的数据不存在！");
            }
            if (rowss != 1 ){
                return new Result<>(false,"添加关键字和它对应的图片失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"添加关键字和它对应的图片成功");
            }
        } catch (BeansException e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpaintingkeyimg>> GetAllKeyImg() {
        try {
            log.debug("开始处理【获取所有的关键字和对应的数据】的业务，无参数");
            List<Yhpoilpaintingkeyimg> list = oilPaintingMapper.GetAllKeyImg();
            Iterator<Yhpoilpaintingkeyimg> iterator = list.iterator();
            while (iterator.hasNext()) {
                Yhpoilpaintingkeyimg yhpoilpaintingkeyimg = iterator.next();
            }
            return new Result<>(true,"获取所有的关键字和对应的数据",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpoilpaintingkeyimgVO>> GetAllKeyImgByKeys(String keys) {
        try {
            log.debug("开始处理【获取所有的关键字和对应的数据】的业务，参数:{}",keys);
            List<YhpoilpaintingkeyimgVO> list = oilPaintingMapper.GetAllKeyImgByKeys(keys);
            Iterator<YhpoilpaintingkeyimgVO> iterator = list.iterator();
            while (iterator.hasNext()) {
                YhpoilpaintingkeyimgVO yhpoilpaintingkeyimgVO = iterator.next();
            }
            return new Result<>(true,"获取所有的关键字和对应的数据",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> GetKeyImgByID(Long[] ids) {
        try {
            log.debug("开始处理【删除关键字和对应的数据】的业务，参数:{},",ids);
            int rows = oilPaintingMapper.GetKeyImgByID(ids);
            if (rows != 1) {
                return new Result<>(false,"删除关键字和对应的数据失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"删除关键字和对应的数据成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }



    @Override
    public Result<List<YhpoilpaintingthemeVO>> GetTheme() {
        try {
            log.debug("开始处理【获取主题列表】的业务，无参数");
            List<YhpoilpaintingthemeVO> list = oilPaintingMapper.GetTheme();
            Iterator<YhpoilpaintingthemeVO> iterator = list.iterator();
            while (iterator.hasNext()) {
                YhpoilpaintingthemeVO yhpoilpaintingthemeVO = iterator.next();
            }
            return new Result<>(true,"获取主题列表成功",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpoilpaintingthemeVO>> GetThemeWithPage(int pageindex, int pagesize) {
        try {
            log.debug("开始处理【获取主题列表(分页）】的业务，参数:{},{}",pageindex,pagesize);
            List<YhpoilpaintingthemeVO> list = oilPaintingMapper.GetThemeWithPage(pageindex,pagesize);
            String count = oilPaintingMapper.GetThemeWithPagecount();
            if (list == null) {
                return new Result<>(false,"获取主题列表(分页）失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取主题列表(分页）成功",list,count);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> GetthemeDel(Long id) {
        try {
            log.debug("开始处理【删除主题】的业务，参数:{},",id);
            int rows = oilPaintingMapper.GetthemeDel(id);
            oilPaintingMapper.GetThemeid(id);
            if (rows != 1) {
                return new Result<>(false,"删除主题失败，尝试访问的数据不存在！");
            }else{
                return new Result<>(true,"删除主题成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> Postthemeadd(YhpoilpaintingNewtheme yhpoilpaintingNewtheme) {
        try {
            log.debug("开始处理【添加主题】的业务，参数：{}", yhpoilpaintingNewtheme);
            Yhpoilpaintingtheme yhpoilpaintingtheme = new Yhpoilpaintingtheme();
            BeanUtils.copyProperties(yhpoilpaintingNewtheme,yhpoilpaintingtheme);
            log.debug("添加油画屏公共资源：{}", yhpoilpaintingtheme);
            int rows = oilPaintingMapper.Postthemeadd(yhpoilpaintingtheme);
            if (rows != 1) {
                return new Result<>(false,"添加主题失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"添加主题成功");
            }
        }  catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostthemeChange(Long id, String themeName, Long themeType, String keywords, Long fenleiid, String moshi, String qiehuanshijian) {
        try {
            log.debug("开始处理【修改主题】的业务，参数ID：{}，新数据：{},{},{},{},{},{},{]", id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
            int rows = oilPaintingMapper.PostthemeChange(id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
            oilPaintingMapper.postthemepicChange(id,keywords);
            if (rows != 1) {
                return new Result<>(false,"修改主题失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"修改主题成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpoilpaintingGetthemepicVO>> GetThemePic(String cid) {
        try {
            log.debug("开始处理【获取主题素材及详细】的业务，无参数");
            List<YhpoilpaintingGetthemepicVO> list = oilPaintingMapper.GetThemePic(cid);
            Iterator<YhpoilpaintingGetthemepicVO> iterator = list.iterator();
            while (iterator.hasNext()) {
                YhpoilpaintingGetthemepicVO yhpoilpaintingGetthemepicVO = iterator.next();
            }
            return new Result<>(true,"获取主题素材及详细成功",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<YhpaiminoilpaintingthemeVO>> GetEquipTheme() {
        try {
            log.debug("开始处理【获取设备的主题】的业务，无参数");
            List<YhpaiminoilpaintingthemeVO> list = oilPaintingMapper.GetEquipTheme();
            Iterator<YhpaiminoilpaintingthemeVO> iterator = list.iterator();
            while (iterator.hasNext()) {
                YhpaiminoilpaintingthemeVO yhpaiminoilpaintingthemeVO = iterator.next();
            }
            return new Result<>(true,"获取设备的主题成功",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostoilThemeChange(String mid, Long themeid) {
        try {
            log.debug("开始处理【修改油画屏主题】的业务，参数MID：{}，新数据：{}", mid,themeid);
            int rows = oilPaintingMapper.PostoilThemeChange(mid,themeid);
            if (rows != 1) {
                return new Result<>(false,"修改油画屏主题失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"修改油画屏主题成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostAlloilTheme(Long themeid) {
        try {
            log.debug("开始处理【修改所有油画屏主题】的业务，参数:{}",themeid);
            int rows = oilPaintingMapper.PostAlloilTheme(themeid);
            if (rows > 0) {
                return new Result<>(true,"修改所有油画屏主题成功");
            }else {
                return new Result<>(false,"修改所有油画屏主题失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }



    @Override
    public Result<Integer> PostThemePicKeyword(Long theme_id, Long pic_id, String keyword) {
        try {
            log.debug("开始处理【修改主题下关联图片关键词】的业务，参数:{},{},{}",theme_id,pic_id,keyword);
            int rows = oilPaintingMapper.PostThemePicKeyword(theme_id,pic_id,keyword);
            if (rows > 0) {
                return new Result<>(true,"修改主题下关联图片关键词成功");
            }else {
                return new Result<>(false,"修改主题下关联图片关键词失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostUserMaterials(YhpoilpaintingNewupload yhpoilpaintingNewupload) {
        try {
            log.debug("开始处理【油画屏添加用户上传素材】的业务，参数：{}", yhpoilpaintingNewupload);
            Yhpoilpaintingupload yhpoilpaintingupload = new Yhpoilpaintingupload();
            BeanUtils.copyProperties(yhpoilpaintingNewupload,yhpoilpaintingupload);
            log.debug("油画屏添加用户上传素材：{}", yhpoilpaintingupload);
            int rows = oilPaintingMapper.PostUserMaterials(yhpoilpaintingupload);
            if (rows != 1) {
                return new Result<>(false,"油画屏添加用户上传素材失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"油画屏添加用户上传素材成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpaintingupload>> GetUserMaterials(Long pageIndex, Long pageSize) {
        try {
            log.debug("开始处理【获取所有油画屏用户上传素材数据】的业务，参数:{},{}",pageIndex,pageSize);
            List<Yhpoilpaintingupload> list = oilPaintingMapper.GetUserMaterials(pageIndex,pageSize);
            String count = oilPaintingMapper.GetUserMaterialscount();
            if (list == null) {
                return new Result<>(false,"获取所有油画屏用户上传素材数据失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取所有油画屏用户上传素材数据成功",list,count);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }


    @Override
    public Result<Integer> PostUserMaterialsCheck(Long cid, Long checkstatus) {
        try {
            log.debug("开始处理【修改油画屏用户上传素材数据审核状态】的业务，参数ID：{}，新数据：{},{}]", cid, checkstatus);
            int rows = oilPaintingMapper.PostUserMaterialsCheck(cid, checkstatus);
            oilPaintingMapper.Postzizeng(cid);
            if (rows < 0) {
                return new Result<>(false,"修改油画屏用户上传素材数据审核状态失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"修改油画屏用户上传素材数据审核状态成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> DeleteUserMaterials(Long cid) {
        try {
            log.debug("开始处理【删除油画屏用户上传素材数据】的业务，参数:{},",cid);
            int rows = oilPaintingMapper.DeleteUserMaterials(cid);
            if (rows != 1) {
                return new Result<>(false,"删除油画屏用户上传素材数据失败，尝试访问的数据不存在！");
            }else{
                return new Result<>(true,"删除油画屏用户上传素材数据成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> Get(Long id, String themeName, Long themeType, String keywords, Long fenleiid, String moshi, String qiehuanshijian) {
        try {
            log.debug("开始处理【修改主题】的业务，参数ID：{}，新数据：{},{},{},{},{},{},{]", id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
            int rows = oilPaintingMapper.Get(id, themeName,themeType,keywords,fenleiid,moshi,qiehuanshijian);
            oilPaintingMapper.GetPic(id,keywords);
            if (rows != 1) {
                return new Result<>(false,"修改主题失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"修改主题成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpaintingtimes>> GetOilpaintingSet() {
        try {
            log.debug("开始处理【获取油画屏设置】的业务，无参数");
            List<Yhpoilpaintingtimes> list = oilPaintingMapper.GetOilpaintingSet();
            Iterator<Yhpoilpaintingtimes> iterator = list.iterator();
            while (iterator.hasNext()) {
                Yhpoilpaintingtimes yhpoilpaintingtimes = iterator.next();
            }
            return new Result<>(true,"获取油画屏设置成功",list);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostOilpaintingSet(Yhpoilpaintingtimes yhpoilpaintingtimes) {
        try {
            log.debug("开始处理【修改油画屏设置】的业务，参数:{}",yhpoilpaintingtimes);
            int rows = oilPaintingMapper.PostOilpaintingSet(yhpoilpaintingtimes);
            if (rows > 0) {
                return new Result<>(true,"修改油画屏设置成功");
            }else {
                return new Result<>(false,"修改油画屏设置失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> PostFenlei(Yhpoilpaintingfenlei yhpoilpaintingfenlei) {
        try {
            log.debug("开始处理【油画屏添加分类】的业务，参数：{}", yhpoilpaintingfenlei);
            int rows = oilPaintingMapper.PostFenlei(yhpoilpaintingfenlei);
            if (rows != 1) {
                return new Result<>(false,"油画屏添加分类失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"油画屏添加分类成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpaintingfenlei>> GetFenlei(Long pageindex, Long pagesize) {
        try {
            log.debug("开始处理【获取所有分类】的业务，参数:{},{}",pageindex,pagesize);
            List<Yhpoilpaintingfenlei> list = oilPaintingMapper.GetFenlei(pageindex,pagesize);
            String count = oilPaintingMapper.GetFenleicount();
            if (list == null) {
                return new Result<>(false,"获取所有分类失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取所有分类成功",list,count);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpaintingfenlei>> GetFenleiByID(Long fenleiID) {
        try {
            log.debug("开始处理【获取指定分类信息】的业务，参数:{}",fenleiID);
            List<Yhpoilpaintingfenlei> list = oilPaintingMapper.GetFenleiByID(fenleiID);
            if (list == null) {
                return new Result<>(false,"获取指定分类信息失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取指定分类信息成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> UpdateFenleiAllField(Yhpoilpaintingfenlei yhpoilpaintingfenlei) {
        try {
            log.debug("开始处理【修改分类信息】的业务，参数:{}",yhpoilpaintingfenlei);
            int rows = oilPaintingMapper.UpdateFenleiAllField(yhpoilpaintingfenlei);
            if (rows > 0) {
                return new Result<>(true,"修改分类信息成功");
            }else {
                return new Result<>(false,"修改分类信息失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> DeleteFenlei(Long fenleiID) {
        try {
            log.debug("开始处理【删除分类】的业务，参数:{},",fenleiID);
            int rows = oilPaintingMapper.DeleteFenlei(fenleiID);
            if (rows != 1) {
                return new Result<>(false,"删除分类失败，尝试访问的数据不存在！");
            }else{
                return new Result<>(true,"删除分类成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<Integer> FenleiBindingZhuti(Long fenleiID, Long zhutiID) {
        try {
            log.debug("开始处理【分类绑定主题】的业务，参数:{},{}",fenleiID,zhutiID);
            int rows = oilPaintingMapper.FenleiBindingZhuti(fenleiID,zhutiID);
            if (rows > 0) {
                return new Result<>(true,"分类绑定主题成功");
            }else {
                return new Result<>(false,"分类绑定主题失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

    @Override
    public Result<List<Yhpoilpaintingtheme>> GetZhutiOfFenlei(Long fenleiID, Long pageIndex, Long pageSize) {
        try {
            log.debug("开始处理【获取指定分类下的主题】的业务，参数:{},{}",fenleiID,pageIndex,pageSize);
            List<Yhpoilpaintingtheme> list = oilPaintingMapper.GetZhutiOfFenlei(fenleiID,pageIndex,pageSize);
            if (list == null) {
                return new Result<>(false,"获取指定分类下的主题失败，尝试访问的数据不存在！");
            }else {
                return new Result<>(true,"获取指定分类下的主题成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false,"服务异常");
        }
    }

}
