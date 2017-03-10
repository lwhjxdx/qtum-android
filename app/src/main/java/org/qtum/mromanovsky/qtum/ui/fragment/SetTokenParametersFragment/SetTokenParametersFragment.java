package org.qtum.mromanovsky.qtum.ui.fragment.SetTokenParametersFragment;


import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;

import org.qtum.mromanovsky.qtum.R;
import org.qtum.mromanovsky.qtum.ui.fragment.BaseFragment.BaseFragment;

import butterknife.BindView;
import butterknife.OnClick;

public class SetTokenParametersFragment extends BaseFragment implements SetTokenParametersFragmentView{

    @BindView(R.id.bt_back)
    Button mButtonBack;
    @BindView(R.id.bt_finish)
    Button mButtonFinish;

    @BindView(R.id.et_initial_supply)
    TextInputEditText mTextInputEditTextInitialSupply;
    @BindView(R.id.til_initial_supply)
    TextInputLayout mTextInputLayoutInitialSupply;
    @BindView(R.id.et_decimal_units)
    TextInputEditText mTextInputEditTextDecimalUnits;
    @BindView(R.id.til_decimal_units)
    TextInputLayout mTextInputLayoutDecimalUnits;

    @OnClick({R.id.bt_back,R.id.bt_finish})
    public void onClick(View view){
        switch (view.getId()){
            case R.id.bt_back:
                getPresenter().onBackClick();
                break;
            case R.id.bt_finish:
                getPresenter().onFinishClick(Long.parseLong(mTextInputEditTextInitialSupply.getText().toString()),
                        Long.parseLong(mTextInputEditTextDecimalUnits.getText().toString()));
                break;
        }
    }

    private final int LAYOUT = R.layout.fragment_set_token_parameters;
    private SetTokenParametersFragmentPresenterImpl mSetTokenParametersFragmentPresenter;

    public static SetTokenParametersFragment newInstance(){
        SetTokenParametersFragment setTokenParametersFragment = new SetTokenParametersFragment();
        return setTokenParametersFragment;
    }

    @Override
    protected void createPresenter() {
        mSetTokenParametersFragmentPresenter = new SetTokenParametersFragmentPresenterImpl(this);
    }

    @Override
    protected SetTokenParametersFragmentPresenterImpl getPresenter() {
        return mSetTokenParametersFragmentPresenter;
    }

    @Override
    protected int getLayout() {
        return LAYOUT;
    }
}
