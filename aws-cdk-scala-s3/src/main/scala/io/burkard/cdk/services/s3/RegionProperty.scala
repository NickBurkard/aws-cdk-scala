package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RegionProperty {

  def apply(
    bucket: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty =
    (new software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.Builder)
      .bucket(bucket.orNull)
      .build()
}
