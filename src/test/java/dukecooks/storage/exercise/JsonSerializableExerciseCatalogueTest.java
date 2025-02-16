package dukecooks.storage.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import dukecooks.commons.util.JsonUtil;
import dukecooks.model.workout.WorkoutPlanner;
import dukecooks.testutil.exercise.TypicalExercises;

public class JsonSerializableExerciseCatalogueTest {

    private static final Path TEST_DATA_FOLDER = Paths.get("src", "test", "data",
            "JsonSerializableWorkoutPlannerTest");
    private static final Path TYPICAL_PERSONS_FILE = TEST_DATA_FOLDER.resolve("typicalExerciseWorkoutPlanner.json");

    @Test
    public void toModelType_typicalPersonsFile_success() throws Exception {
        JsonSerializableExerciseCatalogue dataFromFile = JsonUtil.readJsonFile(TYPICAL_PERSONS_FILE,
                JsonSerializableExerciseCatalogue.class).get();
        WorkoutPlanner dukeCooksFromFile = dataFromFile.toModelType();
        WorkoutPlanner typicalPersonsDukeCooks = TypicalExercises.getTypicalWorkoutPlanner();
        assertEquals(dukeCooksFromFile, typicalPersonsDukeCooks);
    }
}
