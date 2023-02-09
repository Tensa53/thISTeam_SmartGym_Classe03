package com.example.smartgym;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.example.smartgym.infoUtenti.application.activity.InserimentoModificaCaratteristicheActivity;
import com.example.smartgym.start.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class InserimentoCaratteristicheInstrumentedTest1 {

    @Rule
    public ActivityScenarioRule<InserimentoModificaCaratteristicheActivity> activityScenario = new ActivityScenarioRule<InserimentoModificaCaratteristicheActivity>(InserimentoModificaCaratteristicheActivity.class);

    @Test
    public void inserimentoCaratteritsicheTest() {
        onView(withId(R.id.etPeso)).perform(typeText("500"));
        onView(withId(R.id.etAltezza)).perform(typeText("150"));
        onView(withId(R.id.spinnerEsperienza)).perform(click());
        onView(withText("Principiante")).perform(click());
        onView(withId(R.id.etAllenamenti)).perform(typeText("4"));

        onView(withId(R.id.btUpdate)).perform(click());

        onView(withId(R.id.etPeso)).perform(click());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}