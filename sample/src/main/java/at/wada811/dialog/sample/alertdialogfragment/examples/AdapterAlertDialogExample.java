/*
 * Copyright 2014 wada811
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package at.wada811.dialog.sample.alertdialogfragment.examples;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import at.wada811.dialog.AlertDialogFragment;
import at.wada811.dialog.interfaces.DialogFragmentCallbackProvider;
import at.wada811.dialog.sample.Example;
import at.wada811.dialog.sample.R;

/**
 * Created by wada on 2014/09/07.
 */
public class AdapterAlertDialogExample extends Example{

    private Context context;

    public AdapterAlertDialogExample(Context context){
        super(AdapterAlertDialogExample.class.getSimpleName());
        this.context = context;
    }

    @Override
    public void showDialog(DialogFragmentCallbackProvider provider, FragmentManager fragmentManager){
        new AlertDialogFragment.Builder(context).setIcon(R.drawable.ic_launcher)
            .setTitle(R.string.dialog_title)
            .setAdapter(provider)
            .setNegativeButton(R.string.dialog_cancel, null)
            .show(fragmentManager, label);
    }

}