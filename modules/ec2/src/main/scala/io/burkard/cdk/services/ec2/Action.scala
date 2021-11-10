package io.burkard.cdk.services.ec2


sealed abstract class Action(val underlying: software.amazon.awscdk.services.ec2.Action)
  extends Product
    with Serializable


object Action {
  implicit def toAws(value: Action): software.amazon.awscdk.services.ec2.Action =
    Option(value).map(_.underlying).orNull

  case object Allow
    extends Action(software.amazon.awscdk.services.ec2.Action.ALLOW)

  case object Deny
    extends Action(software.amazon.awscdk.services.ec2.Action.DENY)
}
