package io.burkard.cdk.services.stepfunctions

sealed abstract class BatchStrategy(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy)
  extends Product
    with Serializable

object BatchStrategy {
  implicit def toAws(value: BatchStrategy): software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy =
    Option(value).map(_.underlying).orNull

  case object MultiRecord
    extends BatchStrategy(software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy.MULTI_RECORD)

  case object SingleRecord
    extends BatchStrategy(software.amazon.awscdk.services.stepfunctions.tasks.BatchStrategy.SINGLE_RECORD)
}
