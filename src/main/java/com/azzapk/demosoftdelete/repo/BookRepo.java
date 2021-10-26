package com.azzapk.demosoftdelete.repo;

import com.azzapk.demosoftdelete.entity.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Books, Long> {
}
