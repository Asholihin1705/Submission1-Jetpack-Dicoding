package com.example.nobaryuh.View

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.nobaryuh.Data.CatalogDummy
import com.example.nobaryuh.R
import org.junit.Test
import org.junit.Rule

class HomeActivityTest {

    private val catalogMovie = CatalogDummy.catalogueMovies()
    private val catalogTvShow = CatalogDummy.catalogueTvShows()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovie() {
        Espresso.onView(withId(R.id.rvMovies))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rvMovies))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(catalogMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        Espresso.onView(withId(R.id.rvMovies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            ViewActions.click()))
        Espresso.onView(withId(R.id.txt_title)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            check(ViewAssertions.matches(withText(catalogMovie[0].title)))
        }
        Espresso.onView(withId(R.id.txt_genre)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogMovie[0].genre)))
        }
        Espresso.onView(withId(R.id.txt_derasi)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogMovie[0].duration)))
        }
        Espresso.onView(withId(R.id.txt_release)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogMovie[0].release)))
        }
        Espresso.onView(withId(R.id.txt_score)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogMovie[0].score)))
        }
        Espresso.onView(withId(R.id.txt_director)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogMovie[0].director)))
        }
        Espresso.onView(withId(R.id.txt_overview)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            check(ViewAssertions.matches(withText(catalogMovie[0].overview)))
        }
    }

    @Test
    fun loadTvShow() {
        Espresso.onView(withText("Tv Shows")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTvshow))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        Espresso.onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(catalogTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        Espresso.onView(withText("Tv Shows")).perform(ViewActions.click())
        Espresso.onView(withId(R.id.rvTvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,
            ViewActions.click()))
        Espresso.onView(withId(R.id.txt_title)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            check(ViewAssertions.matches(withText(catalogTvShow[0].title)))
        }
        Espresso.onView(withId(R.id.txt_genre)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogTvShow[0].genre)))
        }
        Espresso.onView(withId(R.id.txt_derasi)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogTvShow[0].duration)))
        }
        Espresso.onView(withId(R.id.txt_release)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogTvShow[0].release)))
        }
        Espresso.onView(withId(R.id.txt_score)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogTvShow[0].score)))
        }
        Espresso.onView(withId(R.id.txt_director)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            perform(swipeUp()).perform(swipeUp()).check(ViewAssertions.matches(withText(catalogTvShow[0].director)))
        }
        Espresso.onView(withId(R.id.txt_overview)).apply {
            check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            check(ViewAssertions.matches(withText(catalogTvShow[0].overview)))
        }
    }
}