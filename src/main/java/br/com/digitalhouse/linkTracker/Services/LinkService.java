package br.com.digitalhouse.linkTracker.Services;

import br.com.digitalhouse.linkTracker.DTOs.LinkDTO;
import org.springframework.stereotype.Service;

public interface LinkService {
    LinkDTO create(LinkDTO link);

    LinkDTO redirect(Integer linkId);

    LinkDTO redirect(Integer linkId, String password);

    LinkDTO metrics(Integer linkId);

    void invalidate(Integer linkId);
}
