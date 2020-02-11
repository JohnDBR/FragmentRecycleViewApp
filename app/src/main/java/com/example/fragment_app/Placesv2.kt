package com.example.fragment_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class Placesv2 : Fragment()  , OnClickListener{
   lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_placesv2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.b1).setOnClickListener(this)
        view.findViewById<Button>(R.id.b2).setOnClickListener(this)
        view.findViewById<Button>(R.id.b3).setOnClickListener(this)


    }

    override fun onClick(v: View?) {
         when(v!!.id){
             R.id.b1 ->{
                 navController!!.navigate(R.id.action_placesv2_to_placeDetailv2)

             }
             R.id.b2 ->{
                 navController!!.navigate(R.id.action_placesv2_to_placeDetail2v2)

             }
             R.id.b3 ->{
                 navController!!.navigate(R.id.action_placesv2_to_placeDetail3v2)

             }

         }
    }
}
