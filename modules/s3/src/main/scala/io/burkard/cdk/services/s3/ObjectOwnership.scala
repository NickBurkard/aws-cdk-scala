package io.burkard.cdk.services.s3


sealed abstract class ObjectOwnership(val underlying: software.amazon.awscdk.services.s3.ObjectOwnership)
  extends Product
    with Serializable


object ObjectOwnership {
  implicit def toAws(value: ObjectOwnership): software.amazon.awscdk.services.s3.ObjectOwnership =
    Option(value).map(_.underlying).orNull

  case object BucketOwnerPreferred
    extends ObjectOwnership(software.amazon.awscdk.services.s3.ObjectOwnership.BUCKET_OWNER_PREFERRED)

  case object ObjectWriter
    extends ObjectOwnership(software.amazon.awscdk.services.s3.ObjectOwnership.OBJECT_WRITER)
}
