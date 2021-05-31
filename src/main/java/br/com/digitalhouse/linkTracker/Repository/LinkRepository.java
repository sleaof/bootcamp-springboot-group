package br.com.digitalhouse.linkTracker.Repository;

import br.com.digitalhouse.linkTracker.DTOs.LinkDTO;

import java.util.Optional;

public interface LinkRepository {
    LinkDTO save(LinkDTO link);

    Optional<LinkDTO> findLinkByLinkId(Integer linkId);

    void delete(LinkDTO linkDTO);
}