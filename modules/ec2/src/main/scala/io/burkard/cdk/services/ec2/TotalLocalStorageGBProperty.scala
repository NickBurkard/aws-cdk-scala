package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TotalLocalStorageGBProperty {

  def apply(
    min: Option[Number] = None,
    max: Option[Number] = None
  ): software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty =
    (new software.amazon.awscdk.services.ec2.CfnLaunchTemplate.TotalLocalStorageGBProperty.Builder)
      .min(min.orNull)
      .max(max.orNull)
      .build()
}
