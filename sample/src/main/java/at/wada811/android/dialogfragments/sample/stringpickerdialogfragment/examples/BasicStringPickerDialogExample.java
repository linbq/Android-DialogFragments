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

package at.wada811.android.dialogfragments.sample.stringpickerdialogfragment.examples;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.text.method.CharacterPickerDialog;
import at.wada811.android.dialogfragments.StringPickerDialogFragment;
import at.wada811.android.dialogfragments.interfaces.DialogFragmentCallbackProvider;
import at.wada811.android.dialogfragments.sample.Example;
import at.wada811.android.dialogfragments.sample.R;

public class BasicStringPickerDialogExample extends Example{

    private Context context;

    public BasicStringPickerDialogExample(Context context){
        super(BasicStringPickerDialogExample.class.getSimpleName());
        this.context = context;
    }

    @Override
    public void showDialog(DialogFragmentCallbackProvider provider, FragmentManager fragmentManager){
        StringPickerDialogFragment dialogFragment = StringPickerDialogFragment.newInstance(
            provider, new String[]{
                AlertDialog.class.getSimpleName(),
                CharacterPickerDialog.class.getSimpleName(),
                ProgressDialog.class.getSimpleName(),
                DatePickerDialog.class.getSimpleName(),
                TimePickerDialog.class.getSimpleName(),
            }
        );
        dialogFragment.setIcon(R.drawable.ic_launcher);
        dialogFragment.setTitle(R.string.dialog_title);
        dialogFragment.show(fragmentManager, label);
    }

}
