package com.akshay_apps.affirmations.data

import com.akshay_apps.affirmations.R
import com.akshay_apps.affirmations.model.Affirmation

class DataSource {

    fun loadAffirmations(): List<Affirmation>{
        return listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)

        )
    }

}