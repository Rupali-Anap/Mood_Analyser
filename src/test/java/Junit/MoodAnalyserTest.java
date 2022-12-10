package Junit;

import JUnit.MoodAnalyser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

        @Test
        public void ShouldReturnSad() {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("This is a sad message");
            System.out.println(mood);
            Assertions.assertEquals("SAD", mood);
        }

        @Test
        public void ShouldReturnHappy() {
            MoodAnalyser moodAnalyser = new MoodAnalyser();
            String mood = moodAnalyser.analyseMood("This is a happy message");
            System.out.println(mood);
            Assertions.assertEquals("HAPPY", mood);
        }
    }

