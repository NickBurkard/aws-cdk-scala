package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object IncrementalPullConfigProperty {

  def apply(
    datetimeTypeFieldName: Option[String] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnIntegration.IncrementalPullConfigProperty.Builder)
      .datetimeTypeFieldName(datetimeTypeFieldName.orNull)
      .build()
}
