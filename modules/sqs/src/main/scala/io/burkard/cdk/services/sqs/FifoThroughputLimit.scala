package io.burkard.cdk.services.sqs


sealed abstract class FifoThroughputLimit(val underlying: software.amazon.awscdk.services.sqs.FifoThroughputLimit)
  extends Product
    with Serializable


object FifoThroughputLimit {
  implicit def toAws(value: FifoThroughputLimit): software.amazon.awscdk.services.sqs.FifoThroughputLimit =
    Option(value).map(_.underlying).orNull

  case object PerQueue
    extends FifoThroughputLimit(software.amazon.awscdk.services.sqs.FifoThroughputLimit.PER_QUEUE)

  case object PerMessageGroupId
    extends FifoThroughputLimit(software.amazon.awscdk.services.sqs.FifoThroughputLimit.PER_MESSAGE_GROUP_ID)
}
