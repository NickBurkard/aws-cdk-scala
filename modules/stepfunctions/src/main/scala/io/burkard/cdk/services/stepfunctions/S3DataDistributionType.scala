package io.burkard.cdk.services.stepfunctions

sealed abstract class S3DataDistributionType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType)
  extends Product
    with Serializable

object S3DataDistributionType {
  implicit def toAws(value: S3DataDistributionType): software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType =
    Option(value).map(_.underlying).orNull

  case object FullyReplicated
    extends S3DataDistributionType(software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType.FULLY_REPLICATED)

  case object ShardedByS3Key
    extends S3DataDistributionType(software.amazon.awscdk.services.stepfunctions.tasks.S3DataDistributionType.SHARDED_BY_S3_KEY)
}
