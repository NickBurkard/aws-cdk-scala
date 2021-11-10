package io.burkard.cdk.services.iam


sealed abstract class Effect(val underlying: software.amazon.awscdk.services.iam.Effect)
  extends Product
    with Serializable


object Effect {
  implicit def toAws(value: Effect): software.amazon.awscdk.services.iam.Effect =
    Option(value).map(_.underlying).orNull

  case object Allow
    extends Effect(software.amazon.awscdk.services.iam.Effect.ALLOW)

  case object Deny
    extends Effect(software.amazon.awscdk.services.iam.Effect.DENY)
}
