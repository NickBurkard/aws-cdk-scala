package io.burkard.cdk.services.stepfunctions

sealed abstract class DynamoItemCollectionMetrics(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics)
  extends Product
    with Serializable

object DynamoItemCollectionMetrics {
  implicit def toAws(value: DynamoItemCollectionMetrics): software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics =
    Option(value).map(_.underlying).orNull

  case object Size
    extends DynamoItemCollectionMetrics(software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics.SIZE)

  case object None
    extends DynamoItemCollectionMetrics(software.amazon.awscdk.services.stepfunctions.tasks.DynamoItemCollectionMetrics.NONE)
}
