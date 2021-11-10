package io.burkard.cdk.services.stepfunctions


sealed abstract class StateMachineType(val underlying: software.amazon.awscdk.services.stepfunctions.StateMachineType)
  extends Product
    with Serializable


object StateMachineType {
  implicit def toAws(value: StateMachineType): software.amazon.awscdk.services.stepfunctions.StateMachineType =
    Option(value).map(_.underlying).orNull

  case object Express
    extends StateMachineType(software.amazon.awscdk.services.stepfunctions.StateMachineType.EXPRESS)

  case object Standard
    extends StateMachineType(software.amazon.awscdk.services.stepfunctions.StateMachineType.STANDARD)
}
