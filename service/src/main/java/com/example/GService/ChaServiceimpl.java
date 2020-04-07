package com.example.GService;

import com.example.GMapper.ChaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChaServiceimpl implements ChaService {

    @Autowired
    public ChaMapper ChaMapper;

    @Override
    public int cha() {
        return ChaMapper.cha();
    }
}
