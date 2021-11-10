package io.burkard.cdk.services.s3


sealed abstract class StorageClass(val underlying: software.amazon.awscdk.services.s3.deployment.StorageClass)
  extends Product
    with Serializable


object StorageClass {
  implicit def toAws(value: StorageClass): software.amazon.awscdk.services.s3.deployment.StorageClass =
    Option(value).map(_.underlying).orNull

  case object Standard
    extends StorageClass(software.amazon.awscdk.services.s3.deployment.StorageClass.STANDARD)

  case object ReducedRedundancy
    extends StorageClass(software.amazon.awscdk.services.s3.deployment.StorageClass.REDUCED_REDUNDANCY)

  case object StandardIa
    extends StorageClass(software.amazon.awscdk.services.s3.deployment.StorageClass.STANDARD_IA)

  case object OnezoneIa
    extends StorageClass(software.amazon.awscdk.services.s3.deployment.StorageClass.ONEZONE_IA)

  case object IntelligentTiering
    extends StorageClass(software.amazon.awscdk.services.s3.deployment.StorageClass.INTELLIGENT_TIERING)

  case object Glacier
    extends StorageClass(software.amazon.awscdk.services.s3.deployment.StorageClass.GLACIER)

  case object DeepArchive
    extends StorageClass(software.amazon.awscdk.services.s3.deployment.StorageClass.DEEP_ARCHIVE)
}
