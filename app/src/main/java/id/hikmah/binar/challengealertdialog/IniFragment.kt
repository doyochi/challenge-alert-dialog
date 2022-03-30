package id.hikmah.binar.challengealertdialog

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import id.hikmah.binar.challengealertdialog.databinding.FragmentIniBinding

class IniFragment : Fragment() {

    private var _binding: FragmentIniBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIniBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showAlertDialog()
        showAlertDialogWithAction()
        showAlertDialogCustom()
    }

    private fun showAlertDialog(){
        binding.btnDialog.setOnClickListener{
            val dialog = AlertDialog.Builder(requireContext())
            dialog.setTitle("Disini Judul bray")
            dialog.setMessage("Disini pesan bray, boleh panjangsss hihihihihihihihiihihihihihihhiihhiihihihihihihihihihihihihihihiihihihihihihihihihihihiihihih")
            dialog.show()
        }
    }

    private fun showAlertDialogWithAction(){
        binding.btnDialogaction.setOnClickListener{
            val dialog = AlertDialog.Builder(requireContext())
            dialog.setTitle("Disini Judul bray")
            dialog.setMessage("Disini pesan bray, boleh panjangsss hihihihihihihihiihihihihihihhiihhiihihihihihihihihihihihihihihiihihihihihihihihihihihiihihih")
            dialog.setPositiveButton("P"){dialogInterface, angkat ->
                createToast("Ini Button Positif").show()
            }
            dialog.setNegativeButton("Negatif"){dialogInterface, _ ->
                createToast("Ini Button Negatif").show()

            }
            dialog.setNeutralButton("Neutral"){dialogInterface, _ ->
                createToast("Ini Button Neutral").show()
            }
            dialog.setCancelable(false)
            dialog.show()
        }
    }

    private fun showAlertDialogCustom(){
        //Menghubungkan Layout
        val customLayout = LayoutInflater.from(requireContext()).inflate(R.layout.custom_dialog, null, false)

        //Memanggil text view dan button dari custom
        val title = customLayout.findViewById<TextView>(R.id.tv_title)
        val buttonOne = customLayout.findViewById<Button>(R.id.btn_one)

        //Mengubah value dari text view dan button
        title.text = "Ini sudah di ubah"
        buttonOne.text = "Dismiss"

        //Membuat builder alert dialog
        val builder = AlertDialog.Builder(requireContext())

        //Mengubah layout alert dialog menggunakan custom layout
        builder.setView(customLayout)

        //Membuat alert dialog baru dair builder yang sudah di custom
        val dialog = builder.create()

        buttonOne.setOnClickListener{
            dialog.dismiss()
        }

        binding.btnDialogCustom.setOnClickListener{
            dialog.show()
        }
    }

    private fun createToast(message: String): Toast {
        return Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT)
    }

}