package at.htl.leonding.bhitm5.tadeotfeedback

import android.os.Bundle
import android.view.*
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import at.htl.leonding.bhitm5.tadeotfeedback.databinding.FragmentWelcomeBinding

/**
 * A simple [Fragment] subclass.
 * Use the [WelcomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WelcomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentWelcomeBinding = FragmentWelcomeBinding.inflate(inflater)

        binding.button.setOnClickListener {
            view -> view.findNavController().navigate(R.id.action_welcomeFragment_to_questionFragment)
        }

        // Inflate the layout for this fragment
        setupMenu();
        return binding.root;
    }

    private fun setupMenu(){
        (requireActivity() as MainActivity).addMenuProvider(object : MenuProvider{
            override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
                menuInflater.inflate(R.menu.main_menu, menu)
            }

            override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
                return NavigationUI.onNavDestinationSelected(menuItem, findNavController())
            }

        }, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }
}