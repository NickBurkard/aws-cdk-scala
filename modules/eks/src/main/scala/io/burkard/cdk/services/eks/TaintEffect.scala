package io.burkard.cdk.services.eks


sealed abstract class TaintEffect(val underlying: software.amazon.awscdk.services.eks.TaintEffect)
  extends Product
    with Serializable


object TaintEffect {
  implicit def toAws(value: TaintEffect): software.amazon.awscdk.services.eks.TaintEffect =
    Option(value).map(_.underlying).orNull

  case object NoSchedule
    extends TaintEffect(software.amazon.awscdk.services.eks.TaintEffect.NO_SCHEDULE)

  case object PreferNoSchedule
    extends TaintEffect(software.amazon.awscdk.services.eks.TaintEffect.PREFER_NO_SCHEDULE)

  case object NoExecute
    extends TaintEffect(software.amazon.awscdk.services.eks.TaintEffect.NO_EXECUTE)
}
