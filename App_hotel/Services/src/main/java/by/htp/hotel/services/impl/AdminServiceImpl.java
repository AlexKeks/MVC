package by.htp.hotel.services.impl;

import by.htp.hotel.entities.Admin;
import by.htp.hotel.services.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(transactionManager = "txManager")
public class AdminServiceImpl extends ServiceImpl<Admin> implements AdminService {


}
