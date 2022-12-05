package at.htl.leonding.bhitm5.tadeotfeedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import at.htl.leonding.bhitm5.tadeotfeedback.databinding.FragmentSummaryBinding
import at.htl.leonding.bhitm5.tadeotfeedback.databinding.FragmentWelcomeBinding

class SummaryFragment : Fragment() {
    val args: SummaryFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding :FragmentSummaryBinding = FragmentSummaryBinding.inflate(inflater)
        binding.tvLastRating.text="Ihre letzte Bewertung war: ${args.rating}"
        binding.btFinishs.setOnClickListener { view -> view.findNavController().navigate(R.id.action_summaryFragment_to_welcomeFragment) }
        return binding.root
    }

}