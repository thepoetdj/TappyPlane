/**
 * Copyright 2019 Dhruv Joshi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.dhruvpjoshi.tappyplane.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import io.dhruvpjoshi.tappyplane.TappyPlane;
import io.dhruvpjoshi.tappyplane.constants.TappyPlaneKeys;

public class DesktopLauncher {
  public static void main(String[] arg) {
    LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
    config.width = TappyPlaneKeys.SCN_WIDTH;
    config.height = TappyPlaneKeys.SCN_HEIGHT;
    new LwjglApplication(new TappyPlane(), config);
  }
}
