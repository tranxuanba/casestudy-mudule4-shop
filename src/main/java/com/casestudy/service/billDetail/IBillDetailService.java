package com.casestudy.service.billDetail;

import com.casestudy.model.Bill;
import com.casestudy.model.BillDetail;
import com.casestudy.service.IService;

import java.util.List;

public interface IBillDetailService extends IService<BillDetail> {
<<<<<<< HEAD
    List<BillDetail> findAllByBill(Bill bill);
=======


    List<BillDetail> findALlByBill(Bill bill);
>>>>>>> hiep
    Double calculateMoneyByBillId(Long BillId);
}
