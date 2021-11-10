package io.burkard.cdk.services.stepfunctions


sealed abstract class DynamoReturnValues(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues)
  extends Product
    with Serializable


object DynamoReturnValues {
  implicit def toAws(value: DynamoReturnValues): software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues =
    Option(value).map(_.underlying).orNull

  case object None
    extends DynamoReturnValues(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.NONE)

  case object AllOld
    extends DynamoReturnValues(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.ALL_OLD)

  case object UpdatedOld
    extends DynamoReturnValues(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.UPDATED_OLD)

  case object AllNew
    extends DynamoReturnValues(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.ALL_NEW)

  case object UpdatedNew
    extends DynamoReturnValues(software.amazon.awscdk.services.stepfunctions.tasks.DynamoReturnValues.UPDATED_NEW)
}
