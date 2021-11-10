package io.burkard.cdk.services.ssm


sealed abstract class ParameterTier(val underlying: software.amazon.awscdk.services.ssm.ParameterTier)
  extends Product
    with Serializable


object ParameterTier {
  implicit def toAws(value: ParameterTier): software.amazon.awscdk.services.ssm.ParameterTier =
    Option(value).map(_.underlying).orNull

  case object Advanced
    extends ParameterTier(software.amazon.awscdk.services.ssm.ParameterTier.ADVANCED)

  case object IntelligentTiering
    extends ParameterTier(software.amazon.awscdk.services.ssm.ParameterTier.INTELLIGENT_TIERING)

  case object Standard
    extends ParameterTier(software.amazon.awscdk.services.ssm.ParameterTier.STANDARD)
}
