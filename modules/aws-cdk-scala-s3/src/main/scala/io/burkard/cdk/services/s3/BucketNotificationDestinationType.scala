package io.burkard.cdk.services.s3

sealed abstract class BucketNotificationDestinationType(val underlying: software.amazon.awscdk.services.s3.BucketNotificationDestinationType)
  extends Product
    with Serializable

object BucketNotificationDestinationType {
  implicit def toAws(value: BucketNotificationDestinationType): software.amazon.awscdk.services.s3.BucketNotificationDestinationType =
    Option(value).map(_.underlying).orNull

  case object Lambda
    extends BucketNotificationDestinationType(software.amazon.awscdk.services.s3.BucketNotificationDestinationType.LAMBDA)

  case object Queue
    extends BucketNotificationDestinationType(software.amazon.awscdk.services.s3.BucketNotificationDestinationType.QUEUE)

  case object Topic
    extends BucketNotificationDestinationType(software.amazon.awscdk.services.s3.BucketNotificationDestinationType.TOPIC)
}
