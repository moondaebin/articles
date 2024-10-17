package com.my.articles.service;

import com.my.articles.dao.ArticleDAO;
import com.my.articles.repostory.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class PaginationService {
    private static final int BAR_LELGTH = 5;
    public List<Integer> getPaginationBarNumber(
            int currentPageNumber,
            int totalPageNumber) {
        int startNumber =
                Math.max(currentPageNumber - (BAR_LELGTH / 2), 0);
        int endNumber =
                Math.min(startNumber + BAR_LELGTH, totalPageNumber);

        return IntStream.range(startNumber,endNumber)
                .boxed().toList();
    }
    public int currentBarLenth() {
        return BAR_LELGTH;
    }
}
