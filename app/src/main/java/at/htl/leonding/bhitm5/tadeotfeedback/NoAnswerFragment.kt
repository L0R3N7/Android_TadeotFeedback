package at.htl.leonding.bhitm5.tadeotfeedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import at.htl.leonding.bhitm5.tadeotfeedback.databinding.FragmentNoAnswerBinding

class NoAnswerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding: FragmentNoAnswerBinding = FragmentNoAnswerBinding.inflate(inflater)

        binding.btBackToQuestion.setOnClickListener { it.findNavController().navigate(R.id.action_noAnswerFragment_to_questionFragment) }
        binding.btFinish.setOnClickListener { it.findNavController().navigate(R.id.action_noAnswerFragment_to_welcomeFragment) }

        // Inflate the layout for this fragment
        return binding.root
    }
}