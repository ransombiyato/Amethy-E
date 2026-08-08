package net.kdt.pojavlaunch.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import net.kdt.pojavlaunch.R;
import net.kdt.pojavlaunch.Tools;

public class ProfileTypeSelectFragment extends Fragment {
    public static final String TAG = "PROFILE_TYPE_SELECT_FRAGMENT";

    public ProfileTypeSelectFragment() {
        super(R.layout.fragment_profile_type_select);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        Button vanilla = view.findViewById(R.id.create_profile_vanilla);
        Button fabric = view.findViewById(R.id.create_profile_fabric);
        Button forge = view.findViewById(R.id.create_profile_forge);
        Button neoforge = view.findViewById(R.id.create_profile_neoforge);
        Button quilt = view.findViewById(R.id.create_profile_quilt);

        vanilla.setOnClickListener(v ->
                Tools.swapFragment(requireActivity(), VanillaCreateProfileFragment.class, VanillaCreateProfileFragment.TAG, null));

        fabric.setOnClickListener(v ->
                Tools.swapFragment(requireActivity(), FabricCreateProfileFragment.class, FabricCreateProfileFragment.TAG, null));

        forge.setOnClickListener(v ->
                Tools.swapFragment(requireActivity(), ForgeCreateProfileFragment.class, ForgeCreateProfileFragment.TAG, null));

        neoforge.setOnClickListener(v ->
                Tools.swapFragment(requireActivity(), NeoForgeCreateProfileFragment.class, NeoForgeCreateProfileFragment.TAG, null));

        quilt.setOnClickListener(v ->
                Tools.swapFragment(requireActivity(), QuiltCreateProfileFragment.class, QuiltCreateProfileFragment.TAG, null));
    }
}
