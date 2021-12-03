package io.burkard.cdk.services.mediapackage

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogConfigurationProperty {

  def apply(
    logGroupName: Option[String] = None
  ): software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty =
    (new software.amazon.awscdk.services.mediapackage.CfnPackagingGroup.LogConfigurationProperty.Builder)
      .logGroupName(logGroupName.orNull)
      .build()
}
