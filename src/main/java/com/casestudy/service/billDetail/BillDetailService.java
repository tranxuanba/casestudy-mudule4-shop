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
<<<<<<< HEAD
public class BillDetailService implements IBillDetailService{
=======
public class BillDetailService implements IBillDetailService {
>>>>>>> hiep
=======
public class BillDetailService implements IBillDetailService {
=======
public class BillDetailService implements IBillDetailService{
>>>>>>> 626900eee150dd74d2c04f35d27a8282433dbe59
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
<<<<<<< HEAD
=======

>>>>>>> hiep
=======

=======
>>>>>>> 626900eee150dd74d2c04f35d27a8282433dbe59
>>>>>>> hiep
        billDetailRepository.deleteById(id);
    }

    @Override
<<<<<<< HEAD
<<<<<<< HEAD
    public List<BillDetail> findAllByBill(Bill bill) {
=======
    public List<BillDetail> findALlByBill(Bill bill) {
>>>>>>> hiep
=======
    public List<BillDetail> findALlByBill(Bill bill) {
=======
    public List<BillDetail> findAllByBill(Bill bill) {
>>>>>>> 626900eee150dd74d2c04f35d27a8282433dbe59
>>>>>>> hiep
        return billDetailRepository.findAllByBill(bill);
    }

    @Override
    public Double calculateMoneyByBillId(Long billId) {
        return billDetailRepository.calculateMoneyByBillId(billId);
    }
}
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> hiep
=======

=======
>>>>>>> 626900eee150dd74d2c04f35d27a8282433dbe59
>>>>>>> hiep
