package com.rx.allbackstage.Service.impl;

import com.rx.allbackstage.Service.IAisgxxsgService;
import com.rx.allbackstage.entity.Result;
import com.rx.allbackstage.entity.aisg.dto.TaibookcasenewDTO;
import com.rx.allbackstage.entity.aisg.dto.TaibookcaserequestautoDTO;
import com.rx.allbackstage.entity.aisg.dto.TaibookcaserequestuserDTO;
import com.rx.allbackstage.entity.aisg.entity.Taibookcasenew;
import com.rx.allbackstage.entity.aisg.entity.Taibookcaserequestauto;
import com.rx.allbackstage.entity.aisg.entity.Taibookcaserequestuser;
import com.rx.allbackstage.entity.aisg.vo.TaibookcaseVO;
import com.rx.allbackstage.entity.yhp.entiey.Yhpaimin;
import com.rx.allbackstage.entity.yhp.entiey.Yhpoilpainting;
import com.rx.allbackstage.mapper.AisgxxsgMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Slf4j
@Service
public class AisgxxsgServiceImpl implements IAisgxxsgService {

    @Autowired
    AisgxxsgMapper aisgxxsgMapper;

    @Override
    public Result<List<Taibookcasenew>> GetNewByMid(String mid,String bookclass) {
        try {
            log.debug("开始处理【获取新上架书柜图书表】的业务，参数:{}", mid);
            List<Taibookcasenew> list = aisgxxsgMapper.GetNewByMid(mid,bookclass);
            if (list == null) {
                return new Result<>(false, "获取新上架书柜图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "获取新上架书柜图书表成功", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<List<Taibookcasenew>> GetNewByID(Long id) {
        try {
            log.debug("开始处理【获取新上架书柜图书表】的业务，参数:{}", id);
            List<Taibookcasenew> list = aisgxxsgMapper.GetNewByID(id);
            if (list == null) {
                return new Result<>(false, "获取新上架书柜图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "获取新上架书柜图书表成功", list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> PostNew(TaibookcasenewDTO taibookcasenewDTO) {
        try {
            log.debug("开始处理【添加新上架书柜图书表】的业务，参数：{}", taibookcasenewDTO);
            Taibookcasenew taibookcasenew = new Taibookcasenew();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            String localDateTimeNowStr = localDateTimeNow.format(formatter);
            taibookcasenewDTO.setIntime(localDateTimeNowStr);
            BeanUtils.copyProperties(taibookcasenewDTO, taibookcasenew);
            log.debug("添加新上架书柜图书表：{}", taibookcasenew);
            int rows = aisgxxsgMapper.PostNew(taibookcasenew);
            if (rows != 1) {
                return new Result<>(false, "添加新上架书柜图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "添加新上架书柜图书表成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> GetNew() {
        try {
            log.debug("开始处理【删除全部新上架书柜图书表】的业务，无参数");
            int rows = aisgxxsgMapper.GetNew();
            if (rows == 0) {
                return new Result<>(false, "删除全部新上架书柜图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "删除全部新上架书柜图书表成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> GetdelNewByID(Long ids) {
        try {
            log.debug("开始处理【删除指定新上架书柜图书表】的业务，无参数");
            int rows = aisgxxsgMapper.GetdelNewByID(ids);
            if (rows == 0) {
                return new Result<>(false, "删除指定新上架书柜图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "删除指定新上架书柜图书表成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> PostBuyFromUser(TaibookcaserequestuserDTO taibookcaserequestuserDTO) {
        try {
            log.debug("开始处理【用户申请购买图书】的业务，参数：{}", taibookcaserequestuserDTO);
            Taibookcaserequestuser taibookcaserequestuser = new Taibookcaserequestuser();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            String localDateTimeNowStr = localDateTimeNow.format(formatter);
            taibookcaserequestuserDTO.setIntime(localDateTimeNowStr);
            BeanUtils.copyProperties(taibookcaserequestuserDTO, taibookcaserequestuser);
            log.debug("用户申请购买图书：{}", taibookcaserequestuser);
            int rows = aisgxxsgMapper.PostBuyFromUser(taibookcaserequestuser);
            if (rows != 1) {
                return new Result<>(false, "用户申请购买图书失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "用户申请购买图书成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> PostBuyFromUserWhithID(Long id) {
        try {
            log.debug("开始处理【用户申请购买图书(ID数组参数)】的业务，参数：{}", id);
            int rows = aisgxxsgMapper.PostBuyFromUserWhithID(id);
            if (rows != 1) {
                return new Result<>(false, "用户申请购买图书(ID数组参数)失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "用户申请购买图书(ID数组参数)成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> PostBuyToOnShelf(Long cid, String mid) {
        try {
            log.debug("开始处理【用户申购图书上架到新上架书柜】的业务，参数:{},{}", cid, mid);
            int rows = aisgxxsgMapper.PostBuyToOnShelf(cid, mid);
            aisgxxsgMapper.updateonShelf(cid);
            if (rows > 0) {
                return new Result<>(true, "用户申购图书上架到新上架书柜成功");
            } else {
                return new Result<>(false, "用户申购图书上架到新上架书柜失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> PostBuyToOnShelfAuto(Long cid, String mid) {
        try {
            log.debug("开始处理【自动申购图书上架到新上架书柜】的业务，参数:{},{}", cid, mid);
            int rows = aisgxxsgMapper.PostBuyToOnShelfAuto(cid, mid);
            aisgxxsgMapper.updateOnShelfAuto(cid);
            if (rows > 0) {
                return new Result<>(true, "自动申购图书上架到新上架书柜成功");
            } else {
                return new Result<>(false, "自动申购图书上架到新上架书柜失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> GetBuyFromUser() {
        try {
            log.debug("开始处理【删除全部的用户申购】的业务，无参数");
            int rows = aisgxxsgMapper.GetBuyFromUser();
            if (rows == 0) {
                return new Result<>(false, "删除全部的用户申购失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "删除全部的用户申购成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> GetBuyByID(Long id, int buytype) {
        try {
            log.debug("开始处理【删除指定的自动申购】的业务，无参数");
            if (buytype == 1) {
                int rows = aisgxxsgMapper.GetBuyByID1(id);
                if (rows == 0) {
                    return new Result<>(false, "删除指定的自动申购失败，尝试访问的数据不存在！");
                } else {
                    return new Result<>(true, "删除指定的自动申购成功");
                }
            } else {
                int rows = aisgxxsgMapper.GetBuyByID0(id);
                if (rows == 0) {
                    return new Result<>(false, "删除指定的自动申购失败，尝试访问的数据不存在！");
                } else {
                    return new Result<>(true, "删除指定的自动申购成功");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> PostBuyFromAuto(TaibookcaserequestautoDTO taibookcaserequestautoDTO) {
        try {
            log.debug("开始处理【自动申请购买图书】的业务，参数：{}", taibookcaserequestautoDTO);
            Taibookcaserequestauto taibookcaserequestauto = new Taibookcaserequestauto();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            String localDateTimeNowStr = localDateTimeNow.format(formatter);
            taibookcaserequestautoDTO.setIntime(localDateTimeNowStr);
            BeanUtils.copyProperties(taibookcaserequestautoDTO, taibookcaserequestauto);
            log.debug("自动申请购买图书：{}", taibookcaserequestauto);
            int rows = aisgxxsgMapper.PostBuyFromAuto(taibookcaserequestauto);
            if (rows != 1) {
                return new Result<>(false, "自动申请购买图书失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "自动申请购买图书成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<Integer> GetDelBuyFromAuto() {
        try {
            log.debug("开始处理【删除全部的自动申购】的业务，无参数");
            int rows = aisgxxsgMapper.GetDelBuyFromAuto();
            if (rows == 0) {
                return new Result<>(false, "删除全部的自动申购失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "删除全部的自动申购成功");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<List<Taibookcaserequestuser>> GetBuy(int eqtype) {
        try {
            log.debug("开始处理【获取书柜申请购买图书表】的业务，参数:{}",eqtype);
            List<Taibookcaserequestuser> list;
            if (eqtype == 1) {
                list = aisgxxsgMapper.GetBuy1();
            } else {
                list = aisgxxsgMapper.GetBuy0();
            }
            if (list.size()<0) {
                return new Result<>(false, "获取书柜申请购买图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "获取书柜申请购买图书表成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<List<Taibookcaserequestuser>> GetdelBuyByID(Long id, int eqtype) {
        try {
            log.debug("开始处理【获取书柜申请购买图书表】的业务，参数:{},{}",id,eqtype);
            List<Taibookcaserequestuser> list;
            if (eqtype == 1) {
                list = aisgxxsgMapper.GetdelBuyByID1(id);
            } else {
                list = aisgxxsgMapper.GetdelBuyByID0(id);
            }
            if (list.size()<0) {
                return new Result<>(false, "获取书柜申请购买图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "获取书柜申请购买图书表成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }

    @Override
    public Result<List<TaibookcaseVO>> PostSearchByMid(String bookName, String mid, int searchType) {
        try {
            log.debug("开始处理【搜索书柜图书表】的业务，参数:{},{},{}",bookName,mid,searchType);
            List<TaibookcaseVO> list;
            if (searchType == 0) {
                list = aisgxxsgMapper.PostSearchByMid0(bookName, mid);
            } else if(searchType == 1){
                list = aisgxxsgMapper.PostSearchByMid1(bookName,mid);
            }else if(searchType == 2){
                list = aisgxxsgMapper.PostSearchByMid2(bookName,mid);
            }else if (searchType == 3){
                list = aisgxxsgMapper.PostSearchByMid3(bookName,mid);
            }else if (searchType == 4){
                list = aisgxxsgMapper.PostSearchByMid4(bookName,mid);
            }else {
                list = aisgxxsgMapper.PostSearchByMid5(bookName,mid);
            }
            if (list.size()<0) {
                return new Result<>(false, "搜索书柜图书表失败，尝试访问的数据不存在！");
            } else {
                return new Result<>(true, "搜索书柜图书表成功",list);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new Result<>(false, "服务异常");
        }
    }


}
