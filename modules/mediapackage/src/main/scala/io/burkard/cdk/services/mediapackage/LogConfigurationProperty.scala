package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LogConfigurationProperty {

  def apply(
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty.Builder)
      .logGroupName(logGroupName.orNull)
      .build()
}
