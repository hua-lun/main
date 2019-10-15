package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_CALORIES;
import static seedu.address.logic.parser.CliSyntax.PREFIX_CARBS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_FATS;
import static seedu.address.logic.parser.CliSyntax.PREFIX_INGREDIENT;
import static seedu.address.logic.parser.CliSyntax.PREFIX_NAME;
import static seedu.address.logic.parser.CliSyntax.PREFIX_PROTEIN;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.recipe.Recipe;

/**
 * Adds a recipe to Duke Cooks.
 */
public class AddRecipeCommand extends AddCommand {

    public static final String VARIANT_WORD = "recipe";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a recipe to Duke Cooks. \n"
            + "Parameters: "
            + PREFIX_NAME + "NAME "
            + PREFIX_INGREDIENT + "INGREDIENTS... "
            + PREFIX_CALORIES + "CALORIES "
            + PREFIX_CARBS + "CARBS "
            + PREFIX_FATS + "FATS "
            + PREFIX_PROTEIN + "PROTEIN\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_NAME + "Cheese Omelette "
            + PREFIX_INGREDIENT + "eggs "
            + PREFIX_INGREDIENT + "cheese "
            + PREFIX_CALORIES + "358 "
            + PREFIX_CARBS + "1 "
            + PREFIX_FATS + "28 "
            + PREFIX_PROTEIN + "21 ";

    public static final String MESSAGE_SUCCESS = "New recipe added: %1$s";
    public static final String MESSAGE_DUPLICATE_RECIPE = "This recipe already exists in Duke Cooks";

    private final Recipe toAdd;

    /**
     * Creates an AddRecipeCommand to add the specified {@code Recipe}
     */
    public AddRecipeCommand(Recipe recipe) {
        requireNonNull(recipe);
        toAdd = recipe;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        if (model.hasRecipe(toAdd)) {
            throw new CommandException(MESSAGE_DUPLICATE_RECIPE);
        }

        model.addRecipe(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, toAdd));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AddRecipeCommand // instanceof handles nulls
                && toAdd.equals(((AddRecipeCommand) other).toAdd));
    }
}