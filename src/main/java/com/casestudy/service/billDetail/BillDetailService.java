package com.casestudy.service.billDetail;

import com.casestudy.model.Bill;
import com.casestudy.model.BillDetail;
import com.casestudy.repository.BillDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
<<<<<<< HEAD
public class BillDetailService implements IBillDetailService{
=======
public class BillDetailService implements IBillDetailService {
>>>>>>> hiep

    @Autowired
    private BillDetailRepository billDetailRepository;

    @Override
    public List<BillDetail> findALl() {
        return billDetailRepository.findAll();
    }

    @Override
    public Page<BillDetail> findALl(Pageable pageable) {
        return billDetailRepository.findAll(pageable);
    }

    @Override
    public BillDetail findById(Long id) {
        return billDetailRepository.findById(id).get();
    }

    @Override
    public BillDetail save(BillDetail billDetail) {
        return billDetailRepository.save(billDetail);
    }

    @Override
    public void deleteById(Long id) {
<<<<<<< HEAD
=======

>>>>>>> hiep
        billDetailRepository.deleteById(id);
    }

    @Override
<<<<<<< HEAD
    public List<BillDetail> findAllByBill(Bill bill) {
=======
    public List<BillDetail> findALlByBill(Bill bill) {
>>>>>>> hiep
        return billDetailRepository.findAllByBill(bill);
    }

    @Override
    public Double calculateMoneyByBillId(Long billId) {
        return billDetailRepository.calculateMoneyByBillId(billId);
    }
}
<<<<<<< HEAD
=======

>>>>>>> hiep
