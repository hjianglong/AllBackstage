package com.rx.allbackstage.Service;

import com.rx.allbackstage.entity.Result;
import com.rx.allbackstage.entity.aisg.dto.TaibookcasenewDTO;
import com.rx.allbackstage.entity.aisg.dto.TaibookcaserequestautoDTO;
import com.rx.allbackstage.entity.aisg.dto.TaibookcaserequestuserDTO;
import com.rx.allbackstage.entity.aisg.entity.Taibookcasenew;
import com.rx.allbackstage.entity.aisg.entity.Taibookcaserequestauto;
import com.rx.allbackstage.entity.aisg.entity.Taibookcaserequestuser;
import com.rx.allbackstage.entity.aisg.vo.TaibookcaseVO;
import io.swagger.models.auth.In;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IAisgxxsgService {

    /**
     * 获取新上架书柜图书表
     * @param mid
     * @return
     */
    Result<List<Taibookcasenew>> GetNewByMid(String mid,String bookclass);

    /**
     * 获取新上架书柜图书表
     * @param id
     * @return
     */
    Result<List<Taibookcasenew>> GetNewByID(Long id);

    /**
     * 添加新上架书柜图书表
     * @param taibookcasenewDTO
     * @return
     */
    Result<Integer> PostNew(TaibookcasenewDTO taibookcasenewDTO);

    /**
     * 删除全部新上架书柜图书表
     * @return
     */
    Result<Integer> GetNew();

    /**
     * 删除指定新上架书柜图书表
     * @param ids
     * @return
     */
    Result<Integer> GetdelNewByID(Long ids);

    /**
     * 用户申请购买图书
     * @param taibookcaserequestuserDTO
     * @return
     */
    Result<Integer> PostBuyFromUser(TaibookcaserequestuserDTO taibookcaserequestuserDTO);

    /**
     * 用户申请购买图书(ID数组参数)
     * @param id
     * @return
     */
    Result<Integer> PostBuyFromUserWhithID(Long id);

    /**
     * 用户申购图书上架到新上架书柜
     * @param cid
     * @param mid
     * @return
     */
    Result<Integer> PostBuyToOnShelf(Long cid,String mid);

    /**
     * 自动申购图书上架到新上架书柜
     * @param cid
     * @param mid
     * @return
     */
    Result<Integer> PostBuyToOnShelfAuto(Long cid,String mid);

    /**
     * 删除全部的用户申购
     * @return
     */
    Result<Integer> GetBuyFromUser();

    /**
     * 删除指定的自动申购
     * @param id
     * @return
     */
    Result<Integer> GetBuyByID(Long id ,int buytype);

    /**
     * 自动申请购买图书
     * @param taibookcaserequestautoDTO
     * @return
     */
    Result<Integer> PostBuyFromAuto(TaibookcaserequestautoDTO taibookcaserequestautoDTO);

    /**
     * 删除全部的自动申购
     * @return
     */
    Result<Integer> GetDelBuyFromAuto();

    /**
     * 获取书柜申请购买图书表1
     * @return
     */
    Result<List<Taibookcaserequestuser>> GetBuy(int eqtype);

    /**
     * 获取书柜申请购买图书表2
     * @param id
     * @return
     */
    Result<List<Taibookcaserequestuser>> GetdelBuyByID(Long id , int eqtype);

    /**
     * 搜索书柜图书表
     * @param bookName
     * @param mid
     * @return
     */
    Result<List<TaibookcaseVO>> PostSearchByMid(String bookName, String mid,int searchType);
}
