package com.mytests.spring.springDataCoalesce;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class SomeEntityService {

    private final SomeEntityRepository someEntityRepository;

    public SomeEntityService(SomeEntityRepository someEntityRepository) {
        this.someEntityRepository = someEntityRepository;
    }

    public void populateDB() {
        someEntityRepository.save(new SomeEntity("aaa", BigDecimal.ONE, 1L, 1.0));
        someEntityRepository.save(new SomeEntity("bbb", BigDecimal.TEN, 2L,2.0));
        someEntityRepository.save(new SomeEntity("ccc", BigDecimal.ONE, 3L,3.0));
    }



    public void testConstructors() {
        System.out.println(someEntityRepository.test0(BigDecimal.ONE));
        System.out.println(someEntityRepository.test00(2));
        System.out.println(someEntityRepository.test000(2.0));
        System.out.println(someEntityRepository.test1(1L));
        System.out.println(someEntityRepository.test11(1L));
        System.out.println(someEntityRepository.test2(1L));
        System.out.println(someEntityRepository.test22(1L));
      //  System.out.println(someEntityRepository.test3(1L));
    }

    public void testMetestOneArgCoalesce() {
        System.out.println(someEntityRepository.oneArgCoalesce(List.of(1.0, 2.0)));
    }

}
