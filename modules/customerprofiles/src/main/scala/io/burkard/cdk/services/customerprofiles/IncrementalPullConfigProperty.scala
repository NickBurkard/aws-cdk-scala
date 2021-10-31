package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IncrementalPullConfigProperty {

  def apply(
    datetimeTypeFieldName: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty.Builder)
      .datetimeTypeFieldName(datetimeTypeFieldName.orNull)
      .build()
}
