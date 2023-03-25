package com.rx.allbackstage.mapper;

import com.rx.allbackstage.entity.aisg.entity.Taibookcasenew;
import com.rx.allbackstage.entity.aisg.entity.Taibookcaserequestauto;
import com.rx.allbackstage.entity.aisg.entity.Taibookcaserequestuser;
import com.rx.allbackstage.entity.aisg.vo.TaibookcaseVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AisgxxsgMapper {

    /**
     * 获取新上架书柜图书表
     * @param mid
     * @return
     */
    List<Taibookcasenew> GetNewByMid(String mid,String bookclass);

    /**
     * 获取新上架书柜图书表
     * @param id
     * @return
     */
    List<Taibookcasenew> GetNewByID(Long id);

    /**
     * 添加新上架书柜图书表
     * @param taibookcasenew
     * @return
     */
    int PostNew(Taibookcasenew taibookcasenew);

    /**
     * 删除全部新上架书柜图书表
     * @return
     */
    int GetNew();

    /**
     * 删除指定新上架书柜图书表
     * @param ids
     * @return
     */
    int GetdelNewByID(Long ids);

    /**
     * 用户申请购买图书
     * @param taibookcaserequestuser
     * @return
     */
    int PostBuyFromUser(Taibookcaserequestuser taibookcaserequestuser);

    /**
     * 用户申请购买图书(ID数组参数)
     * @param id
     * @return
     */
    int PostBuyFromUserWhithID(Long id);

    /**
     * 用户申购图书上架到新上架书柜
     * @param cid
     * @param mid
     * @return
     */
    int PostBuyToOnShelf(Long cid,String mid);
    int updateonShelf(Long cid);

    /**
     * 自动申购图书上架到新上架书柜
     * @param cid
     * @param mid
     * @return
     */
    int PostBuyToOnShelfAuto(Long cid,String mid);
    int updateOnShelfAuto(Long cid);

    /**
     * 删除全部的用户申购
     * @return
     */
    int GetBuyFromUser();

    /**
     * 删除指定的自动申购
     * @param id
     * @return
     */
    int GetBuyByID1(Long id);
    int GetBuyByID0(Long id);

    /**
     * 自动申请购买图书
     * @param taibookcaserequestauto
     * @return
     */
    int PostBuyFromAuto(Taibookcaserequestauto taibookcaserequestauto);

    /**
     * 删除全部的自动申购
     * @return
     */
    int GetDelBuyFromAuto();

    /**
     * 获取书柜申请购买图书表1
     * @return
     */
    List<Taibookcaserequestuser> GetBuy1();
    List<Taibookcaserequestuser> GetBuy0();

    /**
     * 获取书柜申请购买图书表2
     * @param id
     * @return
     */
    List<Taibookcaserequestuser> GetdelBuyByID1(Long id);
    List<Taibookcaserequestuser> GetdelBuyByID0(Long id);

    /**
     * 搜索书柜图书表
     * @param bookName
     * @param mid
     * @return
     */
    List<TaibookcaseVO> PostSearchByMid0(String bookName,String mid);
    List<TaibookcaseVO> PostSearchByMid1(String bookName,String mid);
    List<TaibookcaseVO> PostSearchByMid2(String bookName,String mid);
    List<TaibookcaseVO> PostSearchByMid3(String bookName,String mid);
    List<TaibookcaseVO> PostSearchByMid4(String bookName,String mid);
    List<TaibookcaseVO> PostSearchByMid5(String bookName,String mid);




}
