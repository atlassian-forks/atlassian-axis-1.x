/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.axis.components.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * JIMI based Image I/O
 *
 * @author <a href="mailto:dims@yahoo.com">Davanum Srinivas</a>
 * @since 2.0
 */
public class JimiIO implements org.apache.axis.components.image.ImageIO {
    /**
     * @param id    format of image
     * @param image the image to be saved
     * @param os    - Output stream
     * @throws Exception
     */

    public void saveImage(String id, Image image, OutputStream os)
            throws Exception {
        BufferedImage rendImage = new BufferedImage(image.getWidth(null), image.getHeight(null), 1);
        ImageIO.write(rendImage, id, os);
    }

    /**
     * Load an Image.
     *
     * @param in the stream to load the image
     * @return the Image
     */
    public Image loadImage(InputStream in) throws Exception {
        return ImageIO.read(in);
    }
}

