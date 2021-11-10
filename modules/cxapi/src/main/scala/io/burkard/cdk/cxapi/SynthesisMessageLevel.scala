package io.burkard.cdk.cxapi


sealed abstract class SynthesisMessageLevel(val underlying: software.amazon.awscdk.cxapi.SynthesisMessageLevel)
  extends Product
    with Serializable


object SynthesisMessageLevel {
  implicit def toAws(value: SynthesisMessageLevel): software.amazon.awscdk.cxapi.SynthesisMessageLevel =
    Option(value).map(_.underlying).orNull

  case object Info
    extends SynthesisMessageLevel(software.amazon.awscdk.cxapi.SynthesisMessageLevel.INFO)

  case object Warning
    extends SynthesisMessageLevel(software.amazon.awscdk.cxapi.SynthesisMessageLevel.WARNING)

  case object Error
    extends SynthesisMessageLevel(software.amazon.awscdk.cxapi.SynthesisMessageLevel.ERROR)
}
