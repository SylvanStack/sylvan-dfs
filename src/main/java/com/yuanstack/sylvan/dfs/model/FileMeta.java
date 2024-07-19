package com.yuanstack.sylvan.dfs.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * file meta data.
 *
 * @author Sylvan
 * @date 2024/07/18  22:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FileMeta {
    private String name;
    private String originalFilename;
    private long size;
    // private String md5;
    private Map<String, String> tags = new HashMap<>();
}