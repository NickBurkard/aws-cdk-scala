package io.burkard.cdk.services.dynamodb

sealed abstract class StreamViewType(val underlying: software.amazon.awscdk.services.dynamodb.StreamViewType)
  extends Product
    with Serializable

object StreamViewType {
  implicit def toAws(value: StreamViewType): software.amazon.awscdk.services.dynamodb.StreamViewType =
    Option(value).map(_.underlying).orNull

  case object NewImage
    extends StreamViewType(software.amazon.awscdk.services.dynamodb.StreamViewType.NEW_IMAGE)

  case object OldImage
    extends StreamViewType(software.amazon.awscdk.services.dynamodb.StreamViewType.OLD_IMAGE)

  case object NewAndOldImages
    extends StreamViewType(software.amazon.awscdk.services.dynamodb.StreamViewType.NEW_AND_OLD_IMAGES)

  case object KeysOnly
    extends StreamViewType(software.amazon.awscdk.services.dynamodb.StreamViewType.KEYS_ONLY)
}
