package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object RegionProperty {

  def apply(
    bucket: String
  ): software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty =
    (new software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint.RegionProperty.Builder)
      .bucket(bucket)
      .build()
}
