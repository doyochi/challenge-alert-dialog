package id.hikmah.binar.challengealertdialog

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.hikmah.binar.challengealertdialog.databinding.FragmentDialogBinding

class DialogFragment : Fragment() {

    private var _binding: FragmentDialogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDialogBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnOknama.setOnClickListener{
            val nama = binding.editNama.text.toString()
            showDialog(nama)
        }
    }

    private fun showDialog(nama: String){
        val dialog = AlertDialog.Builder(requireContext())
        dialog.setTitle("Selamat datang")
        dialog.setMessage("Halo " + nama + "! Selamat datang.")
        dialog.show()
    }
}