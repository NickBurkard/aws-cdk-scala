package io.burkard.cdk.services.cloudtrail

sealed abstract class DataResourceType(val underlying: software.amazon.awscdk.services.cloudtrail.DataResourceType)
  extends Product
    with Serializable

object DataResourceType {
  implicit def toAws(value: DataResourceType): software.amazon.awscdk.services.cloudtrail.DataResourceType =
    Option(value).map(_.underlying).orNull

  case object LambdaFunction
    extends DataResourceType(software.amazon.awscdk.services.cloudtrail.DataResourceType.LAMBDA_FUNCTION)

  case object S3Object
    extends DataResourceType(software.amazon.awscdk.services.cloudtrail.DataResourceType.S3_OBJECT)
}
