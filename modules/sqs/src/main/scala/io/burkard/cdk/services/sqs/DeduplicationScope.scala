package io.burkard.cdk.services.sqs

sealed abstract class DeduplicationScope(val underlying: software.amazon.awscdk.services.sqs.DeduplicationScope)
  extends Product
    with Serializable

object DeduplicationScope {
  implicit def toAws(value: DeduplicationScope): software.amazon.awscdk.services.sqs.DeduplicationScope =
    Option(value).map(_.underlying).orNull

  case object MessageGroup
    extends DeduplicationScope(software.amazon.awscdk.services.sqs.DeduplicationScope.MESSAGE_GROUP)

  case object Queue
    extends DeduplicationScope(software.amazon.awscdk.services.sqs.DeduplicationScope.QUEUE)
}
