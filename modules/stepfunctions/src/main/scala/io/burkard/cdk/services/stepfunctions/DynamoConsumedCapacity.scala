package io.burkard.cdk.services.stepfunctions


sealed abstract class DynamoConsumedCapacity(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity)
  extends Product
    with Serializable


object DynamoConsumedCapacity {
  implicit def toAws(value: DynamoConsumedCapacity): software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity =
    Option(value).map(_.underlying).orNull

  case object Indexes
    extends DynamoConsumedCapacity(software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.INDEXES)

  case object Total
    extends DynamoConsumedCapacity(software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.TOTAL)

  case object None
    extends DynamoConsumedCapacity(software.amazon.awscdk.services.stepfunctions.tasks.DynamoConsumedCapacity.NONE)
}
