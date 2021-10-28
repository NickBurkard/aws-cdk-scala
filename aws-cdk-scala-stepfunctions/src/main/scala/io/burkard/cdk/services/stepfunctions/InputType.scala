package io.burkard.cdk.services.stepfunctions

sealed abstract class InputType(val underlying: software.amazon.awscdk.services.stepfunctions.InputType)
  extends Product
    with Serializable

object InputType {
  implicit def toAws(value: InputType): software.amazon.awscdk.services.stepfunctions.InputType =
    Option(value).map(_.underlying).orNull

  case object Text
    extends InputType(software.amazon.awscdk.services.stepfunctions.InputType.TEXT)

  case object Object
    extends InputType(software.amazon.awscdk.services.stepfunctions.InputType.OBJECT)
}
