package io.burkard.cdk.services.stepfunctions

sealed abstract class S3DataType(val underlying: software.amazon.awscdk.services.stepfunctions.tasks.S3DataType)
  extends Product
    with Serializable

object S3DataType {
  implicit def toAws(value: S3DataType): software.amazon.awscdk.services.stepfunctions.tasks.S3DataType =
    Option(value).map(_.underlying).orNull

  case object AugmentedManifestFile
    extends S3DataType(software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.AUGMENTED_MANIFEST_FILE)

  case object ManifestFile
    extends S3DataType(software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.MANIFEST_FILE)

  case object S3Prefix
    extends S3DataType(software.amazon.awscdk.services.stepfunctions.tasks.S3DataType.S3_PREFIX)
}
