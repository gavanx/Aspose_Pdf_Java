/*
 * Copyright 2001-2014 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Pdf. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithasposepdffacades.WorkingWithBookmarks.CreateBookmarksofAllPages.java;

import com.aspose.pdf.facades.Bookmarks;
import com.aspose.pdf.facades.PdfBookmarkEditor;

import java.awt.*;


public class CreateBookmarksofAllPages {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithasposepdffacades/workingwithbookmarks/CreateBookmarksofAllPages/data/";

        //open document
        PdfBookmarkEditor bookmarkEditor = new PdfBookmarkEditor();
        bookmarkEditor.bindPdf(dataDir+ "Input.pdf");
        //create bookmark of all pages
        bookmarkEditor.createBookmarks();
        //save updated PDF file
        bookmarkEditor.save(dataDir+ "Output.pdf");
    }
}




