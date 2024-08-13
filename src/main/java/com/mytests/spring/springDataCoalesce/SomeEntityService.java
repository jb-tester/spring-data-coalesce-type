package com.mytests.spring.springDataCoalesce;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SomeEntityService {

    private final SomeEntityRepository someEntityRepository;

    public SomeEntityService(SomeEntityRepository someEntityRepository) {
        this.someEntityRepository = someEntityRepository;
    }

    public void populateDB() {
        someEntityRepository.save(new SomeEntity("aaa", BigDecimal.ONE, 1L));
        someEntityRepository.save(new SomeEntity("bbb", BigDecimal.TEN, 2L));
        someEntityRepository.save(new SomeEntity("ccc", BigDecimal.ONE, 3L));
    }



    public void testConstructors() {
        System.out.println(someEntityRepository.test0(BigDecimal.ONE));
        System.out.println(someEntityRepository.test00(2));
        System.out.println(someEntityRepository.test1(1L));
        System.out.println(someEntityRepository.test11(1L));
        System.out.println(someEntityRepository.test2(1L));
        System.out.println(someEntityRepository.test22(1L));
      //  System.out.println(someEntityRepository.test3(1L));
    }

    ;

}
