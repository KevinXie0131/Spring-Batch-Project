package org.myspringbatch.batch.listener;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class MyChunkListener implements ChunkListener {
    @Override
    public void beforeChunk(ChunkContext chunkContext) {
        System.out.println("--------before Chunk---------");
    }

    @Override
    public void afterChunk(ChunkContext chunkContext) {
        System.out.println("--------after Chunk---------");
    }

    @Override
    public void afterChunkError(ChunkContext chunkContext) {
        System.out.println("after Chunk Error");
    }
}
