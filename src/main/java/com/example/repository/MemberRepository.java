package com.example.repository;

import com.example.domain.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface MemberRepository extends PagingAndSortingRepository<Member, Long> {}