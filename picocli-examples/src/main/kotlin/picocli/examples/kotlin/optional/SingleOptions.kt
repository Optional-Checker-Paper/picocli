package picocli.examples.kotlin.optional

import picocli.CommandLine.Option
import picocli.CommandLine.Parameters
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.*

class SingleOptions {
    @Option(names = ["-x"])
    @SuppressFBWarnings(value="NP_OPTIONAL_RETURN_NULL", justification="Suppression of Warning")
    lateinit var x: Optional<Int>

    @Option(names = ["-y"])
    var y: Optional<Int> = Optional.empty()

    @Option(names = ["-z", "--long"], negatable = true)
    var z = Optional.of(false)

    @Parameters(arity = "0..*")
    var positional = Optional.empty<String>()

    @Option(names = ["-D"], mapFallbackValue = "_NULL_")
    lateinit var map: Map<String, Optional<Int>>
}
