package com.example.fragment_app


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 */
class PlaceDetail2v2 : Fragment()  , View.OnClickListener {
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place_detail2v2, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)


        view.findViewById<Button>(R.id.bPlaces2).setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        when(v!!.id){

            R.id.bPlaces2 ->{
                navController!!.navigate(R.id.action_placeDetail2v2_to_suggestedPlacesFragmentv2)

            }

        }}

}
