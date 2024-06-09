package com.jonsuttoncodes.baseball.retrosheet.people;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class BiographicalParser
{
    private static final String INPUT = "biofile.zip";
    private static final String BIOFILE = "biofile.csv";
    private static final String RELATIVES = "relatives.csv";

    public void loadBiographicalData()
    {
        URL inputUrl = this.getClass().getResource(INPUT);
        File inputFile = new File(inputUrl.toURI());
        ZipFile inputZipFile = new ZipFile(inputFile);

        // Handle the base biofile first
        ZipEntry biofileEntry = inputZipFile.getEntry(BIOFILE);
        List<String> lines = IOUtils.readLines(inputZipFile.getInputStream(biofileEntry), Charset.defaultCharset());


        try (ZipInputStream zis = new ZipInputStream(this.getClass().getResourceAsStream(INPUT))) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
