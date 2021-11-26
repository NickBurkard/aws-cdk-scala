package io.burkard.cdk.services.s3

sealed abstract class BucketAccessControl(val underlying: software.amazon.awscdk.services.s3.BucketAccessControl)
  extends Product
    with Serializable

object BucketAccessControl {
  implicit def toAws(value: BucketAccessControl): software.amazon.awscdk.services.s3.BucketAccessControl =
    Option(value).map(_.underlying).orNull

  case object AuthenticatedRead
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.AUTHENTICATED_READ)

  case object AwsExecRead
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.AWS_EXEC_READ)

  case object BucketOwnerFullControl
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.BUCKET_OWNER_FULL_CONTROL)

  case object BucketOwnerRead
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.BUCKET_OWNER_READ)

  case object LogDeliveryWrite
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.LOG_DELIVERY_WRITE)

  case object Private
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.PRIVATE)

  case object PublicRead
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.PUBLIC_READ)

  case object PublicReadWrite
    extends BucketAccessControl(software.amazon.awscdk.services.s3.BucketAccessControl.PUBLIC_READ_WRITE)
}
