package by.mbicycle.trainee

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import by.mbicycle.trainee.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.button1.setOnClickListener {
            try {
                findNavController().navigate(R.id.action_blankFragment_to_blankFragment2)
            } catch (e: Exception) {
                println(e)
            }
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        utilPrintln {
            "Dog"
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

fun Fragment.utilPrintln(block :(String) -> String) {
    print(block)
}

