package steps;

import com.joantolos.cucumber.Molecule;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 *
 * Created by jtolos on 23/02/2015.
 */
public class MolecularWeightSteps {
    
    private Molecule molecule;
    private String bigOrTiny;

    @Given("^My molecule has (\\d+) as a molecular weight$")
    public void my_molecule_has_as_a_molecular_weight(int molecularWeight) throws Throwable {
        this.molecule = new Molecule(molecularWeight);
    }

    @When("^the molecule jumps (\\d+) time\\(s\\)$")
    public void the_molecule_jumps_time_s(int jumpingRepetitions) throws Throwable {
        this.bigOrTiny = this.molecule.getMoleculeSize(jumpingRepetitions);
    }

    @Then("^my molecule should be a big molecule$")
    public void my_molecule_should_be_a_big_molecule() throws Throwable {
        Assert.assertEquals("be a big molecule", this.bigOrTiny);
    }

    @Then("^my molecule should be a tiny molecule$")
    public void my_molecule_should_be_a_tiny_molecule() throws Throwable {
        Assert.assertEquals("be a tiny molecule", this.bigOrTiny);
    }

}