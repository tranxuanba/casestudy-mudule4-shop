package com.casestudy.service.billDetail;

import com.casestudy.model.Bill;
import com.casestudy.model.BillDetail;
import com.casestudy.service.IService;

import java.util.List;

public interface IBillDetailService extends IService<BillDetail> {
<<<<<<< HEAD


    List<BillDetail> findALlByBill(Bill bill);
=======
    List<BillDetail> findAllByBill(Bill bill);
>>>>>>> 626900eee150dd74d2c04f35d27a8282433dbe59
    Double calculateMoneyByBillId(Long BillId);
}
